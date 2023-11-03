package pack1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
	public static void main(String[] args)
	{
			SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class).buildSessionFactory();
			
			Session s = sf.getCurrentSession();
			try
			{
			// create object and send to DB
			
			User u = new User("vikas GJA","Vikas","GJA");
			
			// start transaction (java file and DB server)
			
			s.beginTransaction();
			
			// Perform CRUD operation	-->create & update
			s.save(u);
			
			// Commit the Transaction
			s.getTransaction().commit();
			
			System.out.println("Row is added successfully....!");
		}
		catch (HibernateException e)
		{
			e.printStackTrace();
		}
		finally
		{
			s.close();
			sf.close();
		}
		
		
	}

}