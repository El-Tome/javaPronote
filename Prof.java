/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpSurClasses;

/**
 *
 * @author t.chaumette
 */
public class Prof extends Individu implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String matiereEnseignee;
    
    public Prof(String matiere, String nom){
        super(nom);
        this.matiereEnseignee = matiere;
    }
}
