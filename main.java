/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpSurClasses;

/**
 *
 * @author t.chaumette
 */
public class main {
   public static void main(String [] args){
    Eleve eleve1 = new Eleve("BTS SIO 1", "Tom Chaumette");
    Eleve eleve2 = new Eleve("BTS SIO 1", "Killian Biondo");
    
    Groupe slam = new Groupe("SLAM");
    
    Prof prof1 = new Prof("SLAM", "Pierre Chetrit");
    Prof prof2 = new Prof("SLAM", "Gilles Gaillard");
    
    Matiere slamMatiere = new Matiere("SLAM");
    
    Salle n180 = new Salle("180");
    
    eleve1.addGroupe(slam);
    eleve2.addGroupe(slam);
    
    Cours premierCours = new Cours("le 21/03 de 8h - 12h", slamMatiere);
    premierCours.addProfs(prof1);
    premierCours.addGroupes(slam);
    premierCours.addSalle(n180);
    
    Cours deuxiemeCours = new Cours("Le 21/03 de 13h - 17h", slamMatiere);
    deuxiemeCours.addProfs(prof2);
    deuxiemeCours.addGroupes(slam);
    deuxiemeCours.addSalle(n180);
    
    System.out.println(premierCours);
    System.out.println(deuxiemeCours);
   }
}
