
interface Drawable{
    public void draw();
}

/*
class ImplDrawable implements Drawable{
    int width;

    public void draw(){
        System.out.println("Drawing: "+ width);
    }
}
*/


class Without_lambdaExpression {
    public static void main(String args[]){
        /*  
         
        ImplDrawable d = new ImplDrawable();
        d.width = 10;
        d.draw();
        */

        int width = 15;
        Drawable obj = new Drawable(){      // Annomenous class
            public void draw(){
                System.out.println("Drawing: "+ width);
            }
        };

        obj.draw();
    }
}
