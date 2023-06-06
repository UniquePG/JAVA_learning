public class ExthisKeyword {
    public static void main(String[] args){
        example e = new example(20,40,60);   // pass value of j, k, l
        e.prints();


    }
}

class example{
    int i;
    int j;
    int k;
    int l;

    example(int j, int k, int l){
        /* 
         this.i = 100;
         this.j = j;
         this.k = k;
         this.l = l;
         
         */
        this(100, j, k, l); // we invoke current constructor with 4 parameters
    }
    example(int i, int j, int k, int l){
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }

    void prints(){
        System.out.println("Value of i: "+ i
        + " Value of j: "+ j
        + " Value of k: "+ k
        + " Value of l: "+ l);
    }

}