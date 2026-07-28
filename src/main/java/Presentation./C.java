package Presentation;
import annotation.Controller;
import annotation.UrlMapping;

@Controller
public class C {
    @UrlMapping(value ="/create",method = "GET")
    public void create(Object springContext){
        System.out.println("methode create éxécuté avec succes");

    }
    @UrlMapping(value = "/afindra",method = "POST")
    public void afindra(Object springContext){
        System.out.println("methode afindra éxécuté avec succes");

    }
    
}
