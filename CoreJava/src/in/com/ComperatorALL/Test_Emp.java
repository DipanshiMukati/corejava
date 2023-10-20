package in.com.ComperatorALL;

import java.util.ArrayList;
import java.util.Collections;

public class Test_Emp {

	public static void main(String[] args) {
		ArrayList<Employee>empn = new ArrayList<Employee>();
		empn.add(new Employee());
		empn.add(new Employee());
		empn.add(new Employee(3,"","45678"));
        
		System.out.println(empn);
		
		Collections.sort(empn,new CompratorByname());
		 System.out.println(empn);
		 
		ArrayList<Employee>empid =new ArrayList<Employee>(empn);
		    Collections.sort(empid, new CompratorByname());
		    System.out.println(empid);
	}

}
