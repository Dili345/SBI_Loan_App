package com.jtcindia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.google.protobuf.Empty;

public class Lab2 {

	public static void main(String[] args) {
//		Transaction tx= null;
//		try {
//		SessionFactory  sessionFactory	  = HibernateUtil.getSessionFactory();


                                 tx=session.beginTransaction();
                                  System.out.println("Change the Life");
                                  int bb=90;
                                  double ff=10.2f;

               
//		   Session session =sessionFactory.openSession();
//		   tx = session.beginTransaction();
//		   //Your Persistence Operation hare
//		   Customer  cust= session.load(Customer.class,1);//trying to fetch record.
//		                                                  //get() s bhi fetch karte h diff. load() and get() k see later
//		   System.out.println(cust);
//		   tx.commit();
//		   session.close();
//		   
//		} catch (Exception e) {
//			 tx.rollback();
//			 e.printStackTrace();
//		}
		
		
		
		Transaction tx=null;
		try {
			SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			
			tx= session.beginTransaction();
			
			//Your Persistance Operation hare
			Customer cust = session.load(Customer.class, 1);//get
			System.out.println(cust);
			tx.commit();
			session.close();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
