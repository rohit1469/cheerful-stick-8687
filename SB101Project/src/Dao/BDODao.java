package Dao;

import java.util.List;

import Exception.BDOException;
import Exception.EmployeeException;
import Exception.GpmException;
import Exception.ProjectException;
import JavaBean.Bdo;
import JavaBean.EmpDTO;
import JavaBean.Gpm;
import JavaBean.Project;

public interface BDODao {
		
	     public Bdo loginBDO(String username, String password)throws BDOException;
		
		public String createProject(int pid, String pname, String pcost, String pissuedate);
		
		public List<Project> getAllProjectDetails()throws ProjectException;

		public String registerGPM(Gpm gpm);

		public List<Gpm> getAllGPM()throws GpmException;
		
		
		public String AssignProjectToGPM(int pid, int gid)throws GpmException,ProjectException ;
		
		public String AssignProjectToEmployeee(int pid, int eid)throws EmployeeException,ProjectException ;
		
		public List<EmpDTO> getAllEmployeeByPname(String pname)throws ProjectException;


	}

