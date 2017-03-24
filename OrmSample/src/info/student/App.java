package info.student;

import java.util.Scanner;

public class App {

	private static Scanner scanner;

	public static void main(String[] args) 
	
	
	{
		
		
		scanner = new Scanner(System.in);
		System.out.println("enter the name");
	String name=	scanner.nextLine();
	
	
	
	System.out.println("enter the salary");
	
	Double salary=scanner.nextDouble();
	
	
	
	Employee employee=new Employee();
	employee.setName(name);
	
	employee.setSalary(salary);
	
	
	InsertRecord insertRecord=new InsertRecord();
	
 insertRecord.save(employee);
	}

}
