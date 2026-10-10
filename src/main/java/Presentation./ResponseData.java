package Presentation;
public class ResponseData {
    private Etudiant etudiant;
    private Parent parent;

    public ResponseData(Etudiant etudiant, Parent parent) {
        this.etudiant = etudiant;
        this.parent = parent;
    }
    public Etudiant getEtudiant() { return etudiant; }
    public Parent getParent() { return parent; }
}