package q18;

public class Perfomance {

	 public static void main(String[] args){  
	        long startTime = System.currentTimeMillis(); 
	        
	        StringBuffer dk = new StringBuffer("I like travelling ");  
	        for (int i=0; i<10; i++){  
	            dk.append("and Spiritual visit ");  
	        }  
	        System.out.println(dk);
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        
	        StringBuilder dk2 = new StringBuilder("I like travelling ");  
	        for (int i=0; i<10; i++){  
	            dk2.append("and Spiritual visit");  
	        }  
	        System.out.println(dk2);
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	    }
	
}
