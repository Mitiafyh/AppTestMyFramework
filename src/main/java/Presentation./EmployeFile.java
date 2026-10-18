package Presentation;

import Utils.MapFile;

public class EmployeFile {
   String nom;
   String prenom;
   MapFile file;

   public EmployeFile(String nom, String prenom, MapFile file) {
    this.nom = nom;
    this.prenom = prenom;
    this.file = file;
}
    public EmployeFile(){

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
   public MapFile getMapfile() {
    return file;
   }
   public void setMapfile(MapFile file) {
    this.file = file;
   }

}
