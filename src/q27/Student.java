package q27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
	    String firstName;
	    String secondName;
	    transient String fullName;
	    String email;
	    String password;
	    Date dob;

//	    Create Constructor

	    Student(String firstName, String  secondName, String email, String password, Date dob) {
	        this.firstName = firstName;
	        this.secondName = secondName;
	        this.email = email;
	        this.password = password;
	        this.dob = dob;
	        this.fullName = firstName + " " + secondName;
	    }

	    
	    public static void main(String[] args) {
	        Student student = new Student("Mohan", "Sharma",
	                "sdkosm23@gmail.com",
	                "zxcvbnm@123",
	                new Date());

	        serialize(student);
	        deserialize();

	    }

	    
//	    Method to serialize object
	 
	 	    private static void serialize(Student student){
	        try {
	            System.out.println("Student serializing : " + student.toString());
	            
	            FileOutputStream fileOut = new FileOutputStream("student.ser");
	            ObjectOutputStream dk = new ObjectOutputStream(fileOut);
	            
	            dk.writeObject(student);
	            dk.close();
	            fileOut.close();
	            
	        } catch (IOException i) {
	            i.printStackTrace();
	        }
	    }


//	    Method to deserialize object
	    
	    private static void deserialize(){
	        try {
	            FileInputStream fileIn = new FileInputStream("student.ser");
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            Student student = (Student) in.readObject();
	            in.close();
	            fileIn.close();
	            System.out.println("Student deserialized : " + student.toString());
	        } catch (IOException | ClassNotFoundException i) {
	            i.printStackTrace();
	        }
	    }

	    /*
	    Method to get String value of object
	     */
	    @Override
	    public String toString() {
	        return "Student{" +
	                "firstName='" + firstName + '\'' +
	                ", secondName='" + secondName + '\'' +
	                ", fullName='" + fullName + '\'' +
	                ", email='" + email + '\'' +
	                ", password='" + password + '\'' +
	                ", dob=" + dob +
	                '}';
	    }
	}

	
