package day48_MethodOverRiding;

class Mahribana {

	public void methodA() {
		// the method we are going to override MUST be inheritable to the sub class
		System.out.println("Method A");
	}

}

public class AccessModifiers extends Mahribana {
	/*
	 * @Override private void methodA() { System.out.println("Method A"); } override
	 * method' access modifiers need to be same or more visible
	 */

	@Override
	public void methodA() {
		System.out.println("Method A");
	}

	public static void main(String[] args) {

	}

}