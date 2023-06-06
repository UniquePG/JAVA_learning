interface addable{
    // with two parameter
    public int add(int a, int b);

}

class two_parameter_lambda {
    public static void main(String args[]){

        addable obj = (int a, int b) -> {       // lambda Expression with two parameter
            int c = a+b;
            return c;
        };
        System.out.println("The adition is: " +obj.add(10, 15));
        

        // another method
        addable obj2 = (a,b) -> (a+b);  // with out return statement 

        System.out.println("The another addition is: "+obj.add(12, 8));
    }
}
