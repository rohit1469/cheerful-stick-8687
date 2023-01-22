package UseCases;

import java.util.List;

import Dao.BDODao;
import Dao.BDODaoImpl;
import Exception.GpmException;
import JavaBean.Gpm;

public class GetAllGpm {
public static void GAllGpm()  {
		
		BDODao dao=new BDODaoImpl();
		
		try {
			List<Gpm> gpm=dao.getAllGPM();
			 
			gpm.forEach(s->{
				
				System.out.println("************************************");
				
				System.out.println("Grampchyat member name: "+s.getGname());
				System.out.println("Grampchyat member email: "+s.getGemail());
				System.out.println("Grampchyat member Password: "+s.getGpassword());
				System.out.println("Grampchyat member Mobile:   "+s.getGmobile());
				
				System.out.println("Grampchyat member Address:  "+s.getGaddress());
				
				System.out.println("************************************");
			});
			
		} catch (GpmException e) {
		     System.out.println(e.getMessage());
		}
		
	}

}
