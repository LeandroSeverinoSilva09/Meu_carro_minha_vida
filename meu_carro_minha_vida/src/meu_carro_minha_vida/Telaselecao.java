/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package meu_carro_minha_vida;

import javax.swing.plaf.DimensionUIResource;

/**
 *
 * @author Usuario
 */
public class TelaSelecao extends javax.swing.JFrame {

        /**
         * Creates new form TelaSel
         */
        public TelaSelecao() {
                setTitle("TELA SELECAO");
                setResizable(false);
                setPreferredSize(new DimensionUIResource(840, 500));
                setMinimumSize(new DimensionUIResource(840, 500));
                setMaximumSize(new DimensionUIResource(840, 500));
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jButton1 = new javax.swing.JButton();
                jLabel11 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jButton2 = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setAutoRequestFocus(false);
                setBackground(new java.awt.Color(153, 217, 234));

                jPanel1.setBackground(new java.awt.Color(153, 217, 234));

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
                jLabel4.setText("O QUE DESEJA CALCULAR?");

                jLabel7.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/mecanico.png"))); // NOI18N

                jLabel9.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/solucao.png"))); // NOI18N

                jLabel10.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/de-dinheiro.png"))); // NOI18N

                jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton1.setText("SELECIONAR");

                jLabel11.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/posto-de-gasolina.png"))); // NOI18N

                jLabel5.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/troca-de-oleo.png"))); // NOI18N

                jLabel3.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/protecao.png"))); // NOI18N

                jLabel8.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/disco-de-freio.png"))); // NOI18N

                jLabel12.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/pneu.png"))); // NOI18N

                jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jButton2.setText("SELECIONAR");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel1.setText("CUSTO ANUAL");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel2.setText("MANUTENÇÃO");

                jLabel13.setIcon(new javax.swing.ImageIcon(
                                getClass().getResource("/meu_carro_minha_vida/imagens/LINHA.png"))); // NOI18N

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(145, 145, 145)
                                                                                                .addComponent(jLabel1))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(185, 185, 185)
                                                                                                .addComponent(jLabel10))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(100, 100, 100)
                                                                                                .addComponent(jLabel11)
                                                                                                .addGap(99, 99, 99)
                                                                                                .addComponent(jLabel12))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(186, 186, 186)
                                                                                                .addComponent(jLabel3))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(161, 161, 161)
                                                                                                .addComponent(jButton2)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                96, Short.MAX_VALUE)
                                                                .addComponent(jLabel13)
                                                                .addGap(118, 118, 118)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel7)
                                                                                                                .addGap(166, 166,
                                                                                                                                166))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel2)
                                                                                                                .addGap(112, 112,
                                                                                                                                112))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel5)
                                                                                                                .addGap(169, 169,
                                                                                                                                169))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addGap(89, 89, 89)
                                                                                                                .addComponent(jLabel9)
                                                                                                                .addGap(80, 80, 80))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel1Layout.createSequentialGroup()
                                                                                                                .addComponent(jButton1)
                                                                                                                .addGap(131, 131,
                                                                                                                                131))))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(195, 195, 195)
                                                                .addComponent(jLabel4)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel4)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(jLabel7)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jLabel2)
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(jLabel5)
                                                                                                .addGap(39, 39, 39)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel8)
                                                                                                                .addComponent(jLabel9))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                54,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jButton1)
                                                                                                                .addComponent(jButton2))
                                                                                                .addGap(51, 51, 51))
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(15, 15, 15)
                                                                                                                                .addComponent(jLabel10)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jLabel1)
                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(128, 128,
                                                                                                                                                                                128)
                                                                                                                                                                .addComponent(jLabel11))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(jLabel3))
                                                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addGap(128, 128,
                                                                                                                                                                                128)
                                                                                                                                                                .addComponent(jLabel12))))
                                                                                                                .addGroup(jPanel1Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jLabel13,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                380,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                setSize(new java.awt.Dimension(850, 500));
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
                this.dispose();
                TelaCA telaCA = new TelaCA();
                telaCA.setVisible(true);
        }// GEN-LAST:event_jButton2ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TelaSelecao.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new TelaSelecao().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        // End of variables declaration//GEN-END:variables
}
