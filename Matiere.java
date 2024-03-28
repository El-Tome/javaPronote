/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpSurClasses;

/**
 *
 * @author t.chaumette
 */
public class Matiere  implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String nom;
    public Matiere(String matiere){
        this.nom = matiere;
    }
    
    public String getMatiere()
    {
        return this.nom;
    }
    
    @Override
    public String toString()
    {
        return this.nom;
    }
}
