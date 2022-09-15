package q29;

//Java program to demonstrate CloneNotSupportedException

class TeamPlayer {

	private String name;

	public TeamPlayer(String name)
	{
		super();
		this.name = name;
	}

	@Override 
	public String toString()
	{
		return "TeamPlayer[Name= " + name + "]";
	}

	@Override
	protected Object clone()
		throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class CloneNotSupportedExceptionDemo {

	public static void main(String[] args)
	{

		// creating instance of class TeamPlayer

		TeamPlayer t1 = new TeamPlayer("Human");
		System.out.println(t1);

		// using try catch block
		try {
			
			// CloneNotSupportedException will be thrown
			// because TeamPlayer class not implemented
			// Cloneable interface.
			
			TeamPlayer t2 = (TeamPlayer)t1.clone();
			System.out.println(t2);
		}

		catch (CloneNotSupportedException a) {
			a.printStackTrace();
		}
	}
}
