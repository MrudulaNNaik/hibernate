package com.niit.JavaHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        StudentName studentName = new StudentName("Mrudula", "N", "Naik");
        //Student student = new Student(2, "poorna", 8,69);
        Student student = new Student(4, 9, 59, studentName);
        
        
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);

        
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
		
		/*
		 * session.save(student); transaction.commit();
		 */
		/*
		 * Student s = session.get(Student.class, 1); System.out.println(s);
		 */
		 
        session.save(student);
		transaction.commit();
        
        
      
    }
}