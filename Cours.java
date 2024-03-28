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
public class Cours implements java.io.Serializable  {
    private static final long serialVersionUID = 1L;
    private String dateEtHeure;
    private ArrayList<Salle> salles;
    private ArrayList<Prof> profs;
    private ArrayList<Groupe> groupes;
    private Matiere matiere;
    
    Cours(String dateHeure, Matiere matiere){
        this.dateEtHeure = dateHeure;
        salles = new ArrayList<>();
        profs = new ArrayList<>();
        groupes = new ArrayList<>();
        this.matiere = matiere;
    }
    public void addSalle(Salle salle){
        salles.add(salle);
    }
    
    public void addProfs(Prof prof){
        profs.add(prof);
    }
    
    public void addGroupes(Groupe groupe){
        groupes.add(groupe);
    }
    
    @Override
    public String toString()
    {
        String message = "Date et heure : " + this.dateEtHeure;
        message = message + " | Cours de : " + matiere.toString();
        
        message = message + " | avec : "; 
        for (Prof prof : profs) {
            message = message + prof.getNom() + ", ";
        }
        
        message = message + "| en ";
        for (Salle salle : salles){
            message = message + salle.getSalle() + ", ";
        }
        
        message = message + "| avec le(s) groupe(s) de : ";
        for (Groupe groupe : groupes){
            message = message + groupe.getNomGroupe() + ", ";
        }
        
        return message;
    }
}
