/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpSurClasses;

/**
 *
 * @author t.chaumette
 */
public class Salle implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private String numero;
    public Salle(String num){
        this.numero = num;
    }
    
    public String getSalle(){
        return this.numero;
    }
}
