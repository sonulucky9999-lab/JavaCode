package ab57;

abstract class Abc
{
	
	abstract void login();
	abstract void logout();
	
}

abstract class Def extends Abc
{
	
	abstract void registration();
	static void otp()

	{
		
		System.out.println("This logic we are exposing");
	}
}



public class AbstractProgram extends Def
{

	public static void main(String[] args) 
	{
	
		
		
	}

	@Override
	void registration() {

System.out.println("we are not exposing");
		
	}

	@Override
	void login() {
		System.out.println("we are not exposing");
		
	}

	@Override
	void logout() {
		System.out.println("we are not exposing");
		
	}
}
