/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package interfaces;

/**
 *
 * @author admin
 */
public class Cafes_3 extends javax.swing.JFrame {

    /** Creates new form Cafes_3 */
    public Cafes_3() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_sabores = new javax.swing.ButtonGroup();
        bg_tipo_leche = new javax.swing.ButtonGroup();
        javax.swing.JPanel jp_cafes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jb_c_cortado = new javax.swing.JButton();
        jb_bombon = new javax.swing.JButton();
        jb_capuchino = new javax.swing.JButton();
        jb_c_solo = new javax.swing.JButton();
        jb_c_leche = new javax.swing.JButton();
        jb_supra = new javax.swing.JButton();
        jb_shakerato = new javax.swing.JButton();
        jb_baileys = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jrb_choco = new javax.swing.JRadioButton();
        jrb_vainilla = new javax.swing.JRadioButton();
        jrb_caramelo = new javax.swing.JRadioButton();
        jrb_clasico = new javax.swing.JRadioButton();
        jrb_avellana = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jrb_avena = new javax.swing.JRadioButton();
        jrb_soja = new javax.swing.JRadioButton();
        jrb_sin_lactosa = new javax.swing.JRadioButton();
        jrb_desnatada = new javax.swing.JRadioButton();
        jrb_entera = new javax.swing.JRadioButton();
        jcb_hielo = new javax.swing.JCheckBox();
        jcb_desca = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_info_add_ticket_cafes = new javax.swing.JTextArea();
        jb_aniadir_ticket_cafe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jp_cafes.setBackground(new java.awt.Color(153, 153, 0));

        jPanel2.setBackground(new java.awt.Color(204, 153, 0));

        jb_c_cortado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_c_cortado.setText("cortado");
        jb_c_cortado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_c_cortadoActionPerformed(evt);
            }
        });

        jb_bombon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_bombon.setText("Bombón");
        jb_bombon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_bombonActionPerformed(evt);
            }
        });

        jb_capuchino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_capuchino.setText("capuchino");
        jb_capuchino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_capuchinoActionPerformed(evt);
            }
        });

        jb_c_solo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_c_solo.setText("cafe solo");
        jb_c_solo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_c_soloActionPerformed(evt);
            }
        });

        jb_c_leche.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_c_leche.setText(" leche");
        jb_c_leche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_c_lecheActionPerformed(evt);
            }
        });

        jb_supra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_supra.setText("Supracam");
        jb_supra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_supraActionPerformed(evt);
            }
        });

        jb_shakerato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_shakerato.setText("shakerato");
        jb_shakerato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_shakeratoActionPerformed(evt);
            }
        });

        jb_baileys.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jb_baileys.setText("Baileys");
        jb_baileys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_baileysActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_baileys, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_supra, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_c_leche, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_capuchino, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_c_solo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_c_cortado, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_bombon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_shakerato, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_c_solo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_c_cortado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_c_leche, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_capuchino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_bombon, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_shakerato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_baileys, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_supra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bg_sabores.add(jrb_choco);
        jrb_choco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_choco.setText("Chocolate");
        jrb_choco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_chocoActionPerformed(evt);
            }
        });

        bg_sabores.add(jrb_vainilla);
        jrb_vainilla.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_vainilla.setText("Vainilla");
        jrb_vainilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_vainillaActionPerformed(evt);
            }
        });

        bg_sabores.add(jrb_caramelo);
        jrb_caramelo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_caramelo.setText("Caramelo");

        bg_sabores.add(jrb_clasico);
        jrb_clasico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_clasico.setSelected(true);
        jrb_clasico.setText("Clásico");

        bg_sabores.add(jrb_avellana);
        jrb_avellana.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_avellana.setText("Avellana");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_choco)
                    .addComponent(jrb_vainilla)
                    .addComponent(jrb_caramelo)
                    .addComponent(jrb_clasico)
                    .addComponent(jrb_avellana))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrb_clasico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_choco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_vainilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_caramelo)
                .addGap(2, 2, 2)
                .addComponent(jrb_avellana)
                .addContainerGap())
        );

        bg_tipo_leche.add(jrb_avena);
        jrb_avena.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_avena.setText("Avena");
        jrb_avena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_avenaActionPerformed(evt);
            }
        });

        bg_tipo_leche.add(jrb_soja);
        jrb_soja.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_soja.setText("Soja");
        jrb_soja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_sojaActionPerformed(evt);
            }
        });

        bg_tipo_leche.add(jrb_sin_lactosa);
        jrb_sin_lactosa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_sin_lactosa.setText("Sin Lactosa");
        jrb_sin_lactosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_sin_lactosaActionPerformed(evt);
            }
        });

        bg_tipo_leche.add(jrb_desnatada);
        jrb_desnatada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_desnatada.setText("Desnatada");
        jrb_desnatada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_desnatadaActionPerformed(evt);
            }
        });

        bg_tipo_leche.add(jrb_entera);
        jrb_entera.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jrb_entera.setSelected(true);
        jrb_entera.setText("Entera//sin Leche");
        jrb_entera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_enteraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrb_avena)
                    .addComponent(jrb_soja)
                    .addComponent(jrb_desnatada)
                    .addComponent(jrb_sin_lactosa)
                    .addComponent(jrb_entera))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrb_entera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrb_desnatada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_avena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_soja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrb_sin_lactosa)
                .addContainerGap())
        );

        jcb_hielo.setBackground(new java.awt.Color(153, 153, 0));
        jcb_hielo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcb_hielo.setText("Con Hielo");
        jcb_hielo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_hieloActionPerformed(evt);
            }
        });

        jcb_desca.setBackground(new java.awt.Color(153, 153, 0));
        jcb_desca.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jcb_desca.setText("Descafeinado");
        jcb_desca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_descaActionPerformed(evt);
            }
        });

        jta_info_add_ticket_cafes.setEditable(false);
        jta_info_add_ticket_cafes.setColumns(20);
        jta_info_add_ticket_cafes.setRows(5);
        jScrollPane1.setViewportView(jta_info_add_ticket_cafes);

        jb_aniadir_ticket_cafe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jb_aniadir_ticket_cafe.setText("AÑADIR AL TICKET");
        jb_aniadir_ticket_cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_aniadir_ticket_cafeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_cafesLayout = new javax.swing.GroupLayout(jp_cafes);
        jp_cafes.setLayout(jp_cafesLayout);
        jp_cafesLayout.setHorizontalGroup(
            jp_cafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_cafesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_cafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcb_desca)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcb_hielo)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jp_cafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_aniadir_ticket_cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jp_cafesLayout.setVerticalGroup(
            jp_cafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_cafesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jp_cafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp_cafesLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_aniadir_ticket_cafe, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_cafesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jp_cafesLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jcb_desca)
                            .addGap(18, 18, 18)
                            .addComponent(jcb_hielo)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_cafes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_cafes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_c_cortadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_c_cortadoActionPerformed
        // añade cafe cortado al jta_info_add_ticket_cafes
        // OJO- debe añadir las opciones marcadas en jbg_tipos_keche y jbg_sabores
    }//GEN-LAST:event_jb_c_cortadoActionPerformed

    private void jb_bombonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_bombonActionPerformed
        // añade cafe bombón al jta_info_add_ticket_cafes

        // OJO- debe añadir las opciones marcadas en jbg_tipos_keche y jbg_sabores
    }//GEN-LAST:event_jb_bombonActionPerformed

    private void jb_capuchinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_capuchinoActionPerformed
        // añade capuchino al jta_info_add_ticket_cafes

        // OJO- debe añadir las opciones marcadas en jbg_tipos_keche y jbg_sabores
    }//GEN-LAST:event_jb_capuchinoActionPerformed

    private void jb_c_soloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_c_soloActionPerformed
        // añade cafe solo al jta_info_add_ticket_cafes
        //OJO-- si se pincha en
    }//GEN-LAST:event_jb_c_soloActionPerformed

    private void jb_c_lecheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_c_lecheActionPerformed
        // añade cafe con leche al jta_info_add_ticket_cafes
        // OJO- debe añadir las opciones marcadas en jbg_tipos_keche y jbg_sabores
    }//GEN-LAST:event_jb_c_lecheActionPerformed

    private void jb_supraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_supraActionPerformed
        // añade supracam   al jta_info_add_ticket_cafes

        // OJO- debe añadir las opciones marcadas en jbg_tipos_keche y jbg_sabores
    }//GEN-LAST:event_jb_supraActionPerformed

    private void jb_shakeratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_shakeratoActionPerformed
        // añade shakerato al jta_info_add_ticket_cafes

        // OJO- debe añadir las opciones marcadas en jbg_tipos_keche y jbg_sabores
    }//GEN-LAST:event_jb_shakeratoActionPerformed

    private void jb_baileysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_baileysActionPerformed
        // añade cafe con baileys al jta_info_add_ticket_cafes

        // OJO- debe añadir las opciones marcadas en jbg_tipos_keche y jbg_sabores
    }//GEN-LAST:event_jb_baileysActionPerformed

    private void jrb_chocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_chocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_chocoActionPerformed

    private void jrb_vainillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_vainillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_vainillaActionPerformed

    private void jrb_avenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_avenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_avenaActionPerformed

    private void jrb_sojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_sojaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_sojaActionPerformed

    private void jrb_sin_lactosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_sin_lactosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_sin_lactosaActionPerformed

    private void jrb_desnatadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_desnatadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_desnatadaActionPerformed

    private void jrb_enteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_enteraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_enteraActionPerformed

    private void jcb_hieloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_hieloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_hieloActionPerformed

    private void jcb_descaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_descaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_descaActionPerformed

    private void jb_aniadir_ticket_cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_aniadir_ticket_cafeActionPerformed
        //añadir al ticket seleccionado la información que contenga
        //OJO-- esto debe cerrar la ventana y volver al main
        
    // Main_botones_3.cafe3.setVisible(false);
    Main_botones_3.cafe3.dispose();
    }//GEN-LAST:event_jb_aniadir_ticket_cafeActionPerformed

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
            java.util.logging.Logger.getLogger(Cafes_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cafes_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cafes_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cafes_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafes_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_sabores;
    private javax.swing.ButtonGroup bg_tipo_leche;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_aniadir_ticket_cafe;
    private javax.swing.JButton jb_baileys;
    private javax.swing.JButton jb_bombon;
    private javax.swing.JButton jb_c_cortado;
    private javax.swing.JButton jb_c_leche;
    private javax.swing.JButton jb_c_solo;
    private javax.swing.JButton jb_capuchino;
    private javax.swing.JButton jb_shakerato;
    private javax.swing.JButton jb_supra;
    private javax.swing.JCheckBox jcb_desca;
    private javax.swing.JCheckBox jcb_hielo;
    private javax.swing.JRadioButton jrb_avellana;
    private javax.swing.JRadioButton jrb_avena;
    private javax.swing.JRadioButton jrb_caramelo;
    private javax.swing.JRadioButton jrb_choco;
    private javax.swing.JRadioButton jrb_clasico;
    private javax.swing.JRadioButton jrb_desnatada;
    private javax.swing.JRadioButton jrb_entera;
    private javax.swing.JRadioButton jrb_sin_lactosa;
    private javax.swing.JRadioButton jrb_soja;
    private javax.swing.JRadioButton jrb_vainilla;
    private javax.swing.JTextArea jta_info_add_ticket_cafes;
    // End of variables declaration//GEN-END:variables

}
