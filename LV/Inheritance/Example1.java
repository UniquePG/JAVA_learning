class Example1 {
    public static void main(String args[]){
        Bond obj[];
        obj = new Bond[6];

        for(int i=0; i<6; i++){
            if(i%3 == 0)
               obj[i] = new Bond();
            else
              obj[i] = new convertableBond();
        }

        for(int i=0; i<6; i++)
            obj[i].display();
       
        
    }
}

class Bond{
    public void display(){
        System.out.println("The object of Bond class...");
    }
}

class convertableBond extends Bond{
    public void display(){
        System.out.println("The object of ConvertableBond class...");
    }
}
