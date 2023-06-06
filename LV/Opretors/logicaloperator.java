class logicaloperator{
	public static void main(String[] args){
		int a = 4, b = 2, c = 7;
// Logical AND
	System.out.println("a is smallest: "+ ((a<b) && (a<c)));
	System.out.println("b is smallest: "+ ((b<a) && (b<c)));
	System.out.println("c is smallest: "+ ((c<a) && (c<b)));
// Logical OR
	System.out.println("a is not largest: " +((a<b) || (a<c)));
	System.out.println("b is not largest: " +((b<a) || (b<c)));
	System.out.println("c is not largest: " +((c<a) || (c<a)));	
	}
}
