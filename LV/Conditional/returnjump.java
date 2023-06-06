class returndemo{
	public static int add(int x, int y){
		return x+y;	// return methord to their calling location
	}
	public static void main(String[] args){
		int a = 5, b = 7;
		int ans = add(a,b);	
	
		System.out.println(ans);

	}
}