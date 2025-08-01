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
        alien.setAid(101);
        alien.setColor("Green");
        AlienName aname = new AlienName();
        aname.setFname("John");
        aname.setLname("Doe");
        alien.setAname(aname);

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();  

        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);    

        Session session = sessionFactory.openSession(); 
        
        session.save(alien);

        Transaction transaction = session.beginTransaction();

        // alien = session.get(Alien.class, 101);
        
        transaction.commit();

        System.out.println(alien);

    }
}
