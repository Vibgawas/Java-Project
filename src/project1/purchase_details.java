/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project1;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import java.awt.Color;
import java.net.UnknownHostException;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.bson.types.ObjectId;
import static project1.Owner_book_table.search_course;
import static project1.ReceiptForm.amount_receipt;
import static project1.ReceiptForm.ppb;
import static project1.ReceiptForm.ppb_receipt;
import static project1.ReceiptForm.quantity_receipt;
import static project1.ReceiptForm.subject_receipt;
import static project1.User_Update.new_fname;
import static project1.User_Update.old_name;

/**
 *
 * @author DELL
 */
public class purchase_details extends javax.swing.JFrame {

    private Object quantity_in_stock;
    private int quantity;
    int total_qty,a;

    /**
     * Creates new form purchase_details
     */
    
    public purchase_details() {
        initComponents();
        pan1.setBackground(new Color(255,255,255,180));
        pan2.setBackground(new Color(255,255,255,180));
        pan3.setBackground(new Color(0,0,0,0));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pan3 = new javax.swing.JPanel();
        pan1 = new javax.swing.JPanel();
        purchase_course = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchase_table = new javax.swing.JTable();
        pan2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        c1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yop1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sub1 = new javax.swing.JTextField();
        e1 = new javax.swing.JTextField();
        qty1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        new_cust = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan3.setBackground(new java.awt.Color(0, 51, 51));

        pan1.setBackground(new java.awt.Color(0, 102, 102));

        purchase_course.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        purchase_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchase_courseActionPerformed(evt);
            }
        });
        purchase_course.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                purchase_courseKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Course Name : ");

        purchase_table.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        purchase_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(purchase_table);

        javax.swing.GroupLayout pan1Layout = new javax.swing.GroupLayout(pan1);
        pan1.setLayout(pan1Layout);
        pan1Layout.setHorizontalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan1Layout.createSequentialGroup()
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(purchase_course, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan1Layout.setVerticalGroup(
            pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchase_course, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pan2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Course                     :");

        c1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Author                     :");

        a1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Year Of Publication :");

        yop1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(0, 153, 153));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Subject                  :");

        jLabel7.setBackground(new java.awt.Color(0, 153, 153));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Edition                  :");

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Quantity Required :");

        sub1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        e1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });

        qty1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        new_cust.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        new_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_custActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 153, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Customer Name       :");

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(new_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 374, 374))
                    .addGroup(pan2Layout.createSequentialGroup()
                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pan2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pan2Layout.createSequentialGroup()
                                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pan2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yop1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan2Layout.createSequentialGroup()
                                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pan2Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1))
                                .addGap(64, 64, 64)))
                        .addGap(62, 62, 62))))
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(new_cust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c1)
                    .addComponent(jLabel6)
                    .addComponent(sub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(yop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(pan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/2.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void purchase_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchase_courseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_purchase_courseActionPerformed

    private void purchase_courseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_purchase_courseKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) purchase_table.getModel();
        String search = purchase_course.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        purchase_table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_purchase_courseKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReceiptForm rf= new ReceiptForm();
        String s=new_cust.getText();
        rf.name.setText(s);
        
        
        String s1 = (String) c1.getText();
        rf.course_receipt.setText(s1);
        String s2 = (String) sub1.getText();
        rf.subject_receipt.setText(s2);
        String s3 = (String) a1.getText();
        rf.author_receipt.setText(s3);
        String s4 = (String) e1.getText();
        rf.edition_receipt.setText(s4);
        String s5 = (String) yop1.getText();
        rf.yop_receipt.setText(s5);
        String s6 = (String) qty1.getText();
        rf.quantity_receipt.setText(s6);
        rf.setVisible(true);
        /*String s7 = "200";
        rf.ppb_receipt.setText(s7);
        int s8 = Integer.parseInt(s6)*Integer.parseInt(s7);
        rf.amount_receipt.setText(String.valueOf(s8));*/
        
        String s7 = (String) sub1.getText();
        
        MongoClient mongoClient = null;
        DBCursor cursor = null;
        try {
                mongoClient = new MongoClient( "localhost" , 27017 );
                DB db = mongoClient.getDB( "Book_Store_Management" );
                DBCollection coll1 = db.getCollection("Book_Details_owner");
                BasicDBObject whereQuery = new BasicDBObject();
                whereQuery.append("Course",s1);
                whereQuery.append("subject",s7);
                whereQuery.append("author",s3);
                whereQuery.append("edition",s4);
                whereQuery.append("yop",Integer.parseInt(s5));
                DBCursor cursor1 = coll1.find(whereQuery);

                if(cursor1.hasNext()) {
                    DBObject obj = cursor1.next();
                    ppb = ((Number) obj.get("price_per_book")).intValue();
                    total_qty = ((Number) obj.get("quantity")).intValue();  
                }

             
                ReceiptForm.ppb_receipt.setText(String.valueOf(ppb));
                int s8 = Integer.parseInt((String) qty1.getText())*ppb;
                amount_receipt.setText(String.valueOf(s8));
                
                a = total_qty-Integer.parseInt(s6);
                
                
                try{
                Mongo mongo = new Mongo("localhost",27017);
                DB db1 = mongo.getDB("Book_Store_Management");
                DBCollection collection = db1.getCollection("Book_Details_owner");

                BasicDBObject document = new BasicDBObject();
                document.append("$set",new BasicDBObject().append("quantity",a));

                BasicDBObject search_document = new BasicDBObject().append("subject", s7).append("Course",s1).append("author",s3).append("edition",s4).append("yop",Integer.parseInt(s5));

                collection.update(search_document,document);

                } 
                catch(UnknownHostException e){
                }
                

                //cursor.close(); 
                //mongoClient.close();
            } catch (UnknownHostException ex) {
                
            } finally {
                if (cursor!= null) {
                    cursor.close();
                }
                if (mongoClient != null) {
                     mongoClient.close();
                }   
            }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void new_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_custActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_new_custActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new Home().toFront();
        new Home().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

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
            java.util.logging.Logger.getLogger(purchase_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField a1;
    public static javax.swing.JTextField c1;
    public static javax.swing.JTextField e1;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField new_cust;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    public static javax.swing.JTextField purchase_course;
    public static javax.swing.JTable purchase_table;
    private javax.swing.JTextField qty1;
    public static javax.swing.JTextField sub1;
    private javax.swing.JTextField yop1;
    // End of variables declaration//GEN-END:variables
}
