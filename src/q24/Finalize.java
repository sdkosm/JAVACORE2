package q24;

public class Finalize {

	 public static void main(String[] args)   
	    {   
	        Finalize obj = new Finalize();   
	        System.out.println(obj.hashCode());   
	        obj = null;   
	        
	        // calling garbage collector 
	        
	        System.gc();   
	        System.out.println("end of garbage collection");   
	    }   
	 
	    @Override  
	    protected void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
	
}
