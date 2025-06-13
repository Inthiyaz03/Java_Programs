package com.tap.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tap.entity.StudentDetails;
import com.tap.entity.StudentEntity;

public class Main {
	
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.addAnnotatedClass(StudentEntity.class);
		config.addAnnotatedClass(StudentDetails.class);
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction bt = session.beginTransaction();
		
		StudentEntity s = new StudentEntity(2,"om","om come to my room",25);
		StudentDetails sud=new StudentDetails(2, "adipurush",-100);
		s.setSd(sud);
		sud.setStudent(s);
		session.save(s);
//		session.persist(s);
	
		
		bt.commit();
		
		
	}
}
