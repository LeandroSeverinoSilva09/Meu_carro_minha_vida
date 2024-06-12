package meu_carro_minha_vida;

import javax.swing.*;

public class TelaAutonomiaVeiculo extends javax.swing.JFrame {

    public TelaAutonomiaVeiculo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldDistancia = new javax.swing.JTextField();
        jTextFieldCombustivel = new javax.swing.JTextField();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabelDistancia = new javax.swing.JLabel();
        jLabelCombustivel = new javax.swing.JLabel();
        jLabelKM = new javax.swing.JLabel();
        jLabelL = new javax.swing.JLabel();
        jButtonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 217, 234));

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jTextAreaResultado.setEditable(false); // Tornar o campo não editável
        jScrollPane2 = new JScrollPane(jTextAreaResultado);
        jScrollPane2.setViewportView(jTextAreaResultado);
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36));
        jLabel1.setText("AUTONOMIA DO VEICULO");

        jLabelDistancia.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelDistancia.setText("DISTANCIA PERCORRIDA");

        jLabelCombustivel.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelCombustivel.setText("COMBUSTÍVEL GASTO");

        jLabelKM.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelKM.setText("KM");

        jLabelL.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabelL.setText("L");

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularAutonomia(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCalcular)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCombustivel)
                                    .addComponent(jLabelDistancia))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldDistancia)
                                    .addComponent(jTextFieldCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelKM)
                                    .addComponent(jLabelL))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKM)
                    .addComponent(jLabelDistancia))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCombustivel)
                    .addComponent(jLabelL))
                .addGap(39, 39, 39)
                .addComponent(jButtonCalcular)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void calcularAutonomia(java.awt.event.ActionEvent evt) {
        try {
            double distancia = Double.parseDouble(jTextFieldDistancia.getText());
            double combustivel = Double.parseDouble(jTextFieldCombustivel.getText());
            double autonomia = distancia / combustivel;

            jTextAreaResultado.setText(String.format("Autonomia: %.2f km/l", autonomia));
        } catch (NumberFormatException e) {
            jTextAreaResultado.setText("Por favor, insira valores válidos.");
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAutonomiaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAutonomiaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAutonomiaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAutonomiaVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAutonomiaVeiculo().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDistancia;
    private javax.swing.JLabel jLabelCombustivel;
    private javax.swing.JLabel jLabelKM;
    private javax.swing.JLabel jLabelL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldCombustivel;
}
