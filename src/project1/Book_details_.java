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
import com.mongodb.MongoClient;
import java.awt.Color;
import java.net.UnknownHostException;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;
import static project1.ReceiptForm.amount_receipt;
import static project1.ReceiptForm.author;
import static project1.ReceiptForm.author_receipt;
import static project1.ReceiptForm.course;
import static project1.ReceiptForm.course_receipt;
import static project1.ReceiptForm.edition;
import static project1.ReceiptForm.edition_receipt;
import static project1.ReceiptForm.ppb_receipt;
import static project1.ReceiptForm.price_per_book;
import static project1.ReceiptForm.quantity;
import static project1.ReceiptForm.quantity_receipt;
import static project1.ReceiptForm.subject;
import static project1.ReceiptForm.subject_receipt;
import static project1.ReceiptForm.total_amount;
import static project1.ReceiptForm.yop;
import static project1.ReceiptForm.yop_receipt;

/**
 *
 * @author DELL
 */
public class Book_details_ extends javax.swing.JFrame {

    /**
     * Creates new form Book_details_
     */
    public Book_details_() {
        initComponents();
        pan.setBackground(new Color(0,0,0,0));
        pan2.setBackground(new Color(0,0,0,180));
        pan3.setBackground(new Color(0,0,0,180));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pan = new javax.swing.JPanel();
        pan2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pan3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        course_book_ = new javax.swing.JTextField();
        subject_book1 = new javax.swing.JTextField();
        author_book1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        edition_book1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        qty_book1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yop_book1 = new javax.swing.JTextField();
        ppb_book1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan.setBackground(new java.awt.Color(0, 51, 51));

        pan2.setBackground(new java.awt.Color(0, 102, 102));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 51));
        jButton2.setText("Show Books");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pan2Layout = new javax.swing.GroupLayout(pan2);
        pan2.setLayout(pan2Layout);
        pan2Layout.setHorizontalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pan2Layout.setVerticalGroup(
            pan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(39, 39, 39))
        );

        pan3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Course Name :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Subject :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Author :");

        course_book_.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        subject_book1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        author_book1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Edition :");

        edition_book1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        edition_book1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edition_book1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Quantity in stock :");

        qty_book1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Year of publication :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Price per book :");

        yop_book1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        yop_book1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yop_book1ActionPerformed(evt);
            }
        });

        ppb_book1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 255));
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 204));
        jLabel2.setText("Book Stock");

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pan3Layout.createSequentialGroup()
                                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)
                                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subject_book1)
                                    .addComponent(course_book_)))
                            .addGroup(pan3Layout.createSequentialGroup()
                                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pan3Layout.createSequentialGroup()
                                        .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(author_book1, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(edition_book1)
                                    .addComponent(qty_book1)
                                    .addComponent(ppb_book1)
                                    .addComponent(yop_book1)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(pan3Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(course_book_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(subject_book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(author_book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(edition_book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(qty_book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(yop_book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ppb_book1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pan3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(pan, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 52, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project1/2.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edition_book1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edition_book1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edition_book1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        course = course_book_.getText();
        subject = subject_book1.getText();
        author = author_book1.getText();
        edition = edition_book1.getText();
        yop = Integer.parseInt(yop_book1.getText());
        quantity = Integer.parseInt(qty_book1.getText());
        price_per_book = Integer.parseInt(ppb_book1.getText());
        
        
        MongoClient mongoClient = new MongoClient("localhost",27017);
        DB db = mongoClient.getDB("Book_Store_Management");
        DBCollection coll = db.getCollection("Book_Details_owner");
        
        BasicDBObject doc = new BasicDBObject("Course",course).append("subject",subject).append("author",author).append("edition",edition).append("yop",yop).append("quantity",quantity).append("price_per_book",price_per_book);
        coll.insert(doc);
        
        System.out.println(coll.getCount());
        DBCursor cursor = coll.find();
        try{
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }
        }finally{
            cursor.close();
        }
      }
      catch(UnknownHostException e){
          
      }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yop_book1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yop_book1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yop_book1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Update_owner_book uob = new Update_owner_book();
        
        String s = course_book_.getText();
        uob.owner_course.setText(s);
        String s1 = subject_book1.getText();
        uob.owner_sub.setText(s1);
        String s2 = author_book1.getText();
        uob.owner_auth.setText(s2);
        String s3 = edition_book1.getText();
        uob.owner_edition.setText(s3);
        String s4 = qty_book1.getText();
        uob.owner_qty.setText(s4);
        String s5 = yop_book1.getText();
        uob.owner_yop.setText(s5);
        String s6 = ppb_book1.getText();
        uob.owner_ppb.setText(s5);
        
        uob.setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MongoClient mongoClient = null;
        DBCursor cursor = null;
        try {
                mongoClient = new MongoClient( "localhost" , 27017 );
                DB db = mongoClient.getDB( "Book_Store_Management" );
                DBCollection coll = db.getCollection("Book_Details_owner");
                cursor = coll.find();

                String[] columnNames = {"id", "Course","Subject" ,"Author","Edition","Year of Passing","Quantity","Price per book"}; //
                DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                while(cursor.hasNext()) {
                    DBObject obj = cursor.next();
                    String course = (String)obj.get("Course");
                    String subject = (String)obj.get("subject");
                    String author = (String)obj.get("author");
                    String edition = (String)obj.get("edition");
                    int yop = ((Number) obj.get("yop")).intValue();
                    int qty = ((Number) obj.get("quantity")).intValue();
                    int ppb = ((Number) obj.get("price_per_book")).intValue();     
                    ObjectId id = (ObjectId)obj.get("_id");
                    model.addRow(new Object[] { id, course, subject, author, edition, yop, qty, ppb});
                }
                Owner_book_table owt = new Owner_book_table();
                owt.t1.setModel(model);
                owt.setVisible(true);
                

                cursor.close(); 
                mongoClient.close();
            } catch (UnknownHostException ex) {
                
            } finally {
                if (cursor!= null) {
                    cursor.close();
                }
                if (mongoClient != null) {
                     mongoClient.close();
                }   
            }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        setVisible(false);
        new admin_front().toFront();
        new admin_front().setState(java.awt.Frame.NORMAL);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Book_details_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_details_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_details_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_details_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_details_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_book1;
    private javax.swing.JTextField course_book_;
    private javax.swing.JTextField edition_book1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pan;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JTextField ppb_book1;
    private javax.swing.JTextField qty_book1;
    private javax.swing.JTextField subject_book1;
    private javax.swing.JTextField yop_book1;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
