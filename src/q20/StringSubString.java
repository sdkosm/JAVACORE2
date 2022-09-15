package q20;

public class StringSubString {

	public static void main(String[] args) {
		String str = "www.sdkosm.org";
		System.out.println("Last 4 character I need: --> " + str.substring(str.length()-4));
		System.out.println("First 4 character I need:---> " + str.substring(0, 4));
		System.out.println("Website name:---> " + str.substring(4, 14));
	}

}
