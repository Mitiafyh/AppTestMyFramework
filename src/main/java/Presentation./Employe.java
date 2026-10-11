package Presentation;

public class Employe {
    Personne personne;
    String poste;

    public Employe(Personne personne, String poste) {
        this.personne = personne;
        this.poste = poste;
    }
    public Employe(){

    }

    public Personne getPersonne() {
        return personne;
    }
    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    public String getPoste() {
        return poste;
    }
    public void setPoste(String poste) {
        this.poste = poste;
    }
}
