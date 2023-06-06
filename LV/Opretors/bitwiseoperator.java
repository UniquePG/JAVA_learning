class bitwiseoperator{
	public static void main(String[] args){
		int a = 15, b = 17;
	// it compares each bit of the number with 1 
	System.out.println("Bit wise AND operator: "+ (a & b) ); // if { both 1 then return 1 otherwise 0)
	System.out.println("Bit wise OR operator: "+ (a | b) ); // if {one of them 1 then return 1 otherwise 0)
	System.out.println("Bit wise XOR operator: "+ ( a ^ b) ); // if {only both are 1 or 0 then return 0 otherwise 1)
	}
}