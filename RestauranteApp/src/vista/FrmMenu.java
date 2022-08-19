/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Jeimy
 */
public class FrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        jlFuerte = new javax.swing.JLabel();
        jlBebida = new javax.swing.JLabel();
        jlEntrada = new javax.swing.JLabel();
        jlPostre = new javax.swing.JLabel();
        btnBebidas = new javax.swing.JButton();
        btnEntrada = new javax.swing.JButton();
        btnFuerte = new javax.swing.JButton();
        btnPostre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroPedido = new javax.swing.JTextField();
        btnConfirmacionPedidos = new javax.swing.JButton();
        jmenuBarRestaurante = new javax.swing.JMenuBar();
        jMAyuda = new javax.swing.JMenu();
        miPreguntas = new javax.swing.JMenuItem();
        jMSobre = new javax.swing.JMenu();
        miVersion = new javax.swing.JMenuItem();
        mHistorial = new javax.swing.JMenu();
        jmHistorial = new javax.swing.JMenuItem();
        JMPerfil = new javax.swing.JMenu();
        miPerfil = new javax.swing.JMenuItem();
        miCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jlFuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Segundo.png"))); // NOI18N

        jlBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Bebidas.png"))); // NOI18N

        jlEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Entrada.png"))); // NOI18N

        jlPostre.setBackground(new java.awt.Color(102, 102, 102));
        jlPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Postre.png"))); // NOI18N

        btnBebidas.setBackground(new java.awt.Color(224, 255, 255));
        btnBebidas.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnBebidas.setText("Bebidas");
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        btnEntrada.setBackground(new java.awt.Color(224, 255, 255));
        btnEntrada.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnFuerte.setBackground(new java.awt.Color(224, 255, 255));
        btnFuerte.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnFuerte.setText("Fuerte");
        btnFuerte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFuerte.setFocusTraversalPolicyProvider(true);
        btnFuerte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuerteActionPerformed(evt);
            }
        });

        btnPostre.setBackground(new java.awt.Color(224, 255, 255));
        btnPostre.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        btnPostre.setText("Postre");

        jLabel5.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel5.setText("Escoge tu   ");

        jLabel7.setFont(new java.awt.Font("Cooper Black", 1, 48)); // NOI18N
        jLabel7.setText(" sabor");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iimagenes/Restaurantelogo.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setText("N° Pedido: ");

        txtNumeroPedido.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N

        btnConfirmacionPedidos.setBackground(new java.awt.Color(224, 255, 255));
        btnConfirmacionPedidos.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        btnConfirmacionPedidos.setText("Confirmacion Pedido");
        btnConfirmacionPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmacionPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBebidas)
                        .addGap(60, 60, 60)
                        .addComponent(btnEntrada)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlFuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnFuerte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPostre)
                        .addGap(83, 83, 83))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(btnConfirmacionPedidos)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFuerte, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jlBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBebidas)
                        .addComponent(btnEntrada))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFuerte)
                        .addComponent(btnPostre)))
                .addGap(27, 27, 27)
                .addComponent(btnConfirmacionPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jMAyuda.setBackground(new java.awt.Color(70, 130, 180));
        jMAyuda.setBorder(null);
        jMAyuda.setText("Ayuda");

        miPreguntas.setBackground(new java.awt.Color(173, 216, 230));
        miPreguntas.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        miPreguntas.setText("Preguntas");
        miPreguntas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPreguntasActionPerformed(evt);
            }
        });
        jMAyuda.add(miPreguntas);

        jmenuBarRestaurante.add(jMAyuda);

        jMSobre.setBackground(new java.awt.Color(70, 130, 180));
        jMSobre.setText("Sobre el Sistema");

        miVersion.setBackground(new java.awt.Color(255, 204, 204));
        miVersion.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        miVersion.setText("Version");
        jMSobre.add(miVersion);

        jmenuBarRestaurante.add(jMSobre);

        mHistorial.setBackground(new java.awt.Color(70, 130, 180));
        mHistorial.setText("Informacion");

        jmHistorial.setText("Historial");
        jmHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmHistorialActionPerformed(evt);
            }
        });
        mHistorial.add(jmHistorial);

        jmenuBarRestaurante.add(mHistorial);

        JMPerfil.setBackground(new java.awt.Color(70, 130, 180));
        JMPerfil.setText("Perfil");

        miPerfil.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        miPerfil.setBackground(new java.awt.Color(173, 216, 230));
        miPerfil.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        miPerfil.setText("Información");
        miPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerfilActionPerformed(evt);
            }
        });
        JMPerfil.add(miPerfil);

        miCerrarSesion.setBackground(new java.awt.Color(173, 216, 230));
        miCerrarSesion.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        miCerrarSesion.setText("Cerrar Sesión");
        JMPerfil.add(miCerrarSesion);

        jmenuBarRestaurante.add(JMPerfil);

        setJMenuBar(jmenuBarRestaurante);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnFuerteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuerteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFuerteActionPerformed

    private void miPreguntasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPreguntasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miPreguntasActionPerformed

    private void miPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerfilActionPerformed

    }//GEN-LAST:event_miPerfilActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed

    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnConfirmacionPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmacionPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmacionPedidosActionPerformed

    private void jmHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu JMPerfil;
    public javax.swing.JButton btnBebidas;
    public javax.swing.JButton btnConfirmacionPedidos;
    public javax.swing.JButton btnEntrada;
    public javax.swing.JButton btnFuerte;
    public javax.swing.JButton btnPostre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMAyuda;
    public javax.swing.JMenu jMSobre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlBebida;
    private javax.swing.JLabel jlEntrada;
    private javax.swing.JLabel jlFuerte;
    private javax.swing.JLabel jlPostre;
    public javax.swing.JMenuItem jmHistorial;
    private javax.swing.JMenuBar jmenuBarRestaurante;
    private javax.swing.JMenu mHistorial;
    public javax.swing.JMenuItem miCerrarSesion;
    public javax.swing.JMenuItem miPerfil;
    private javax.swing.JMenuItem miPreguntas;
    public javax.swing.JMenuItem miVersion;
    public javax.swing.JTextField txtNumeroPedido;
    // End of variables declaration//GEN-END:variables
}