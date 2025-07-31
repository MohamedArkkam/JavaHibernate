package com.basic;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
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
        
        Alien alien = new Alien();
        alien.setAid(102);
        alien.setAname("ark");
        alien.setColor("blue");

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();  

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);    

        Session session = sessionFactory.openSession();  

        Transaction transaction = session.beginTransaction();

        session.save(alien);
        
        transaction.commit();

    }
}
