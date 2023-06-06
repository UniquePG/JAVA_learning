class continuedemo{
	public static void main(String[] args){
		int num = 10;
		for(int i =0; i<=num; i++){
			if(i==5){ 
			continue;	// skip i==5 and continue with next iteration
			}
		System.out.println(i);
		}
	}
}