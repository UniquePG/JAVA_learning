class shiftoperator{
	public static void main(String[] args){
		int a = 17;
		int b = a<<1;	// double the value one time (shift one bit to left)(17*2)
		int c = a>>1;	// half the value one time(shift one bit to right)(17/2)

		int b1 = a<<3;  // double the value three times(17*2*2*2)
		int c1 = a>>3;  // half the value three times(17/2/2/2)
	System.out.println("Left shift: " + b);
	System.out.println("Right shift: " + c);
	
	System.out.println("b1 value: " + b1);
	System.out.println("c1 value: " + c1);
	
// Unsigned shift operator

	int d = -17;
	int f = d>>>1;	// (shift the left most bit that indicated the "-" (shift 32th bit to 31th position))
	
	System.out.println("Unsigned shift operator: " + f);	
	
	}
}