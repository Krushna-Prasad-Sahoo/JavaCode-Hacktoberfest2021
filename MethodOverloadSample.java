public class MethodOverloadSample{
	public static void main(String[] args) {
		Calculator newCal = new Calculator();
		newCal.add(5, 6);	//this will call the first add method with 2 parameters.
		newCal.add(5,6,8);	//this will call the second add method with 3 parameters.
	}
}

class Calculator {
	
	int add(int a , int b ) {
		return a+b;
	}
	
	int add(int a , int b , int c ) {
		return a+b;
	}

}