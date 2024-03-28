/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpSurClasses;

/**
 *
 * @author t.chaumette
 */
public class Individu  implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String nom;
    
    Individu(String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return this.nom;
    }
}
