/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpSurClasses;

import java.util.ArrayList;

/**
 *
 * @author t.chaumette
 */
public class Eleve extends Individu  implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String nomClasse;
    private ArrayList<Groupe> listesGroupes;
    
    public Eleve(String nomClasse, String nom) {
        super(nom);
        this.nomClasse = nomClasse;
        listesGroupes = new ArrayList<>();
    }
    
    public void addGroupe(Groupe groupe){
        listesGroupes.add(groupe);
    }
    
    public String getNomClasse(){
        return this.nomClasse;
    }

    public ArrayList<Groupe> getListesGroupes(){
        return this.listesGroupes;
    }

    public void removeGroupe(Groupe groupe){
        listesGroupes.remove(groupe);
    }
}
