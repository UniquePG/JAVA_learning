class jaggedarray{
	public static void main(String[] arg){
		int arr[][] = new int[3][];
// Jagged array -> each row has different numbers of columns

		for(int i =0; i<arr.length; i++){
			arr[i] = new int[i+2];	// each row has (i+2)columns
		}
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = i*j;
			}
		}

	// printing array 

		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
	}
}