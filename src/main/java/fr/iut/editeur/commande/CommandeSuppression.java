package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeSuppression extends CommandeDocument{
    public CommandeSuppression(Document document, String[] parameters){
        super(document,parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3){
            System.err.println("Format attendu : remplacer;numero char debut;numero char fin;texte");
            return;
        }
        this.document.suppression(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]));
        super.executer();

    }
}
