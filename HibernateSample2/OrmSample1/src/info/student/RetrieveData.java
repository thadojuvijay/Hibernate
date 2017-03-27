package info.student;



import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class RetrieveData
{
ArrayList<Employee>arrayList=new ArrayList<Employee>();

	 public ArrayList<Employee> RetrieveFromDb()
	 {
		 Configuration configuration=new Configuration();
		 configuration.configure();
		 SessionFactory sessionFactory = configuration.buildSessionFactory();
		 Session session = sessionFactory.openSession();
		 Employee employee=new Employee();
session.load(employee, 5);

employee.getEno();
employee.getName();
employee.getSalary();
arrayList.add(employee);
		 session.close();
		 
		 
		 sessionFactory.close();
		return arrayList;
	 }
}
