package javaproje2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class AnaPanel extends javax.swing.JFrame {
    
    public int y = 6;
    public int sayac = 0;
    
    public AnaPanel() throws SQLException {
        initComponents();
        LoginPanel panel = new LoginPanel();
        String name = "";
        Connection con = (Connection) panel.veritabaniBaglanti();
        Statement st = (Statement) con.createStatement();
        String sorgu = "select machine_id,machine_status,machine_work,machine_worker from machine_stuffs";
        ResultSet rs = st.executeQuery(sorgu);
        while(rs.next()){
            name = rs.getString("machine_id");
            JButton button = new JButton(name);
            jPanel1.add(button);
            grup.add(button);
            button.setBounds(6,y,282,28);
            sayac++;
            button.addActionListener((java.awt.event.ActionEvent e) -> {
                try {
                    String sorgu2 = "select machine_status,machine_work,machine_worker from machine_stuffs where machine_id='" + e.getActionCommand() +"'";
                    String status = "",work = "",worker = "";
                    ResultSet rs2 = st.executeQuery(sorgu2);
                    while(rs2.next()){
                        status = rs2.getString("machine_status");
                        work = rs2.getString("machine_work");
                        worker = rs2.getString("machine_worker");
                    }   yazdirma(status,work,worker);
                } catch (SQLException ex) {
                    Logger.getLogger(AnaPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            y+= 31;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MakinaDurumu = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Is = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Calisan = new javax.swing.JLabel();
        onay = new javax.swing.JLabel();
        SariPanel = new javax.swing.JButton();
        Cikis = new javax.swing.JButton();
        ekle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel1.setText("Makina Durumu");

        jLabel3.setText("İş");

        jLabel5.setText("Çalışan");

        SariPanel.setText("Sarı Panel");
        SariPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SariPanelActionPerformed(evt);
            }
        });

        Cikis.setText("Çıkış");
        Cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CikisActionPerformed(evt);
            }
        });

        ekle.setText("Makine Ekle");
        ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(ekle)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Cikis)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MakinaDurumu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Is, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Calisan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SariPanel)
                        .addGap(0, 35, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(onay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                            .addComponent(MakinaDurumu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                            .addComponent(Is, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Calisan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ekle)
                        .addGap(50, 50, 50)
                        .addComponent(onay, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SariPanel)
                            .addComponent(Cikis)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void CikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CikisActionPerformed
        setVisible(false);
        LoginPanel panel = new LoginPanel();
        panel.setVisible(true);
    }//GEN-LAST:event_CikisActionPerformed

    private void SariPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SariPanelActionPerformed
        setVisible(false);
        SariPanel panel = new SariPanel();
        panel.setVisible(true);
    }//GEN-LAST:event_SariPanelActionPerformed

    private void ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleActionPerformed
        try {
            LoginPanel panel = new LoginPanel();
            Connection con = (Connection) panel.veritabaniBaglanti();
            Statement st = (Statement) con.createStatement();
            String m_name = "Makine" + String.valueOf(sayac);
            sayac++;
            System.out.println(m_name);
            String sorgu = "insert into machine_stuffs(machine_id,machine_status,machine_work,machine_worker) values('"+ m_name +"','bosta','yok','yok')";
            st.executeUpdate(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AnaPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ekleActionPerformed

    
    public void yazdir(java.awt.event.ActionEvent event) throws SQLException
    {
        LoginPanel panel = new LoginPanel();
        String status = "",work = "" ,worker = "";
        String machine_id = event.getActionCommand();
        Connection con = (Connection) panel.veritabaniBaglanti();
        Statement st = (Statement) con.createStatement();
        String sorgu = "select machine_status,machine_work,machine_worker from machine_stuffs where machine_id='" + machine_id + "'";
        ResultSet rs = st.executeQuery(sorgu);
        while(rs.next()){
            status = rs.getString("machine_status");
            work = rs.getString("machine_work");
            worker = rs.getString("machine_worker");
        }
        yazdirma(status,work,worker);
    }
    public void yazdirma(String status,String work,String worker){
        MakinaDurumu.setText(status);
        Is.setText(work);
        Calisan.setText(worker);
    }
    
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
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AnaPanel().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AnaPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Calisan;
    private javax.swing.JButton Cikis;
    private javax.swing.JLabel Is;
    private javax.swing.JLabel MakinaDurumu;
    private javax.swing.JButton SariPanel;
    private javax.swing.JButton ekle;
    private javax.swing.ButtonGroup grup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel onay;
    // End of variables declaration//GEN-END:variables
}
