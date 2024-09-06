package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class commandeclear extends CommandeDocument {

    public commandeclear(Document d,String[] p){
        super(d,p);
    }

    @Override
    public void executer(){
        document.suppression(0,parameters[0].length()-2);

        super.executer();
    }
}
