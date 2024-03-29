/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tpSurClasses.vue;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import tpSurClasses.Prof;
import tpSurClasses.Eleve;
import tpSurClasses.Groupe;
import tpSurClasses.Salle;
import tpSurClasses.Matiere;

/**
 *
 * @author t.chaumette
 */
public class administrationProfEleve extends javax.swing.JFrame {
    
    private Modele modele;
    /**
     * Creates new form administrationSalles
     */
    public administrationProfEleve() {
        modele = new Modele();
        initComponents();
        updateComponents();
        loadModele();
    }
    
    private void saveModele()
    {
        try
        {
            RessouceManager.save(this.modele, "modele.save");
        }
        catch (Exception e)
        {
            System.out.println("Erreur lors de la sauvegarde du modele : " + e.getMessage());
        }
    }

    private void loadModele()
    {
        try
        {
            this.modele = (Modele) RessouceManager.load("modele.save");
            updateComponents();
        }
        catch (Exception e)
        {
            System.out.println("Erreur lors du chargement du modele : " + e.getMessage());
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profTexte = new javax.swing.JLabel();
        profNom = new javax.swing.JTextField();
        profMatiere = new javax.swing.JTextField();
        profAjout = new javax.swing.JButton();
        profListe = new javax.swing.JScrollPane();
        profList = new javax.swing.JList<>();
        profSuppr = new javax.swing.JButton();
        eleveTexte = new javax.swing.JLabel();
        eleveNom = new javax.swing.JTextField();
        eleveClasse = new javax.swing.JTextField();
        eleveAjout = new javax.swing.JButton();
        eleveListe = new javax.swing.JScrollPane();
        eleveList = new javax.swing.JList<>();
        eleveSuppr = new javax.swing.JButton();
        groupeTexte = new javax.swing.JLabel();
        groupeNom = new javax.swing.JTextField();
        groupeAjouter = new javax.swing.JButton();
        groupeListe = new javax.swing.JScrollPane();
        groupeList = new javax.swing.JList<>();
        groupeSuppr = new javax.swing.JButton();
        salleTexte = new javax.swing.JLabel();
        salleNum = new javax.swing.JTextField();
        salleAjout = new javax.swing.JButton();
        salleListe = new javax.swing.JScrollPane();
        salleList = new javax.swing.JList<>();
        salleSuppr = new javax.swing.JButton();
        matTexte = new javax.swing.JLabel();
        matNom = new javax.swing.JTextField();
        matAjouter = new javax.swing.JButton();
        matListe = new javax.swing.JScrollPane();
        matList = new javax.swing.JList<>();
        matSuppr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        profTexte.setText("Enseignant");

        profNom.setText("nom");

        profMatiere.setText("matière");

        profAjout.setText("ajouter");
        profAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profAjoutActionPerformed(evt);
            }
        });

        profList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        profListe.setViewportView(profList);

        profSuppr.setText("Supprimer");
        profSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profSupprActionPerformed(evt);
            }
        });

        eleveTexte.setText("eleve");

        eleveNom.setText("nom");

        eleveClasse.setText("classe");

        eleveAjout.setText("ajouter");
        eleveAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleveAjoutActionPerformed(evt);
            }
        });

        eleveList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        eleveListe.setViewportView(eleveList);

        eleveSuppr.setText("Supprimer");
        eleveSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eleveSupprActionPerformed(evt);
            }
        });

        groupeTexte.setText("groupe");

        groupeNom.setText("nom");

        groupeAjouter.setText("ajouter");
        groupeAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupeAjouterActionPerformed(evt);
            }
        });

        groupeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        groupeListe.setViewportView(groupeList);

        groupeSuppr.setText("Supprimer");
        groupeSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupeSupprActionPerformed(evt);
            }
        });

        salleTexte.setText("salle");

        salleNum.setText("numero");

        salleAjout.setText("ajouter");
        salleAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleAjoutActionPerformed(evt);
            }
        });

        salleList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        salleListe.setViewportView(salleList);

        salleSuppr.setText("Supprimer");
        salleSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salleSupprActionPerformed(evt);
            }
        });

        matTexte.setText("matière");

        matNom.setText("nom");

        matAjouter.setText("ajouter");
        matAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matAjouterActionPerformed(evt);
            }
        });

        matList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        matListe.setViewportView(matList);

        matSuppr.setText("Supprimer");
        matSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matSupprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(profSuppr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(profListe)
                    .addComponent(profAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(profNom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(profTexte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eleveNom, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eleveClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eleveTexte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eleveAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eleveListe)
                    .addComponent(eleveSuppr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(groupeTexte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(groupeNom, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupeAjouter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(groupeListe)
                    .addComponent(groupeSuppr, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salleNum)
                    .addComponent(salleTexte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salleAjout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salleListe)
                    .addComponent(salleSuppr, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matNom)
                    .addComponent(matTexte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matListe)
                    .addComponent(matSuppr, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profTexte)
                            .addComponent(groupeTexte, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salleTexte)
                            .addComponent(matTexte)
                            .addComponent(eleveTexte))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(profMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupeNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eleveNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eleveClasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(profAjout)
                        .addGap(18, 18, 18)
                        .addComponent(profListe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eleveAjout)
                            .addComponent(groupeAjouter)
                            .addComponent(salleAjout)
                            .addComponent(matAjouter))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eleveListe, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(groupeListe)
                            .addComponent(salleListe)
                            .addComponent(matListe))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profSuppr)
                    .addComponent(eleveSuppr)
                    .addComponent(groupeSuppr)
                    .addComponent(salleSuppr)
                    .addComponent(matSuppr))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateComponents()
    {
        updateComponentsProf();
        updateComponentsEleve();
        updateComponentsGroupe();
        updateComponentsSalle();
        updateComponentMat();
    }
    
    
    
    /**
     * Les methodes suivante gère la partie prof
     * 
     */
    private void updateComponentsProf()
    {
        DefaultListModel listModel = new DefaultListModel();
        profList.setModel(listModel);
        for (Prof p : modele.getProfs())
        { 
            listModel.addElement(p.getNom());
        }
        
    }
    
    private void profAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profAjoutActionPerformed
        String name = profNom.getText();
        String mat = profMatiere.getText();
        
        Prof prof = new Prof(mat, name);
        
        modele.addProf(prof);
        saveModele();

        updateComponentsProf();
    }//GEN-LAST:event_profAjoutActionPerformed

    private void profSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profSupprActionPerformed
        String nom = profList.getSelectedValue();
        modele.supprProf(nom);
        saveModele();
        updateComponentsProf();
    }//GEN-LAST:event_profSupprActionPerformed

    
    
    /**
     * Les methodes suivante gère la partie eleve
     *  
     */
    private void updateComponentsEleve()
    {
        DefaultListModel listMode2 = new DefaultListModel();
        eleveList.setModel(listMode2);
        
        for (Eleve e : modele.getEleves())
        {
            listMode2.addElement(e.getNom());
        }
    }
    
    private void eleveAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleveAjoutActionPerformed
        String name = eleveNom.getText();
        String classe = eleveClasse.getText();

        Eleve eleve = new Eleve(classe, name);
        
        modele.addEleve(eleve);
        saveModele();

        updateComponentsEleve();
    }//GEN-LAST:event_eleveAjoutActionPerformed

    private void eleveSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eleveSupprActionPerformed
        String nom = eleveList.getSelectedValue();
        modele.supprEleve(nom);
        saveModele();
        updateComponentsEleve();
    }//GEN-LAST:event_eleveSupprActionPerformed

    
    
    /**
     * Les methode suivante gère la partie groupe
     */
    
    private void updateComponentsGroupe()
    {
        DefaultListModel listMode3 = new DefaultListModel();
        groupeList.setModel(listMode3);
        
        for (Groupe g : modele.getGroupes())
        {
            listMode3.addElement(g.getNomGroupe());
        }
    }
    
    private void groupeAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupeAjouterActionPerformed
        String name = groupeNom.getText();
        
        Groupe g = new Groupe(name);
        
        modele.addGroupe(g);
        saveModele();

        updateComponentsGroupe();
        
    }//GEN-LAST:event_groupeAjouterActionPerformed

    private void groupeSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupeSupprActionPerformed
        String name = groupeList.getSelectedValue();
        modele.supprGroup(name);
        saveModele();
        updateComponentsGroupe();
    }//GEN-LAST:event_groupeSupprActionPerformed

    
    /**
     * Les methode suivante gère les salles
     * 
     */
    
    public void updateComponentsSalle()
    {
        DefaultListModel listMode4 = new DefaultListModel();
        salleList.setModel(listMode4);
        
        for (Salle s : modele.getSalles())
        {
            listMode4.addElement(s.getSalle());
        }
    }
    
    private void salleAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleAjoutActionPerformed
        String num = salleNum.getText();
        
        Salle s = new Salle(num);
        
        modele.addSalle(s);
        saveModele();

        updateComponentsSalle();
    }//GEN-LAST:event_salleAjoutActionPerformed

    private void salleSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salleSupprActionPerformed
        String num = salleList.getSelectedValue();
        modele.supprSalle(num);
        saveModele();
        updateComponentsSalle();
    }//GEN-LAST:event_salleSupprActionPerformed

    
    
    /**
     * Les methode suivante gère les matières
     * 
     */
    
    public void updateComponentMat()
    {
        DefaultListModel listMode5 = new DefaultListModel();
        matList.setModel(listMode5);
        
        for (Matiere m : modele.getMatieres())
        {
            listMode5.addElement(m.getMatiere());
        }
    }
    
    private void matAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matAjouterActionPerformed
        String nom = matNom.getText();
        
        Matiere mat = new Matiere(nom);
        
        modele.addMat(mat);
        saveModele();

        updateComponentMat();
    }//GEN-LAST:event_matAjouterActionPerformed

    private void matSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matSupprActionPerformed
        String nom = matList.getSelectedValue();
        modele.supprMat(nom);
        saveModele();
        updateComponentMat();
    }//GEN-LAST:event_matSupprActionPerformed

    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administrationProfEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrationProfEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrationProfEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrationProfEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrationProfEleve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eleveAjout;
    private javax.swing.JTextField eleveClasse;
    private javax.swing.JList<String> eleveList;
    private javax.swing.JScrollPane eleveListe;
    private javax.swing.JTextField eleveNom;
    private javax.swing.JButton eleveSuppr;
    private javax.swing.JLabel eleveTexte;
    private javax.swing.JButton groupeAjouter;
    private javax.swing.JList<String> groupeList;
    private javax.swing.JScrollPane groupeListe;
    private javax.swing.JTextField groupeNom;
    private javax.swing.JButton groupeSuppr;
    private javax.swing.JLabel groupeTexte;
    private javax.swing.JButton matAjouter;
    private javax.swing.JList<String> matList;
    private javax.swing.JScrollPane matListe;
    private javax.swing.JTextField matNom;
    private javax.swing.JButton matSuppr;
    private javax.swing.JLabel matTexte;
    private javax.swing.JButton profAjout;
    private javax.swing.JList<String> profList;
    private javax.swing.JScrollPane profListe;
    private javax.swing.JTextField profMatiere;
    private javax.swing.JTextField profNom;
    private javax.swing.JButton profSuppr;
    private javax.swing.JLabel profTexte;
    private javax.swing.JButton salleAjout;
    private javax.swing.JList<String> salleList;
    private javax.swing.JScrollPane salleListe;
    private javax.swing.JTextField salleNum;
    private javax.swing.JButton salleSuppr;
    private javax.swing.JLabel salleTexte;
    // End of variables declaration//GEN-END:variables
}
