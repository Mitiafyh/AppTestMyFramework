package Presentation;

import Utils.ModelAndView;
import Utils.Session;
import annotation.Auth;
import annotation.Controller;
import annotation.WebAPI;
import annotation.UrlMapping;

@Controller
public class AuthController {

    @UrlMapping(value = "/loginAuth", method = "POST")
    public ModelAndView login(Session session, String username, String password) {

        if ("admin".equals(username) && "1234".equals(password)) {

            session.set("userConnecte", username);
            session.set("roleUser","User");

            ModelAndView mv = new ModelAndView("redirect:/formFile");
            mv.addItem("utilisateur", username);
            return mv;

        } else {
            ModelAndView mv = new ModelAndView("formLogin");
            mv.addItem("erreur", "Nom d'utilisateur ou mot de passe incorrect !");
            return mv;
        }
    }

    @WebAPI
    @UrlMapping(value = "/logout")
    public String logout(Session session) {
        session.remove("userConnecte");
        session.remove("roleUser");
        return "Déconnecté !";
    }
}