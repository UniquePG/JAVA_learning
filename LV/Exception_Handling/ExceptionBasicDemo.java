class ExceptionBasicDemo {
    int a[] = new int[5];

    public void set() {
        for (int i = 0; i < 5; i++) {
            a[i] = i + 2;
        }
    }

    public void print() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String args[]) {
        ExceptionBasicDemo obj = new ExceptionBasicDemo();

        obj.set();
        // obj.print(); // this gives exception

        // handle the exception using try and catch block

        try {
            int a = 10, b = 0;
            int ans = a / b; // this will also throw an exception

            System.out.println("The value of ans: " + ans);
        } catch (Exception e) {
            System.out.println("Exception is generated");
        }
    }
}
