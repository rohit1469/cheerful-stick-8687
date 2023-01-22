package UseCases;

import java.util.Scanner;

import Dao.BDODao;
import Dao.BDODaoImpl;
import Dao.GPMDaoImpl;
import Dao.GpmDao;
import JavaBean.Employee;

public class RegisterEmployee {
	public static void REmployee() {
	     Scanner sc= new Scanner(System.in);
	     
	     
	       	System.out.println("Enter Employee id:");
			int id= sc.nextInt();
			
			System.out.println("Enter Employee  Name:");
			String name= sc.next();
			
			System.out.println("Enter Employee  phone:");
			String phone= sc.next();
			
			System.out.println("Enter Employee  address:");
			String address= sc.next();
			
			System.out.println("Enter Employee  totaldaywork:");
			int daywork= sc.nextInt();  
			
			System.out.println("Enter Employee wages:");
			String wages= sc.next();
			
			
			BDODao dao=new BDODaoImpl();
			
			
			
			Employee emp= new Employee(id, name, phone, address, daywork, wages);
			
			GpmDao gdaao= new GPMDaoImpl();
			String result=gdaao.registerEmployee(emp);
		
		

			
			
			System.out.println(result);
	}
}
