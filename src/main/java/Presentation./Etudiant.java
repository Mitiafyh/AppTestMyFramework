package Presentation;
import annotation.Controller;

@Controller
public class Etudiant {
    String nom;
    String prenom;
    int age;
    double moyenne;

    
    public Etudiant(String nom, String prenom, int age, double moyenne) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.moyenne = moyenne;
    }
    public Etudiant() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    

}
