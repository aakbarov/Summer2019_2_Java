package day34_Constructors;

public class Test {

	public static String name;
	
	public Test() {
		name = "Aysel";
	}
	{
		name = "muaz";
	}
	static {
		name = "hakan";
	}
	public static void main(String[] args) {
		System.out.println(name);
	}
		
		
	}
	

