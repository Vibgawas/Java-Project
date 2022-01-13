/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project1;
import com.mongodb.BasicDBObject;

import com.mongodb.DB;

import com.mongodb.DBCollection;

import com.mongodb.MongoClient;

import com.mongodb.MongoClientOptions;

import com.mongodb.MongoCredential;

import com.mongodb.ServerAddress;

import java.net.UnknownHostException;

import com.mongodb.*;

import java.util.List;

import java.util.Set;
    

/**
 *
 * @author DELL
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException{
        // TODO code application logic here
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

        DB db = mongoClient.getDB("Book_Store_Management");

        Set<String> colls = db.getCollectionNames();
        
        for (String s:colls){
            System.out.println(s);
        }
        
        DBCollection coll = db.getCollection("Customer");
        
        String name = "Garima";
        BasicDBObject doc = new BasicDBObject("f_name",name);
            doc.append("m_name", "Vedprakash");
            doc.append("l_name","Gupta");
            doc.append("email_id","garima123@gmail.com");
            doc.append("password", 'v');
            
        coll.insert(doc);
        System.out.println(coll.getCount());
        DBCursor cursor = coll.find();
        try {
            while(cursor.hasNext()){
                System.out.println(cursor.next());
            }
        }
        finally{
            cursor.close();
        }
        
        DBCollection coll1 = db.getCollection("Book_Details");
        
        String course = "IT";
        BasicDBObject doc1 = new BasicDBObject("cust_course",course);
            doc1.append("cust_name","Vaibhavi Deepak Gawas.");
            doc1.append("cust_subject","DBMS");
            doc1.append("cust_author", "A.K.Rai");
            doc1.append("cust_edition","Fourth");
            doc1.append("cust_yop",2000);
            doc1.append("cust_quantity",2);
            doc1.append("cust_price_per_book",200);
            doc1.append("total_amount",400);
            
            
        coll1.insert(doc1);
        System.out.println(coll1.getCount());
        DBCursor cursor1 = coll1.find();
        try {
            while(cursor1.hasNext()){
                System.out.println(cursor1.next());
            }
        }
        finally{
            cursor1.close();
        }
        
        DBCollection coll2 = db.getCollection("Book_Details_owner");
        
        course = "IT";
        BasicDBObject doc2 = new BasicDBObject("Course",course);
            doc2.append("subject","DBMS");
            doc2.append("author", "A.K.Rai");
            doc2.append("edition","Fourth");
            doc2.append("yop",2000);
            doc2.append("quantity",20);
            doc2.append("price_per_book",200);
            
            
        coll2.insert(doc2);
        System.out.println(coll2.getCount());
        DBCursor cursor2 = coll2.find();
        try {
            while(cursor2.hasNext()){
                System.out.println(cursor2.next());
            }
        }
        finally{
            cursor2.close();
        }
        
    }
    
    
}
