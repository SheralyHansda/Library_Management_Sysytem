/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author shera
 */
public class Borrowed_Books extends javax.swing.JFrame {

      
       
    public Borrowed_Books() {
        initComponents();
    }
    public void Borrowed_BooksPage()throws Exception{
        
        
           
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txt_bookId = new javax.swing.JTextField();
        txt_bookName = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Label_bookID = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Label_bookName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Label_Quantity = new javax.swing.JLabel();
        Button_BACK = new javax.swing.JButton();
        Button_add1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_bookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookIdActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 230, -1));
        jPanel2.add(txt_bookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 230, -1));
        jPanel2.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 230, -1));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        Label_bookID.setBackground(new java.awt.Color(0, 0, 0));
        Label_bookID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_bookID.setText("Enter Book ID");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Label_bookID)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label_bookID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 190, 30));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        Label_bookName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_bookName.setText("Enter Book Name");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Label_bookName)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(Label_bookName)
                .addContainerGap())
        );

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 30));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        Label_Quantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Quantity.setText("Quantity");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Label_Quantity)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 190, 30));

        Button_BACK.setBackground(new java.awt.Color(204, 0, 0));
        Button_BACK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_BACK.setForeground(new java.awt.Color(255, 255, 255));
        Button_BACK.setText("BACK");
        Button_BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_BACKActionPerformed(evt);
            }
        });
        jPanel2.add(Button_BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 110, 40));

        Button_add1.setBackground(new java.awt.Color(204, 0, 0));
        Button_add1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Button_add1.setForeground(new java.awt.Color(255, 255, 255));
        Button_add1.setText("ADD");
        Button_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_add1ActionPerformed(evt);
            }
        });
        jPanel2.add(Button_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bookIdActionPerformed

    private void Button_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_add1ActionPerformed
          String BookID = txt_bookId.getText();
          String BookName = txt_bookName.getText();
          String Quantity = txt_quantity.getText();
          try
          {
              Connection con=ConnectionProvider.getCon();
              Statement st=con.createStatement();
//            
              st.executeUpdate("insert into borrowed_books values('"+BookID+"','"+BookName+"','"+Quantity+"')");
              JOptionPane.showMessageDialog(null, "Successfully Added");
              setVisible(false);
              new Borrowed_Books().setVisible(true);
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null,e);
              setVisible(false);
              new Borrowed_Books().setVisible(true);
          }
    }//GEN-LAST:event_Button_add1ActionPerformed

    private void Button_BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_BACKActionPerformed
        
        setVisible(false);
        new Borrower().setVisible(true);
    }//GEN-LAST:event_Button_BACKActionPerformed

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
            java.util.logging.Logger.getLogger(Borrowed_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrowed_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrowed_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrowed_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrowed_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_BACK;
    private javax.swing.JButton Button_add1;
    private javax.swing.JLabel Label_Quantity;
    private javax.swing.JLabel Label_bookID;
    private javax.swing.JLabel Label_bookName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txt_bookId;
    private javax.swing.JTextField txt_bookName;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
