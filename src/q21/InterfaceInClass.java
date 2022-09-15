package q21;

public class InterfaceInClass {
	   interface myInterface {
		      void demo();
		   }
		   class Inner implements myInterface {
		      public void demo() {
		         System.out.println("Hi, Deepak - What's doing ?");
		      }
		   }
		   public static void main(String args[]) {
		      Inner obj = new InterfaceInClass().new Inner();
		      obj.demo();
		   }
}
