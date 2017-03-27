package info.student;

import java.util.ArrayList;

public class GetData {

	public static void main(String[] args)
	{
		
		RetrieveData data=new RetrieveData();
	 ArrayList<Employee> arrayList = data.RetrieveFromDb();
		
for (Employee employee : arrayList) {
	
	
	System.out.println(employee.getEno());
	System.out.println(employee.getName());
	System.out.println(employee.getSalary());
}
	}

}
