package info.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) 
	{
//		Employee employee=new Employee();
//		 employee.setEno(89);
//		 employee.setName("vijay");
//		 employee.setSalary(78888d);
	
Configuration configuration=new Configuration();
configuration.configure();
  SessionFactory sessionFactory = configuration.buildSessionFactory();
  
  Session session = sessionFactory.openSession();
  session.beginTransaction();
Employee employee = session.load(Employee.class, 89);
System.out.println(employee.getEno());
System.out.println(employee.getName());
System.out.println(employee.getSalary());

//update employee.setSalary(89752d);
// delete session.delete(employee);

 // insert session.save(employee);
  
  session.getTransaction().commit();
  
  
  
  
  
  session.close();
  
  
  
  sessionFactory.close();
  

	}

}
