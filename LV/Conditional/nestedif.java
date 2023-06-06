class nestedif{
	public static void main(String[] args){
		int marks = 2;
		
	if(marks>40){
		System.out.println("You cleared the exam");
	if(marks<=50)
		System.out.println("With third class");
	else if(marks<=60)
		System.out.println("With second class");
	else if (marks<=70)
		System.out.println("With first class");
	else
		System.out.println("With distinction");
	}
	else 
		System.out.println("Sorry! You couldnt clear the exam");

	}
}