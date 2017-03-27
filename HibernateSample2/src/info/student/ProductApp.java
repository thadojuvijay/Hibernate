package info.student;

import java.util.Scanner;

public class ProductApp

{
private static Scanner scanner;

public static void main(String[] args) {
	
	
scanner = new Scanner(System.in);

System.out.println("Enter the pname");
String Pname=scanner.nextLine();

System.out.println("ënter the price");

Double price=scanner.nextDouble();


Product product=new Product();

product.setName(Pname);
product.setPrice(price);
InsertProductDetails insertProductDetails=new InsertProductDetails();
insertProductDetails.saveProductDetails(product);
}

}