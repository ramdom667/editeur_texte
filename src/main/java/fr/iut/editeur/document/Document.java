package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     *remplace la partie du texte selectionnée par debut et fin étant l'emplacement des caractere a modifié
     * ces caractères sont supprimé afin d'etre modifié par remplacement
     */
    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }
    public void majuscules(int debut, int fin) {
        String partiemaj= texte.substring(debut,fin+1);
        partiemaj= partiemaj.toUpperCase();
        this.remplacer(debut,fin,partiemaj);

    }

    /**
     * supprime tout entre le caractere numero debut et fin
     * on reutiliser remplacer afin de faire aucun duplication de code
     */
    public void suppression(int debut, int fin){
        this.remplacer(debut,fin,"");
    }
}
