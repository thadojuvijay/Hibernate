package info.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertProductDetails
 {

	
	
	public void saveProductDetails(Product product)
	{
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	
	session.beginTransaction();
	
	session.save(product);
	
	session.getTransaction().commit();
	session.close();
	
	
	
	
	
	sessionFactory.close();
	
}
}
