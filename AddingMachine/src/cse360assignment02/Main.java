package cse360assignment02;

public class Main {

	public static void main(String[] args) {

		//instantiate adding machine object
		AddingMachine addMach = new AddingMachine();
		//test and print values to console
		addMach.add(4);
		addMach.subtract(2);
		addMach.add(5);
		System.out.println(addMach.toString());
		System.out.println(addMach.getTotal());
		addMach.clear();
		System.out.println(addMach.toString());
    }
	
	
	
}
