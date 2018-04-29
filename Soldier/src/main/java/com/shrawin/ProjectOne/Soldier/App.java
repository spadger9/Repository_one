package com.shrawin.ProjectOne.Soldier;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Soldier soldier = new Soldier();
//        soldier.setIdNumber(102);
//        soldier.setFirstName("Sanju");
//        soldier.setLastName("Baba");
//        soldier.setPhoneNumber("791-858-8623");
        
        
        Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Soldier.class);
                
        SessionFactory sf = config.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
       // session.save(soldier);
        
        soldier = (Soldier) session.get(Soldier.class, 101);
        tx.commit();
        
        System.out.println(soldier);
    }
}


