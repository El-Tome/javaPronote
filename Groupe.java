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
public class Groupe  implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String nom;
    private ArrayList<Eleve> listeEleve;
    
    public Groupe(String nom){
        this.nom = nom;
        listeEleve = new ArrayList<>();
    }
    
    public void addEleve(Eleve eleve){
        listeEleve.add(eleve);
    }
    
    public String getNomGroupe(){
        return this.nom;
    }
}
