class multidimensionarray{
	public static void main(String[] args){

		int arr[][] = new int[3][]; // 3 rows initilize 
		
		for(int i=0; i<arr.length; i++){
			arr[i] = new int[5]; // each row has equal collumns(5) 
		}
		
		for(int i=0; i<arr.length; i++)	// it iterates row(0,1,2)
		{
			for(int j=0; j<arr[i].length; j++) // it iterates collumns(0,1,2,3,4)
			{
				arr[i][j] = i*j;
			}	
		}

		for(int i=0; i<arr.length; i++)	// it iterates row(0,1,2)
		{
			for(int j=0; j<arr[i].length; j++) // it iterates collumns(0,1,2,3,4)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");	
		}
	}
}