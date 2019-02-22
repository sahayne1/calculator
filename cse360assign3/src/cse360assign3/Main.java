package cse360assign3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calcTest = new Calculator();
		calcTest.add(10);
		calcTest.subtract(90);
		calcTest.multiply(25);
		calcTest.divide(14);
		
		System.out.print(calcTest.getHistory());
		//System.out.print(calcTest.getTotal());
	}

}
