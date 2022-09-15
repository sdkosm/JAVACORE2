package q17;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap1 {

	 public static void main(String[] args)
	    {
		 
	        ConcurrentHashMap<Integer, String> dk = new ConcurrentHashMap<>();   // Creating ConcurrentHashMap class object
	 
	        dk.put(65, "A");
	        dk.put(66, "B");                                                     // put some data in ConcurrentHashmap
	 
	        System.out.println(dk);
	 //..................................................................
	        dk.putIfAbsent(67, "C");                                             //Custom data if not present
	        dk.putIfAbsent(68, "D");
	 
	        System.out.println(dk);
	 //...................................................................
	        
	        dk.remove(68, "D");                                                 // Removing entry With Key and Value as 68 and D
	 
	        System.out.println(dk);
	//....................................................................
	        
	        dk.replace(66, "B", "E");                                            // Replacing  Value of an entry
	 
	        System.out.println(dk);                                              // Again, print and display the ConcurrentHashMap
	    }
}
