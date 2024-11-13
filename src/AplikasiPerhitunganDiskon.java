/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Riska
 */

import java.util.Hashtable;
import javax.swing.JLabel;
public class AplikasiPerhitunganDiskon extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPerhitunganDiskon
     */
    public AplikasiPerhitunganDiskon() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldHarga = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        fieldDiskon = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider1 = new javax.swing.JSlider();
        btnDiskon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        jPanel1Layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setText("Masukan Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Pilih Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Harga Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("===========");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        jPanel1.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(fieldHarga, gridBagConstraints);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jTextField2, gridBagConstraints);

        fieldDiskon.setFocusable(false);
        fieldDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDiskonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(fieldDiskon, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "20%", "30%", "50%", "80%" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jComboBox1, gridBagConstraints);
        jSlider1.setMinimum(0);
        jSlider1.setMaximum(80);
        jSlider1.setValue(10);
        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintTicks(true);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTrack(true);
        
        // Create labels for slider with 80% max
        Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel("0%"));
        labelTable.put(20, new JLabel("20%"));
        labelTable.put(40, new JLabel("40%"));
        labelTable.put(60, new JLabel("60%"));
        labelTable.put(80, new JLabel("80%"));
        jSlider1.setLabelTable(labelTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jSlider1, gridBagConstraints);

        btnDiskon.setText("Hitung!");
        btnDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiskonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        jPanel1.add(btnDiskon, gridBagConstraints);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel5.setText("Masukan Kupon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setText("SAVE10, SAVE20, SUPER50 ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Kode kupon yang aktif");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel1.add(jLabel7, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDiskonActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // Mengatur nilai slider sesuai dengan pilihan diskon di ComboBox
        String selectedDiskon = (String) jComboBox1.getSelectedItem();
        int diskonValue = Integer.parseInt(selectedDiskon.replace("%", ""));
        jSlider1.setValue(diskonValue);
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
        if (!jSlider1.getValueIsAdjusting()) {
            int value = jSlider1.getValue();
            String valueStr = value + "%";
            
            // Cek apakah nilai ada di ComboBox
            boolean found = false;
            for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                if (jComboBox1.getItemAt(i).equals(valueStr)) {
                    jComboBox1.setSelectedIndex(i);
                    found = true;
                    break;
                }
            }
            
            // Jika nilai tidak ada di ComboBox, langsung update perhitungan
            if (!found && fieldHarga.getText().length() > 0) {
                btnDiskonActionPerformed(null);
            }
        }
    }

    private double getCouponDiscount(String couponCode) {
        // Validasi kupon sederhana dengan nilai diskon tetap
        switch(couponCode.toUpperCase()) {
            case "SAVE10": return 0.10;
            case "SAVE20": return 0.20;
            case "SUPER50": return 0.50;
            default: return 0.0;
        }
    }

    private void btnDiskonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            // Ambil harga awal dari input pengguna
            double hargaAwal = Double.parseDouble(fieldHarga.getText());
            
            // Ambil persentase diskon dari slider
            double persenDiskon = jSlider1.getValue() / 100.0;
            
            // Ambil diskon dari kupon sebagai persentase dari harga awal
            String couponCode = jTextField2.getText().trim();
            double couponDiskonPersen = getCouponDiscount(couponCode);
            
            // Hitung total persentase diskon (slider + kupon)
            double totalPersenDiskon = Math.min(persenDiskon + couponDiskonPersen, 0.80);
            
            // Hitung diskon dan harga akhir
            double totalDiskon = hargaAwal * totalPersenDiskon;
            double hargaAkhir = hargaAwal - totalDiskon;
            
            // Tampilkan hasil
            fieldDiskon.setText(String.format("%.2f", hargaAkhir));
            jLabel4.setText(String.format("Anda hemat: Rp %.2f (Diskon %.0f%% + Kupon %.0f%%)", 
                          totalDiskon, persenDiskon * 100, couponDiskonPersen * 100));
            
            // Tambahkan ke riwayat
            String historyEntry = String.format(
                "Harga: Rp %.2f | Diskon: %.0f%% | Kupon: %s (%.0f%%) | Total Diskon: Rp %.2f | Harga Akhir: Rp %.2f\n",
                hargaAwal,
                persenDiskon * 100,
                couponCode.isEmpty() ? "-" : couponCode,
                couponDiskonPersen * 100,
                totalDiskon,
                hargaAkhir);
            jTextArea1.append(historyEntry);
            
        } catch (NumberFormatException e) {
            fieldDiskon.setText("Error");
            jLabel4.setText("Masukkan angka yang valid!");
        }
    }//GEN-LAST:event_btnDiskonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPerhitunganDiskon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPerhitunganDiskon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiskon;
    private javax.swing.JTextField fieldDiskon;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
