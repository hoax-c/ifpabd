/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.Gui;

/**
 *
 * @author Willian
 */
public class TelaCadastro extends javax.swing.JDialog {

    /**
     * Creates new form TelaCadastro1
     */
    public TelaCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbEscolha = new javax.swing.JLabel();
        rbAluno = new javax.swing.JRadioButton();
        rbTurma = new javax.swing.JRadioButton();
        rbGrupo = new javax.swing.JRadioButton();
        btCadastre = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbEscolha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbEscolha.setText("Escolha o Que Você Deseja Cadastrar:");

        rbAluno.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbAluno);
        rbAluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbAluno.setText("Aluno");
        rbAluno.setOpaque(false);
        rbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlunoActionPerformed(evt);
            }
        });

        rbTurma.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbTurma);
        rbTurma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbTurma.setText("Turma");
        rbTurma.setOpaque(false);
        rbTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTurmaActionPerformed(evt);
            }
        });

        rbGrupo.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbGrupo);
        rbGrupo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbGrupo.setText("Grupo");
        rbGrupo.setOpaque(false);

        btCadastre.setBackground(new java.awt.Color(255, 255, 204));
        btCadastre.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btCadastre.setText("Cadastre");
        btCadastre.setToolTipText("");
        btCadastre.setBorder(null);
        btCadastre.setBorderPainted(false);
        btCadastre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCadastre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbGrupo)
                            .addComponent(rbTurma)
                            .addComponent(rbAluno))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addComponent(lbEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbEscolha)
                .addGap(18, 18, 18)
                .addComponent(rbAluno)
                .addGap(18, 18, 18)
                .addComponent(rbTurma)
                .addGap(18, 18, 18)
                .addComponent(rbGrupo)
                .addGap(18, 18, 18)
                .addComponent(btCadastre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastreActionPerformed
        if(rbAluno.isSelected()){
            TelaInicial tI = new TelaInicial();
            TelaCadastroAluno tcA = new TelaCadastroAluno(tI, true);
            tcA.setVisible(true);
            
        }
        else if(rbGrupo.isSelected()){
            TelaInicial tI = new TelaInicial();
            TelaCadastroGrupo tcG = new TelaCadastroGrupo(tI, true);
            tcG.setVisible(true);
        }
        else if(rbTurma.isSelected()){
            TelaInicial tI = new TelaInicial();
            TelaCadastroTurma tcT = new TelaCadastroTurma(tI,true);
            tcT.setVisible(true);
        }
    }//GEN-LAST:event_btCadastreActionPerformed

    private void rbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlunoActionPerformed

    private void rbTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbTurmaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaCadastro dialog = new TelaCadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastre;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbEscolha;
    private javax.swing.JRadioButton rbAluno;
    private javax.swing.JRadioButton rbGrupo;
    private javax.swing.JRadioButton rbTurma;
    // End of variables declaration//GEN-END:variables
}
