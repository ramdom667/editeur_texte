package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeMajuscule extends CommandeDocument{

    public CommandeMajuscule(Document d,String[] s){
        super(d,s);
    }

    @Override
    public void executer(){
        if(parameters.length<3){
            System.err.println("mauvaise parametre passé");
            return;
        }
        this.document.majuscules(Integer.parseInt(parameters[1]),Integer.parseInt(parameters[2]));
        super.executer();
    }
}
