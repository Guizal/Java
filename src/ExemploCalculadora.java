public class ExemploCalculadora extends javax.swing.JFrame {
    public ExemploCalculadora() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        NUM1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NUM2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RESULTADO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SUBT = new javax.swing.JButton();
        MULT = new javax.swing.JButton();
        QUADRADO = new javax.swing.JButton();
        CUBO = new javax.swing.JButton();
        LIMPAR = new javax.swing.JButton();
        RAIZ = new javax.swing.JButton();
        FAT = new javax.swing.JButton();
        DIV = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NUM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUM1ActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Primeiro Número");
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        NUM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUM2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Segundo Número");

        RESULTADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESULTADOActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultado");

        SUBT.setText("-");
        SUBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUBTActionPerformed(evt);
            }
        });

        MULT.setText("*");
        MULT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MULTActionPerformed(evt);
            }
        });

        QUADRADO.setText("X²");
        QUADRADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUADRADOActionPerformed(evt);
            }
        });

        CUBO.setText("X³");
        CUBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUBOActionPerformed(evt);
            }
        });

        LIMPAR.setText("C");
        LIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPARActionPerformed(evt);
            }
        });

        RAIZ.setText("sqrt");
        RAIZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAIZActionPerformed(evt);
            }
        });

        FAT.setText("n!");
        FAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FATActionPerformed(evt);
            }
        });

        DIV.setText("/");
        DIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(1, 51, 255));
        jTextField1.setForeground(new java.awt.Color(1, 0, 0));
        jTextField1.setText("Calculadora");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(RESULTADO))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SUBT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CUBO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MULT, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DIV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(QUADRADO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FAT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RAIZ, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LIMPAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 108, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(NUM1)
                            .addComponent(NUM2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NUM1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RESULTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MULT)
                    .addComponent(LIMPAR)
                    .addComponent(DIV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(RAIZ)
                    .addComponent(QUADRADO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FAT)
                    .addComponent(SUBT)
                    .addComponent(CUBO))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NUM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUM2ActionPerformed
    }//GEN-LAST:event_NUM2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double N1, N2, R;
        N1= Double.parseDouble(NUM1.getText());
        N2 = Double.parseDouble(NUM2.getText());
        R= N1 +N2;RESULTADO.setText(String.valueOf(R));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RESULTADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESULTADOActionPerformed
    }//GEN-LAST:event_RESULTADOActionPerformed

    private void SUBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUBTActionPerformed
        double N1, N2, R;
        N1= Double.parseDouble(NUM1.getText());
        N2 = Double.parseDouble(NUM2.getText());
        R = N1 - N2;RESULTADO.setText(String.valueOf(R));
    }//GEN-LAST:event_SUBTActionPerformed

    private void MULTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MULTActionPerformed
        double N1, N2, R;
        N1= Double.parseDouble(NUM1.getText());
        N2 = Double.parseDouble(NUM2.getText());
        R= N1 * N2;RESULTADO.setText(String.valueOf(R));
    }//GEN-LAST:event_MULTActionPerformed

    private void DIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVActionPerformed
        double N1, N2, R;
        N1= Double.parseDouble(NUM1.getText());
        N2 = Double.parseDouble(NUM2.getText());
        R= N1/N2;RESULTADO.setText(String.valueOf(R));
    }//GEN-LAST:event_DIVActionPerformed

    private void CUBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUBOActionPerformed
        double N1, R;
        N1= Double.parseDouble(NUM1.getText());
        R= N1*N1*N1;RESULTADO.setText(String.valueOf(R));
    }//GEN-LAST:event_CUBOActionPerformed

    private void QUADRADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUADRADOActionPerformed
        double N1, R;
        N1= Double.parseDouble(NUM1.getText());
        R= N1 * N1;RESULTADO.setText(String.valueOf(R));
    }//GEN-LAST:event_QUADRADOActionPerformed

    private void FATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FATActionPerformed
        double N1, f = 1,i = 2,R;
        N1= Double.parseDouble(NUM1.getText());
        while(i<=N1){
            f = f*i;
            i = i + 1;   
        }
        R = f;RESULTADO.setText(String.valueOf(f));
    }//GEN-LAST:event_FATActionPerformed

    private void LIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPARActionPerformed
        NUM1.setText("");
        NUM2.setText("");
        RESULTADO.setText("");
    }//GEN-LAST:event_LIMPARActionPerformed

    private void RAIZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAIZActionPerformed
        double N1, R;
        N1= Double.parseDouble(NUM1.getText());
        R = Math.sqrt(N1);RESULTADO.setText(String.valueOf(R));        
    }//GEN-LAST:event_RAIZActionPerformed

    private void NUM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUM1ActionPerformed
    }//GEN-LAST:event_NUM1ActionPerformed

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
    }//GEN-LAST:event_jLabel1AncestorAdded

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ExemploCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExemploCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExemploCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExemploCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExemploCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CUBO;
    private javax.swing.JButton DIV;
    private javax.swing.JButton FAT;
    private javax.swing.JButton LIMPAR;
    private javax.swing.JButton MULT;
    private javax.swing.JTextField NUM1;
    private javax.swing.JTextField NUM2;
    private javax.swing.JButton QUADRADO;
    private javax.swing.JButton RAIZ;
    private javax.swing.JTextField RESULTADO;
    private javax.swing.JButton SUBT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
