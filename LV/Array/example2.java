class example2{
	public static void main(String[] args){
// Find minimum element of each row
		int [][]arr = new int[3][3];
		
		arr[0][0] = 23;
		arr[0][1] = 32;
		arr[0][2] = 4;
		arr[1][0] = 25;
		arr[1][1] = 2;
		arr[1][2] = 20;
		arr[2][0] = 13;
		arr[2][1] = 3;
		arr[2][2] = 17;

		int a[] = new int[3];

		int min;
	for(int i=0; i<arr.length; i++){
		min = arr[i][0];
		for(int j=0; j<arr[i].length; j++){
			if(arr[i][j]<min){
				min = arr[i][j];
				
 			}
			a[i] = min;
			
		}
			
	}
	
		
	for(int ele : a){
		System.out.println(ele);
		}
	
	}
}