package UseCases;

import java.util.Scanner;

import Dao.BDODao;
import Dao.BDODaoImpl;
import Exception.EmployeeException;
import Exception.ProjectException;

public class AssignProjecttoEmp {
	public static void AProjecttoEmp() {
		  Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the Project id");
			int pd=sc.nextInt();
			
			System.out.println("Enter the Employee id");
			int ed=sc.nextInt();
			
		
			
			try {

				BDODao bd= new BDODaoImpl();
		
			try {
				String rs = bd.AssignProjectToEmployeee(pd, ed);
				System.out.println(rs);
			} catch (ProjectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
