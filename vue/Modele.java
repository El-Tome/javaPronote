/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpSurClasses.vue;

import java.util.ArrayList;
import tpSurClasses.Cours;
import tpSurClasses.Eleve;
import tpSurClasses.Groupe;
import tpSurClasses.Matiere;
import tpSurClasses.Prof;
import tpSurClasses.Salle;

/**
 *
 * @author t.chaumette
 */
public class Modele implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private final ArrayList<Prof> profs;
    private final ArrayList<Eleve> eleves;
    private final ArrayList<Groupe> groupes;
    private final ArrayList<Salle> salles;
    private final ArrayList<Matiere> matieres;
    private final ArrayList<Cours> cours;
    
    public Modele() {
        this.profs = new ArrayList<>();
        this.eleves = new ArrayList<>();
        this.groupes = new ArrayList<>();
        this.salles = new ArrayList<>();
        this.matieres = new ArrayList<>();
        this.cours = new ArrayList<>();
    }
    
    
    // -------------------------------------------------------------------------
    
    public ArrayList<Prof> getProfs()
    {
        return this.profs;
    }
    
    public void addProf(Prof p)
    {
        this.profs.add(p);
    }
    
    public Prof getProf(String nom)
    {
        for (Prof p : profs)
        {
            if(nom == p.getNom())
            {
                return p;
            }
        }
        return null;
    }
    
    public void supprProf(String nom)
    {
        Prof p = getProf(nom);
        this.profs.remove(p);
    }
    
    
    // -------------------------------------------------------------------------
    
    public ArrayList<Eleve> getEleves()
    {
        return this.eleves;
    }
    
    public void addEleve(Eleve e)
    {
        this.eleves.add(e);
    }
    
    public Eleve getEleve(String nom)
    {
        for (Eleve e : eleves)
        {
            if(nom == e.getNom())
            {
                return e;
            }
        }
        return null;
    }
    
    public void supprEleve(String nom)
    {
        Eleve e = getEleve(nom);
        this.eleves.remove(e);
    }
    
    
    // -------------------------------------------------------------------------
    
    public ArrayList<Groupe> getGroupes()
    {
        return this.groupes;
    }
    
    public void addGroupe(Groupe g)
    {
        this.groupes.add(g);
    }
    
    public Groupe getGroupe(String nom)
    {
        for (Groupe g : this.groupes)
        {
            if (nom == g.getNomGroupe())
            {
                return g;
            }
        }
        return null;
    }
    
    public void supprGroup(String nom)
    {
        Groupe g = getGroupe(nom);
        this.groupes.remove(g);
    }
    
    
    // -------------------------------------------------------------------------
    
    public ArrayList<Salle> getSalles()
    {
        return this.salles;
    }
    
    public void addSalle(Salle s)
    {
        this.salles.add(s);
    }
    
    public Salle getSalle(String num)
    {
        for (Salle s : this.salles)
        {
            if (num == s.getSalle())
            {
                return s;
            }
        }
        return null;
    }
    
    public void supprSalle(String num)
    {
        Salle s = getSalle(num);
        this.salles.remove(s);
    }
    
    
    
    // -------------------------------------------------------------------------
    public ArrayList<Matiere> getMatieres()
    {
        return this.matieres;
    }
    
    public void addMat(Matiere m)
    {
        this.matieres.add(m);
    }
    
    public Matiere getMat(String nom)
    {
        for (Matiere m : this.matieres)
        {
            if (nom == m.getMatiere())
            {
                return m;
            }
        }
        return null;
    }
    
    public void supprMat(String nom)
    {
        Matiere m = getMat(nom);
        this.matieres.remove(m);
    }
}
