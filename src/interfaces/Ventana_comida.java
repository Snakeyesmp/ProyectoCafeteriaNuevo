/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Ventana_comida extends javax.swing.JFrame {

    /**
     * Creates new form Comidas3
     */
    public Ventana_comida() {
        initComponents();
        // inserccion de imagenes
        // tostada con tomate
        ImageIcon img_tomate = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\tomate.png");
        // crea un objeto imagen en base a l incono anteior y toma las dimensiones del bototn que lo va a contener. getscaled lo redimensiona
        Image im_tomate = img_tomate.getImage().getScaledInstance(jb_tomate.getWidth(), jb_tomate.getHeight(), Image.SCALE_SMOOTH);
        jb_tomate.setIcon(new ImageIcon(im_tomate));
        // tostada de mermelada
        ImageIcon img_mermelada = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\mermelada.png");
        Image im_mermelada = img_mermelada.getImage().getScaledInstance(jb_mermelada.getWidth(), jb_mermelada.getHeight(), Image.SCALE_SMOOTH);
        jb_mermelada.setIcon(new ImageIcon(im_mermelada));
        // tostada de aguacate
        ImageIcon img_aguacate = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\aguacate.png");
        Image im_aguacate = img_aguacate.getImage().getScaledInstance(jb_aguacate.getWidth(), jb_aguacate.getHeight(), Image.SCALE_SMOOTH);
        jb_aguacate.setIcon(new ImageIcon(im_aguacate));
        // bizcoho
        ImageIcon img_bizcoho = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\bizcoho.png");
        Image im_bizcoho = img_bizcoho.getImage().getScaledInstance(jb_bizcocho.getWidth(), jb_bizcocho.getHeight(), Image.SCALE_SMOOTH);
        jb_bizcocho.setIcon(new ImageIcon(im_bizcoho));
        // donut
        ImageIcon img_donut = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\donut.png");
        Image im_donut = img_donut.getImage().getScaledInstance(jb_donut.getWidth(), jb_donut.getHeight(), Image.SCALE_SMOOTH);
        jb_donut.setIcon(new ImageIcon(im_donut));
        // tostada con jamon
        ImageIcon img_jamon = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\jamon.png");
        Image im_jamon = img_jamon.getImage().getScaledInstance(jb_jamon.getWidth(), jb_jamon.getHeight(), Image.SCALE_SMOOTH);
        jb_jamon.setIcon(new ImageIcon(im_jamon));
        // tarta de limon
        ImageIcon img_limon = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\limon.png");
        Image im_limon = img_limon.getImage().getScaledInstance(jb_t_limon.getWidth(), jb_t_limon.getHeight(), Image.SCALE_SMOOTH);
        jb_t_limon.setIcon(new ImageIcon(im_limon));
        //pulguita
        ImageIcon img_pulguita = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\pulguita.png");
        Image im_pulguita = img_pulguita.getImage().getScaledInstance(jb_pulguita.getWidth(), jb_pulguita.getHeight(), Image.SCALE_SMOOTH);
        jb_pulguita.setIcon(new ImageIcon(im_pulguita));
        //tarta de queso
        ImageIcon img_queso = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\queso.png");
        Image im_queso = img_queso.getImage().getScaledInstance(jb_t_queso.getWidth(), jb_t_queso.getHeight(), Image.SCALE_SMOOTH);
        jb_t_queso.setIcon(new ImageIcon(im_queso));
        //tortilla
        ImageIcon img_tortilla = new ImageIcon("src\\cafeteria_imagenes_botones\\comidas\\tortilla.png");
        Image im_tortilla = img_tortilla.getImage().getScaledInstance(jb_tortilla.getWidth(), jb_tortilla.getHeight(), Image.SCALE_SMOOTH);
        jb_tortilla.setIcon(new ImageIcon(im_tortilla));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jb_jamon = new javax.swing.JButton();
        jb_mermelada = new javax.swing.JButton();
        jb_aguacate = new javax.swing.JButton();
        jb_t_limon = new javax.swing.JButton();
        jb_tortilla = new javax.swing.JButton();
        jb_t_queso = new javax.swing.JButton();
        jb_bizcocho = new javax.swing.JButton();
        jb_pulguita = new javax.swing.JButton();
        jb_donut = new javax.swing.JButton();
        jb_tomate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_info_add_ticket_comida = new javax.swing.JTextArea();
        jb_aniadir_ticket_comidas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 141, 98));
        jPanel1.setPreferredSize(new java.awt.Dimension(895, 600));

        jPanel2.setBackground(new java.awt.Color(115, 84, 72));
        jPanel2.setPreferredSize(new java.awt.Dimension(435, 529));

        jb_jamon.setBackground(new java.awt.Color(115, 184, 191));
        jb_jamon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_jamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_jamonActionPerformed(evt);
            }
        });

        jb_mermelada.setBackground(new java.awt.Color(115, 184, 191));
        jb_mermelada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_mermelada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mermeladaActionPerformed(evt);
            }
        });

        jb_aguacate.setBackground(new java.awt.Color(115, 184, 191));
        jb_aguacate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_aguacate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aguacateActionPerformed(evt);
            }
        });

        jb_t_limon.setBackground(new java.awt.Color(115, 184, 191));
        jb_t_limon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_t_limon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_t_limonActionPerformed(evt);
            }
        });

        jb_tortilla.setBackground(new java.awt.Color(115, 184, 191));
        jb_tortilla.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_tortilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tortillaActionPerformed(evt);
            }
        });

        jb_t_queso.setBackground(new java.awt.Color(115, 184, 191));
        jb_t_queso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_t_queso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_t_quesoActionPerformed(evt);
            }
        });

        jb_bizcocho.setBackground(new java.awt.Color(115, 184, 191));
        jb_bizcocho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_bizcocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bizcochoActionPerformed(evt);
            }
        });

        jb_pulguita.setBackground(new java.awt.Color(115, 184, 191));
        jb_pulguita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_pulguita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_pulguitaActionPerformed(evt);
            }
        });

        jb_donut.setBackground(new java.awt.Color(115, 184, 191));
        jb_donut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_donut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_donutActionPerformed(evt);
            }
        });

        jb_tomate.setBackground(new java.awt.Color(115, 184, 191));
        jb_tomate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_tomate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_tomateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_bizcocho, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_pulguita, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jb_tortilla, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_donut, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_t_limon, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_t_queso, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_mermelada, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_tomate, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jb_jamon, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jb_aguacate, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(13, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_jamon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_tomate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_aguacate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mermelada, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_pulguita, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_bizcocho, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_t_limon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_tortilla, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_t_queso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_donut, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jta_info_add_ticket_comida.setEditable(false);
        jta_info_add_ticket_comida.setColumns(20);
        jta_info_add_ticket_comida.setRows(5);
        jScrollPane1.setViewportView(jta_info_add_ticket_comida);

        jb_aniadir_ticket_comidas.setBackground(new java.awt.Color(54, 115, 115));
        jb_aniadir_ticket_comidas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_aniadir_ticket_comidas.setForeground(new java.awt.Color(242, 214, 189));
        jb_aniadir_ticket_comidas.setText("AÑADIR AL TICKET");
        jb_aniadir_ticket_comidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aniadir_ticket_comidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_aniadir_ticket_comidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_aniadir_ticket_comidas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_jamonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_jamonActionPerformed
        // se añade tostadas con jamón al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Tostadas con Jamón Ibérico (DO) \t 1.80€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(36));

    }// GEN-LAST:event_jb_jamonActionPerformed

    private void jb_tomateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_tomateActionPerformed
        // se añade tostadas con tomate al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Tostadas con Aceite y Tomate \t 1.20€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(35));
    }// GEN-LAST:event_jb_tomateActionPerformed

    private void jb_mermeladaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_mermeladaActionPerformed
        // se añade tostadas con mermelada al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Tostadas con Mermelada \t 2.10€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(39));
    }// GEN-LAST:event_jb_mermeladaActionPerformed

    private void jb_aguacateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_aguacateActionPerformed
        // se añade tostadas con aguacate al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Tostadas con Aguacate \t 1.60€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(37));
    }// GEN-LAST:event_jb_aguacateActionPerformed

    private void jb_t_limonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_t_limonActionPerformed
        // se añade trata de limón al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Tarta de Limón Casera \t 1.80€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(44));
    }// GEN-LAST:event_jb_t_limonActionPerformed

    private void jb_tortillaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_tortillaActionPerformed
        // se añade pincho de tortilla al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Pincho de Tortilla \t 1.60€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(42));

    }// GEN-LAST:event_jb_tortillaActionPerformed

    private void jb_t_quesoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_t_quesoActionPerformed
        // TODO add your handling code here:
        jta_info_add_ticket_comida.append("Tarta de Queso Casera \t 2.10€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(38));
    }// GEN-LAST:event_jb_t_quesoActionPerformed

    private void jb_bizcochoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_bizcochoActionPerformed
        // se añade bizcocho al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Bizcoho Casero \t 1.60€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(40));
    }// GEN-LAST:event_jb_bizcochoActionPerformed

    private void jb_pulguitaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_pulguitaActionPerformed
        // se añade pulguita al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Pulguita de Tortilla \t 1.20€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(43));
    }// GEN-LAST:event_jb_pulguitaActionPerformed

    private void jb_donutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_donutActionPerformed
        // se añade trata de queso al jta_info_add_ticket_comida
        jta_info_add_ticket_comida.append("Donut \t 1.50€\n");
        Main_botones.productosAuxiliar.add(Main_botones.productosBBDD.get(41));
    }// GEN-LAST:event_jb_donutActionPerformed

    private void jb_aniadir_ticket_comidasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_aniadir_ticket_comidasActionPerformed
        // añadir al ticket seleccionado los productos que se han recogido
        // OJO-- esto debe cerrar la ventana y volver al main
        Main_botones.comida3.dispose();
        jta_info_add_ticket_comida.setText("");
    }// GEN-LAST:event_jb_aniadir_ticket_comidasActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_comida.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_comida.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_comida.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_comida.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_comida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_aguacate;
    private javax.swing.JButton jb_aniadir_ticket_comidas;
    private javax.swing.JButton jb_bizcocho;
    private javax.swing.JButton jb_donut;
    private javax.swing.JButton jb_jamon;
    private javax.swing.JButton jb_mermelada;
    private javax.swing.JButton jb_pulguita;
    private javax.swing.JButton jb_t_limon;
    private javax.swing.JButton jb_t_queso;
    private javax.swing.JButton jb_tomate;
    private javax.swing.JButton jb_tortilla;
    private javax.swing.JTextArea jta_info_add_ticket_comida;
    // End of variables declaration//GEN-END:variables
}
