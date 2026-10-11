package Presentation;
public class Parent{
    private String nom;
    private int age;

    public Parent(String name, int age) {
        this.nom = name;
        this.age = age;
    }
    public Parent(){

    }
    public String getNom() {
        return nom;
    }

    public void setNom(String name) {
        this.nom = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

  
    
}