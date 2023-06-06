class labelledcontinue{
	public static void main(String[] args){
		out:
		for(int i = 1; i<=5; i++){
		    System.out.println("Outer loop: " + i);
			for(int j = 1; j<=5; j++){
				if(j==3)
				continue;	// skip j==2 and continue with next iteration
			    System.out.println("  Inner loop: " + j);
				
			}
		}
	}
}