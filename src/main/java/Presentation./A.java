package Presentation;

import annotation.Controller;
import annotation.UrlMapping;
import annotation.WebAPI;
import jakarta.servlet.http.HttpServletRequest;
import Utils.ModelAndView;
import Utils.Utilitaire;
import Utils.Session;

import org.springframework.context.ApplicationContext;
import Service.MessageService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class A {

    @UrlMapping(value = "/login", method = "POST")
    public ModelAndView login(ApplicationContext springContext) {
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
    public void login2(ApplicationContext springContext) {
        System.out.println("methode login2 éxécuté avec succes");

    }

    @UrlMapping("/replace")
    public void replace(ApplicationContext springContext) {
        System.out.println("methode replace éxécuté avec succes");

    }

    @WebAPI
    @UrlMapping("/andrana")
    public Map<String, String> andrana(ApplicationContext springContext) {
        System.out.println("methode andrana éxécuté avec succes");

        ApplicationContext context = (ApplicationContext) springContext;
        MessageService messageService = context.getBean(MessageService.class);

        Map<String, String> infosAccueil = messageService.getInfosAccueil();
        return infosAccueil;
    }

    @UrlMapping(value = "/form", method = "GET")
    public ModelAndView form(ApplicationContext springContext) {

        ModelAndView mv = new ModelAndView("form");
        return mv;
    }

    @WebAPI
    @UrlMapping(value = "/save", method = "POST")
    public ResponseData save(Etudiant etudiant, Parent parent, ApplicationContext springContext) {
        System.out.println("methode save éxécuté avec succes");

        return new ResponseData(etudiant, parent);
    }

    @UrlMapping(value = "/formList", method = "GET")
    public ModelAndView formList(ApplicationContext springContext) {

        ModelAndView mv = new ModelAndView("formList");
        return mv;
    }

    @WebAPI
    @UrlMapping(value = "/saveList", method = "POST")
    public List<Etudiant> saveList(List<Etudiant> etudiants, ApplicationContext springContext) {
        System.out.println("methode save éxécuté avec succes");
        if (etudiants != null) {
            for (Etudiant e : etudiants) {
                System.out.println("Étudiant reçu -> Nom : " + e.getNom() + ", Âge : " + e.getAge());
            }
        }
        return etudiants;
    }

    @UrlMapping(value = "/formExtends", method = "GET")
    public ModelAndView formExtends(ApplicationContext springContext) {

        ModelAndView mv = new ModelAndView("formExtends");
        return mv;
    }

    @WebAPI
    @UrlMapping(value = "/saveExtends", method = "POST")
    public Employe saveList(Employe employe, ApplicationContext springContext) {
        System.out.println("methode save éxécuté avec succes");
        if (employe != null) {

            System.out.println("Employe reçu -> Nom : " + employe.getPersonne().getNom() + ", Âge : "
                    + employe.getPersonne().getAge() + ",Poste : " + employe.getPoste());

        }
        return employe;
    }

    @UrlMapping(value = "/formFile", method = "GET")
    public ModelAndView formFile(ApplicationContext springContext) {

        ModelAndView mv = new ModelAndView("formFile");
        return mv;
    }

    @WebAPI
    @UrlMapping(value = "/saveFile", method = "POST")
    public EmployeFile saveFile(EmployeFile employefile,Session session, ApplicationContext springContext) {
        System.out.println("methode save éxécuté avec succes");
        if (employefile != null) {
            String nomFichier = "Aucun fichier";

            if (employefile.getMapfile() != null) {
                nomFichier = employefile.getMapfile().getNom();
                Utilitaire utilitaire = new Utilitaire();
                utilitaire.sauvegarderMapFile(employefile.getMapfile());
            }
            System.out.println("Employe reçu -> Nom : " + employefile.getNom()
                    + ", Prenom : " + employefile.getPrenom());

            String user = (String) session.get("username");
            String role = (String) session.get("role");

            if (user != null) {
                System.out.println( "Bienvenue " + user + ", ton rôle est : " + role);
            } else {
                System.out.println( "Aucune session trouvée. Tu n'es pas connecté !");
            }

        }
        return employefile;
    }

    @WebAPI
    @UrlMapping(value = "/login-test")
    public String session(Session session) {
        session.set("username", "Fiore");
        session.set("role", "Admin");

        return "Données enregistrées en session avec succès !";
    }

    @WebAPI
    @UrlMapping(value = "/profil-test")
    public String testerProfil(Session session) {

        String user = (String) session.get("username");
        String role = (String) session.get("role");

        if (user != null) {
            return "Bienvenue " + user + ", ton rôle est : " + role;
        } else {
            return "Aucune session trouvée. Tu n'es pas connecté !";
        }
    }
}
