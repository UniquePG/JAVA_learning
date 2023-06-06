class labelledbreak{
	public static void main(String[] args){
		out:
		for(int i = 1; i<=5; i++){
		    System.out.println("Outer loop: " + i);
			for(int j = 1; j<=5; j++){
			    System.out.println("  Inner loop: " + j);
				if(j==2)
				break out;	// exit from both loops and go to "out:"
				
			}
		}
	}
}