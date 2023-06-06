class loop {
    
    public void repeat(){
        int x = 13579;

        for(int i = 1; i<=5; i++){
            System.out.println(x);
        }
    }

    public static void main(String args[]){
        loop l = new loop();
        l.repeat();
    }
}
