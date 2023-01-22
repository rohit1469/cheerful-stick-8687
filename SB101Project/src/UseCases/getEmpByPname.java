 package UseCases;

import java.util.List;
import java.util.Scanner;

import Dao.BDODao;
import Dao.BDODaoImpl;
import JavaBean.EmpDTO;

public class getEmpByPname {

	public static void getEmplPname() {
		
		
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Project Name");
		
		String cname= sc.next();

		
		BDODao dao = new BDODaoImpl();
		
		try {
		List<EmpDTO> dtos= dao.getAllEmployeeByPname(cname);
		
		dtos.forEach(dto -> {
			System.out.println(dto);
//			System.out.println("name "+ dto.getEname());
//			System.out.println("Day_w "+ dto.getDayworked());
//			System.out.println("Eaddress "+ dto.getEaddress());
//			System.out.println("Emobile "+ dto.getEmobile());
//			System.out.println("pname "+ dto.getPname());
//			System.out.println("Ewages "+ dto.getEwages());
			System.out.println("****************************************")
			;
		});
		
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

