class item{
    String item_name;
    String code;
    int price;
    int quantity;
    int amount;

    void set(String item_name, String code, int price, int quantity){
        this.item_name = item_name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    void calculate(){
        amount = price * quantity;
    }

    void display(){
        System.out.println("The name of the item: "+ item_name);
        System.out.println("The code of the item: "+ code);
        System.out.println("The price of the item: " + price);
        System.out.println("The Quantity of the item: "+ quantity);
        System.out.println("\nTotal Amount: "+ amount);
        
    }
}

class solution{
    public static void main(String args[]){
        item m = new item();

        m.set("Keyboard", "E101", 200, 5);
        m.calculate();
        m.display();
    }
}