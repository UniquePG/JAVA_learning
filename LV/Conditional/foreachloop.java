class foreach{
	public static void main(String[] args){
		int [] mylist = {11,12,13,14,15};
		int sum = 0;
		
		System.out.println("The elements of array");
		for(int val : mylist){
			System.out.println(val);
		}
		
		for(int val1 : mylist){
			sum += val1;
		}
		System.out.println("The summition of array: " + sum);	
	}
}