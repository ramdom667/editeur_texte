package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    /**
     *creatCommand permet de crée les command a rentrée dans le terminal
     *il faut donc crée toujours une nouvelle case pour chaque nouvelles commands
     */

    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            case "remplacer" : return new CommandeRemplacer(document,parameters);
            case "majuscule" : return new CommandeMajuscule(document,parameters);
            case "suppression" : return new CommandeSuppression(document,parameters);
            case "clear" : return new commandeclear(document,parameters);
            default: return null;
        }
    }

}
