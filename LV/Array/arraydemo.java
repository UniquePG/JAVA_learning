class arraydemo{
	public static void main(String [] args){
		int [] marks; // OR "int marks[]"
		marks = new int[5];
		marks[0] = 23;
		marks[1] = 50;
		marks[2] = 34;
		marks[3] = 45;
		marks[4] = 63;

		for(int i=0; i<marks.length; i++){
			System.out.println(marks[i]);
		}
		

		int marks1[] = {34,22,64,26,86};
		int sum = 0;
		
		for(int i=0; i<marks1.length; i++){
			sum += marks1[i];
		if(marks1[i]>=40){
		System.out.println("Marks above 40: "+ marks1[i]);
			}
		}
		System.out.println("Total sum of marks1: " + sum);	
	}	
}