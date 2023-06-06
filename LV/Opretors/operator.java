class operatorss{
	public static void main(String[] args){
	
	// binary operator
	System.out.println("Binary Operators");
	int a = 14;
	int b = 6;
	int ans1 = a+b;
	
	System.out.println("Addition: "+ ans1);
	
	int ans2 = a-b;
	System.out.println("Subtraction: "+ ans2);
	
	int ans3 = a*b;
	System.out.println("Multiply: "+ ans3);
	
	int ans4 = a/b;
	System.out.println("Division: "+ ans4);

	int ans5 = a%b; 	// it gives the remainder(modular operator)
	System.out.println("Remainder: "+ ans5);
	
	

	// Unary Operator
	
	int num1 = 10;
	int num2;
	num2 = num1++;	// First initilize the increse 1
	++num1; // first increase num1 then use it
	++num2; // first increase num2 then use it
	System.out.println("The value of num1: " + num1);
	System.out.println("The value of num2: " + num2++);
	System.out.println("The value of num2: " + --num2);
	
	}
}