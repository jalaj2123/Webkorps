package com.hiber.persi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.first.Hiber.Pers;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("com/hiber/persi/hib.confg.xm");
		SessionFactory factory=cfg.buildSessionFactory();
		Pers st=new Pers();
		st.setCity("Gwalior");
		st.setId(11);
		st.setName("jalaj");
		Session session=factory.getCurrentSession();
		Transaction tx=session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		

	}

}
