/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;


import javax.swing.JOptionPane;

public class Sistema2 extends javax.swing.JFrame {

    /**
     * Creates new form Sistema2
     */
    public Sistema2() {
        setTitle("Sistema de ecuaciones lineales de 2*2");
        initComponents();
        setLocationRelativeTo(null);
        
    }
private Double redo(Double N){
        return (Math.rint(N*100)/100);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtX1 = new javax.swing.JTextField();
        txtY1 = new javax.swing.JTextField();
        txtX2 = new javax.swing.JTextField();
        txtY2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblX = new javax.swing.JTextField();
        lblY = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtZ1 = new javax.swing.JTextField();
        txtZ2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtX1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtX1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtX1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtX1KeyTyped(evt);
            }
        });
        getContentPane().add(txtX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 60));

        txtY1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtY1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtY1KeyReleased(evt);
            }
        });
        getContentPane().add(txtY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 100, 70));

        txtX2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtX2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtX2KeyReleased(evt);
            }
        });
        getContentPane().add(txtX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, 60));

        txtY2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtY2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtY2KeyReleased(evt);
            }
        });
        getContentPane().add(txtY2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 100, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 120)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("=");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        lblX.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblX.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor de \"X\""));
        getContentPane().add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 380, 70));

        lblY.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblY.setBorder(javax.swing.BorderFactory.createTitledBorder("\"Valor de Y\""));
        getContentPane().add(lblY, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 310, 70));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Sistema de ecuaciones lineales de 2*2");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 590, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("y");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("+");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        txtZ1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtZ1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZ1KeyReleased(evt);
            }
        });
        getContentPane().add(txtZ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 100, 80));

        txtZ2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtZ2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZ2KeyReleased(evt);
            }
        });
        getContentPane().add(txtZ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 100, 70));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Eras Medium ITC", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setText("Redondear \"X\" y \"Y\"");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 200, 60));

        jButton1.setBackground(new java.awt.Color(204, 153, 255));
        jButton1.setFont(new java.awt.Font("ItalicT", 0, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 153));
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 230, 60));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Swis721 BdOul BT", 0, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 204, 0));
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 240, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("x");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("+");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("x");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 120)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("=");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 255));
        jLabel9.setText("y");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ufps6.jpg")));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        jMenu1.setText("Men??");
        jMenu1.add(jSeparator2);

        jMenuItem2.setText("Volver");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Salir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Menu p1=new Menu();
        p1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtX1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX1KeyReleased
        if(!txtX1.getText().matches("[0-9-]*")){
            JOptionPane.showMessageDialog(null,"Solo ingrese n??meros");
            txtX1.setText("");
        }
    }//GEN-LAST:event_txtX1KeyReleased

    private void txtX1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX1KeyTyped

    }//GEN-LAST:event_txtX1KeyTyped

    private void txtY1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtY1KeyReleased
        if(!txtY1.getText().matches("[0-9-]*")){
            JOptionPane.showMessageDialog(null,"Solo ingrese n??meros");
            txtY1.setText("");
        }
    }//GEN-LAST:event_txtY1KeyReleased

    private void txtX2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtX2KeyReleased
        if(!txtX2.getText().matches("[0-9-]*")){
            JOptionPane.showMessageDialog(null,"Solo ingrese n??meros");
            txtX2.setText("");
        }
    }//GEN-LAST:event_txtX2KeyReleased

    private void txtY2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtY2KeyReleased
        if(!txtY2.getText().matches("[0-9-]*")){
            JOptionPane.showMessageDialog(null,"Solo ingrese n??meros");
            txtY2.setText("");
        }
    }//GEN-LAST:event_txtY2KeyReleased

    private void txtZ1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZ1KeyReleased
        if(!txtZ1.getText().matches("[0-9-]*")){
            JOptionPane.showMessageDialog(null,"Solo ingrese n??meros");
            txtZ1.setText("");
        }
    }//GEN-LAST:event_txtZ1KeyReleased

    private void txtZ2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZ2KeyReleased
        if(!txtZ2.getText().matches("[0-9-]*")){
            JOptionPane.showMessageDialog(null,"Solo ingrese n??meros");
            txtZ2.setText("");
        }
    }//GEN-LAST:event_txtZ2KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double x1,x2,y1,y2,z1,z2,x,y,det;
        if(lblX.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Falta calcular el valor de x");
        }else if(lblY.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltar calcular el valor de y");
        }else{

            x1=Double.parseDouble(txtX1.getText());
            x2=Double.parseDouble(txtX2.getText());
            y1=Double.parseDouble(txtY1.getText());
            y2=Double.parseDouble(txtY2.getText());
            z1=Double.parseDouble(txtZ1.getText());
            z2=Double.parseDouble(txtZ2.getText());

            det=(x1*y2)-(y1*x2);
            x=(z1*y2-z2*y1)/det;
            y= (x1*z2-x2*z1)/det;
            lblX.setText(+redo(x)+"");
            lblY.setText(+redo(y)+"");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double x1,x2,y1,y2,z1,z2,x,y,det;

        if(txtX1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltar llenar el x1");
        }if(txtX2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltar llenar el x2");
        }if(txtY1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltar llenar el y1");
        } if(txtY2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltar llenar el y2");
        }  if(txtZ1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltar llenar el z1");
        }if(txtZ2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Faltar llenar el z2");

        }else {
            x1=Double.parseDouble(txtX1.getText());
            x2=Double.parseDouble(txtX2.getText());
            y1=Double.parseDouble(txtY1.getText());
            y2=Double.parseDouble(txtY2.getText());
            z1=Double.parseDouble(txtZ1.getText());
            z2=Double.parseDouble(txtZ2.getText());

            det=(x1*y2)-(y1*x2);
            x=(z1*y2-z2*y1)/det;
            y= (x1*z2-x2*z1)/det;
            lblX.setText(x+"");
            lblY.setText(y+"");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtX1.setText("");
        txtY1.setText("");
        txtX2.setText("");
        txtY2.setText("");
        txtZ1.setText("");
        txtZ2.setText("");
        lblX.setText("");
        lblY.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextField lblX;
    private javax.swing.JTextField lblY;
    private javax.swing.JTextField txtX1;
    private javax.swing.JTextField txtX2;
    private javax.swing.JTextField txtY1;
    private javax.swing.JTextField txtY2;
    private javax.swing.JTextField txtZ1;
    private javax.swing.JTextField txtZ2;
    // End of variables declaration//GEN-END:variables
}
