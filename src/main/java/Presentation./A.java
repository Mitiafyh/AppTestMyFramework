package Presentation;

import annotation.Controller;
import annotation.UrlMapping;
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

    @UrlMapping("/andrana")
    public void andrana(Object springContext) {
        System.out.println("methode andrana éxécuté avec succes");

    }
}
