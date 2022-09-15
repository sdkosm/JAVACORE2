package q17;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> dk = new Hashtable<>();
		
        //Add some data in hashtable
		
        dk.put(65, "A");
        dk.put(66, "B");
        dk.put(67, "C");
        dk.put(68, "D");
//        dk.put(68, "T");
//        dk.put(69, "D");                                      //Have doubts in three comment as well as output sequence, Well what ? 
//        dk.put(70, "");
 
        // Print and display the HashTable elements
        
        System.out.println(dk);
	}

}
