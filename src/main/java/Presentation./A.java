package Presentation;

import annotation.Controller;
import annotation.UrlMapping;
import annotation.WebAPI;
import Utils.ModelAndView;
import org.springframework.context.ApplicationContext;
import Service.MessageService;
import java.util.Map;

@Controller
public class A {

    @UrlMapping(value = "/login", method = "POST")
    public ModelAndView login(Object springContext) {
        System.out.println("methode login éxécuté avec succes");

        ApplicationContext context = (ApplicationContext) springContext;
        MessageService messageService = context.getBean(MessageService.class);

        Map<String, String> infosAccueil = messageService.getInfosAccueil();

        ModelAndView mv = new ModelAndView("accueil");
        mv.addItem("message", infosAccueil.get("msg"));
        mv.addItem("status", infosAccueil.get("status"));

        return mv;
    }


    @UrlMapping(value = "/login", method = "GET")
    public void login2(Object springContext) {
        System.out.println("methode login2 éxécuté avec succes");

    }

    @UrlMapping("/replace")
    public void replace(Object springContext) {
        System.out.println("methode replace éxécuté avec succes");

    }

    @WebAPI
    @UrlMapping("/andrana")
    public Map<String, String> andrana(Object springContext) {
        System.out.println("methode andrana éxécuté avec succes");
       
        ApplicationContext context = (ApplicationContext) springContext;
        MessageService messageService = context.getBean(MessageService.class);

        Map<String, String> infosAccueil = messageService.getInfosAccueil();
        return infosAccueil;
    }

    @UrlMapping(value = "/form", method = "GET")
    public ModelAndView form(Object springContext){

        ModelAndView mv = new ModelAndView("form");
        return mv;
    }

    @UrlMapping(value = "/save", method = "POST")
    public void save(String nom, String prenom){
        System.out.println("methode save éxécuté avec succes");
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        
    }
}
