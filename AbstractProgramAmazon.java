package ab57;

class Abcd
{
	void one()
	{
		
		System.out.println("Logic 1");
	}

	static void two()
	{
		
		System.out.println("Logic 2");
	}
}

abstract class Bcde extends Abcd
{

	abstract void method1();
	
}
public class AbstractProgramAmazon  extends Bcde
{

	
	public static void main(String[] args) 
	
	{
		
		
	}

	
	void method1() {
		
		System.out.println("Logic 3");
	}
}
