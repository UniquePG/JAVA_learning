class Fprimecheck {
    public static boolean isprime(int n){
        boolean flag = true;
        for(int i=2; i<(int)n/2; i++){
            if(n%i == 0){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args){
            int num = 23;

            if(isprime(num)){
                System.out.println(num + " Is prime");
            }
            else{
                System.out.println(num + " Is NOT prime");
            }
    }
}
