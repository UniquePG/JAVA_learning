class example1{
	public static void main(String[] args){
		int arr[] = {12,24,53,21,54,75,43,53,22,87};
		int even = 0;
		int odd = 0;
	for(int i=0; i<arr.length; i++){
		if(arr[i]%2==0){
			even++;
		}
		else
			odd++;
	}
	System.out.println("Total even numbers: "+ even);
	System.out.println("Total odd numbers: "+ odd);
	}
}