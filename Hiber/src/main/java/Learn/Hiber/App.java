package Learn.Hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//Student st = new Student(2,"Soubhagya","Mico",2024);
    	Configuration cfg = new Configuration();
    	cfg.configure();
    	SessionFactory fact = cfg.buildSessionFactory();
       Session sess = fact.openSession();
       //Transaction tx = sess.beginTransaction();
       
       //sess.save(st);
       //tx.commit();
       
       Student st = sess.get(Student.class, 1);
       System.out.println(st);
        
    }
    
}
