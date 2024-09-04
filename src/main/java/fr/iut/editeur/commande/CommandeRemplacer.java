package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters){
        super(document,parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 4){
            System.err.println("Format attendu : remplacer;numero char debut;numero char fin;texte");
            return;
        }
        this.document.remplacer(Integer.parseInt(parameters[2]),Integer.parseInt(parameters[3]),parameters[1]);
        super.executer();

    }


}
