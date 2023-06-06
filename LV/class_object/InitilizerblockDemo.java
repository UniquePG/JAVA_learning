class InitilizerblockDemo {
    public static void main(String[] args){
        System.out.println(" Main Started ");

// Initilizer block called before object created
        InitilizerblockDemo s1 = new InitilizerblockDemo(); 
        System.out.println(" Between objects(mid way of main) ");
        InitilizerblockDemo s2 = new InitilizerblockDemo();

        System.out.println(" Main End ");


    } 
     /* 
     Note -> initilizer block Invoked before the objects created (in order)
     */
    
    private int i =0;
    // Constructor
    InitilizerblockDemo(){
        i++;
        System.out.println(" Inside Constructor " + i);
    }

    // Initilizer block
    {
        i++;
        System.out.println(" Initilizer Block 1:  " + i);   
        
        // Initilizer block called before the object created(it called when class load on the memory)
    }

    {   
        i++;
        System.out.println(" Initilizer Block 2:  " + i);
    }
}
