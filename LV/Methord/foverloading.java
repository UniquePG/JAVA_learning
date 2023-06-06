import java.lang.Math;

class foverloading {
    public static void main(String[] args){
            int radius = 5;
            int length = 6, bredth = 8;
            int a = 3, b = 7, c = 9;

            System.out.println("The area of the circle: "+ area(radius));
            System.out.println("The area of the Rectangle: "+ area(length, bredth));
            System.out.println("The area of the Tringle: "+ area(a,b,c));
    }

    static float area(int r){
        return 22/7 * r * r;
    }
    static int area(int l, int w){
        return l * w;
    }
    static float area(int a, int b, int c){
        float s = (float)(a+b+c)/2.0f;
        return (float)Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}

// Function overloading do not depend on the returntype of the function
// it only depends on the arguments data_type and number of arguments