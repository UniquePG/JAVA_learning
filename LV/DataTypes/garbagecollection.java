class garbagecollection{
	public void finalize()   // it is not necessary to write, we write this when we want to do something while object is destring
	{
		System.out.println("Object destroyed");
	}
	public static void main(String[] args){
		garbagecollection gcd1 = new garbagecollection();
		garbagecollection gcd2 = new garbagecollection();
	    
	    gcd1 = null;
	    gcd2 = null;
		
		System.out.println("Objects assigned null");
		System.gc();	// not necessary to call gc
	}
}