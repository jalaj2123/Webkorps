package com.hiber.spring.Hibern;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.spring.Persi.Emp;



/**
 * Hello world!
 *
 */
public class App 
{
   
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		
    	
    		 Session session =new Configuration().configure("com/hiber/spring/Hibern/hib.cfg.xml").buildSessionFactory().openSession();
    	        Transaction tx=session.beginTransaction();

    		Emp st=new Emp();
    		st.setId(11);
    		st.setName("jalaj");
    		st.setCity("Gwalior");
    		
    		
    		
    		session.save(st);
    		tx.commit();
    		session.close();
    		
    }
}
