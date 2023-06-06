class Exception_Hierarchy {
    public static void main(String [] args){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int ans = a/b;
            System.out.println("The answere is: "+ ans);
        }
        catch(Exception e){
            System.out.println(e.getMessage());     // for print the message of the exception
            // System.out.println(e.getStackTrace());
            // e.printStackTrace();        // for print stack trace
        }
    }
}
