import javax.sound.midi.Soundbank;

@FunctionalInterface
interface Drawable{     // function interface  
    public void draw();  // abstract method
    // public void erase();  // only one abstract method in functional interface
}

class With_lambdaExpression {
    public static void main(String arg[]){

        int width = 18;

        // With lambda Expression
        Drawable obj = () -> {  
            System.out.println("Drawing: "+ width);
        };      // Lambda Expression

        obj.draw();
    }    
}
