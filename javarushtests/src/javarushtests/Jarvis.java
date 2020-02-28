package javarushtests;

public class Jarvis {

	/**
	 * @param name
	 */
	public void sayHi(String firstguest) {

		System.out.println("Hi mr. " + firstguest + ", how are you?");

	}

	public void sayHi(String firstguest, String secondguest) {
		System.out.println("Hi " + firstguest +" and "+ secondguest +", how are you?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jarvis jarvis = new Jarvis();
		jarvis.sayHi("Tom");
        jarvis.sayHi("Tom", "Monica");
        
        System.out.println("test");
	}
	
}
