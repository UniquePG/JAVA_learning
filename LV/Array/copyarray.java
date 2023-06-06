class arraycopy{
	public static void main(String[] args){
		char []arr1 = {'j','a','v','a',' ','i','s',' ','f','u','n'};

		char []arr2 = new char[10];

// copy array "arr1" from index '8' to "arr2" from index '0' to '3' 
		System.arraycopy(arr1,8,arr2,0,3);  // copy 'FUN' to arr2
		
		System.out.println(arr2);
// Example 2
		char []a = {'j','a','v','a',' ','i','s',' ','f','u','n'};
		char []b = new char[10];
		b[0] = 'e';
		b[1] = 'n';
		b[2] = 'j';
		b[3] = 'o';
		b[4] = 'y';
		b[5] = ' ';

		System.arraycopy(a, 0, b, 6, 4);
		
		System.out.println(b);
	
	}
}