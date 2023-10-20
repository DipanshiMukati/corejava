package in.com.Iterator;


public class Employee {
      private int id=0;
      private String name=null;
      private String address=null;

   public Employee(int id,String name,String address) {
          this.id=id;
          this.name=name;
          this.address=address;
   }
          
    
        //	    @Override
//	    public int hashCode() {
//	    	// TODO Auto-generated method stub
//	    	return super.hashCode();
//	    }
//	    @Override
//	    public boolean equals(Object obj) {
//	    	// TODO Auto-generated method stub
//	    	return super.equals(obj);
//	    }
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return id+" "+name+" "+address;
	    }
}	     
              
              
        
              
	            
        
     

