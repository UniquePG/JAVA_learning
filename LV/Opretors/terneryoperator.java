class conditionaloperator{
	public static void main(String[] args){
	// termery operator for checking two statement
		int a = 14, b = 7, max;

		max = (a>b)? a : b;
	System.out.println("The maximum value among two: " + max);
	
	// Terney operator for checking three condition
		int n1 = 34, n2 = 120, n3 = 15;
		
		int max1 = (n1>n2)? (n1>n3)? n1:n3 : (n2>n3)? n2:n3;
	System.out.println("The maximum value among three: "+ max1);
	}
}