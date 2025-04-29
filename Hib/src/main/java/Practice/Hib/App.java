package Practice.Hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory fact = cfg.buildSessionFactory();
        Session sess = fact.openSession();
        sess.beginTransaction();
        Person p = new Person();
        Adhar ac = new Adhar(1112,"Poorna", "btm", "male",p);
        p.setId(102);
        p.setNickName("sou");
        p.setAdhar(ac);
        
        sess.persist(p);
        sess.persist(ac);
        
        sess.getTransaction().commit();
    }
    
}
