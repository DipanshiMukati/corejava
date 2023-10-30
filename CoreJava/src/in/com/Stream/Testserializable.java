package in.com.Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Testserializable {
	public static void main(String[] args) throws IOException {
		FileOutputStream  in= new FileOutputStream("C:\\Users\\AA\\Desktop\\javaIO\\obj.txt");
		ObjectOutputStream out = new ObjectOutputStream(in);
		
		Markseet m= new Markseet();
		m.id =1;
		m.name = "dipanshi";
		m.python= 70;
		m.css=74;
		m.html= 70;
		m.javascript=76;
		m.java=90;
		m.total=m.python+m.css+m.html+m.javascript+m.java;
	     out.writeObject(m);
	     in.close();out.close();
	     System.out.println("data convert in bytstream");
	     	
	}


}
