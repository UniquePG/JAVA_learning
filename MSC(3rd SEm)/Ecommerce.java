import java.util.Scanner;

class Ecommers{
    public static void main(String args[]){

        Mens mobj = new Mens();
        Women wobj = new Women();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter userid and password");
        String userid = sc.next();
        int pass = sc.nextInt();

        if(mobj.login(userid, pass)){

            // Men Clothes
            mobj.SetShirt(101, "black", "M", 500);
            mobj.SetPants(201, "Blue", "L", 750);
            mobj.SetShoes(301, "Grey", "9", 980);

            // Women Clothes
            wobj.SetSharee(111, "Red", 950);
            wobj.SetJeanse(211, "Green", "L", 1200);
            wobj.SetWShoes(311, "Black", "7", 1180);
            
            // print all items of men
            
            System.out.println("----------------Print Men Clothes------------------\n");
            mobj.printMen();
            System.out.println("\n----------------Print Women Clothes-----------------");
            wobj.printWomen();
        }
        else{
            System.out.println("Please enter correct userid and password");
        }

    }
}
// Model of Flipkart 
class Flipkart{
    String userid;
    int password;
    String name;
    String address;

    public void setF(String userid, int password, String name, String address){
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public boolean login(String userid, int password){

        if((userid.equals("pavan")) && (password == 1234)){
            return true;
        }
        else{
            return false;
        }

    }
}

// subclass of Flipkart
class Clothers extends Flipkart{
    int Cproductid;
    String Ccolor;
    String Csize;
    int Cprice;

    
    public void setC(int Cproductid, String Ccolor, String Csize, int Cprice ){
        this.Cproductid = Cproductid;
        this.Ccolor = Ccolor;
        this.Csize = Csize;
        this.Cprice = Cprice;
    }


    public void setC(int Cproductid, String Ccolor, int Cprice ){
        this.Cproductid = Cproductid;
        this.Ccolor = Ccolor;
        this.Cprice = Cprice;
    }

   
}

// subclass of Clothes
class Mens extends Clothers{
    int MSproductid, MPproductid, MShproductid;
    String MScolor, MPcolor, MShcolor;
    String MSsize, MPsize, MShsize;
    int MSprice, MPprice, MShprice;

    
    // Set all items of men
    public void SetShirt(int MSproductid, String MScolor, String MSsize, int MSprice){
    //    this.setC(MSproductid, MScolor, MSsize, MSprice);

        this.MSproductid = MSproductid;
        this.MScolor = MScolor;
        this.MSsize = MSsize;
        this.MSprice = MSprice;
    }

    public void SetPants(int MPproductid, String MPcolor, String MPsize, int MPprice){
        // this.setC(MPproductid, MPcolor, MPsize, MPprice);
        this.MPproductid = MPproductid;
        this.MPcolor = MPcolor;
        this.MPsize = MPsize;
        this.MPprice = MPprice;
    }

    public void SetShoes(int MShproductid, String MShcolor, String MShsize, int MShprice){
        // this.setC(MShproductid, MShcolor, MShsize, MShprice);
        this.MShproductid = MShproductid;
        this.MShcolor = MShcolor;
        this.MShsize = MShsize;
        this.MShprice = MShprice;
    }

   

    // Print all items of Mens
    public void printMen(){
        System.out.println("******Print All Shirts*******");
        System.out.println("Shirt Product ID: "+ MSproductid);
        System.out.println("Shirt Color: "+ MScolor);
        System.out.println("Shirt Size: "+ MSsize);
        System.out.println("Shirt Price: "+ MSprice);

        System.out.println("******Print All Pants*******");
        System.out.println("Pant Product ID: "+ MPproductid);
        System.out.println("Pant Color: "+ MPcolor);
        System.out.println("Pant Size: "+ MPsize);
        System.out.println("Pant Price: "+ MPprice);

        System.out.println("******Print All Shoes*******");
        System.out.println("Shoes Product ID: "+ MShproductid);
        System.out.println("Shoes Color: "+ MShcolor);
        System.out.println("Shoes Size: "+ MShsize);
        System.out.println("Shoes Price: "+ MShprice);
    }
}

class Women extends Clothers{

    int WSproductid, WJproductid, WShproductid;
    String WScolor, WJcolor, WShcolor;
    String WSsize, WJsize, WShsize;
    int WSprice, WJprice, WShprice;

    public void SetSharee(int WSproductid, String WScolor, int WSprice){
        // setC(WSproductid, WScolor, WSprice);
        this.WShproductid = WSproductid;
        this.WScolor = WScolor;
        this.WSprice = WSprice;
    }

    public void SetJeanse(int WJproductid, String WJcolor, String WJsize, int WJprice){
        // setC(WJproductid, WJcolor, WJsize, WJprice);
        this.WJproductid = WJproductid;
        this.WJcolor = WJcolor;
        this.WJsize = WJsize;
        this.WJprice = WJprice;
    }

    public void SetWShoes(int WShproductid, String WShcolor, String WShsize, int WShprice){
        // setC(WShproductid, WShcolor, WShsize, WShprice);
        this.WShproductid = WShproductid;
        this.WShcolor = WShcolor;
        this.WShsize = WShsize;
        this.WShprice = WShprice;
    }

    // print women 
    public void printWomen(){
        System.out.println("******Print All Shree*******");
        System.out.println("Shirt Product ID: "+ WSproductid);
        System.out.println("Shirt Color: "+ WScolor);
        System.out.println("Shirt Size: "+ WSsize);
        System.out.println("Shirt Price: "+ WSprice);

        System.out.println("******Print All Jeanse*******");
        System.out.println("Pant Product ID: "+ WJproductid);
        System.out.println("Pant Color: "+ WJcolor);
        System.out.println("Pant Size: "+ WJsize);
        System.out.println("Pant Price: "+ WJprice);

        System.out.println("******Print All Shoes*******");
        System.out.println("Shoes Product ID: "+ WShproductid);
        System.out.println("Shoes Color: "+ WShcolor);
        System.out.println("Shoes Size: "+ WShsize);
        System.out.println("Shoes Price: "+ WShprice);
    }



}
class Kids extends Clothers{

    public void SetKTshirt(int KTproductid, String KTcolor, String KTsize, int KTprice){
        setC(KTproductid, KTcolor, KTsize, KTprice);
    }

    public void SetKPants(int KPproductid, String KPcolor, String KPsize, int KPprice){
        setC(KPproductid, KPcolor, KPsize, KPprice);
    }

    public void SetShoes(int KShproductid, String KShcolor, String KShsize, int KShprice){
        setC(KShproductid, KShcolor, KShsize, KShprice);
    }
}

// subclass of Flipkart
class Electronics extends Flipkart{

}

// subclass of Electronics 
class Mobiles extends Electronics{

}
class Computers extends Electronics{

}
class Watches extends Electronics{

}

// subclass of Flipkart
class Personal_Care extends Flipkart{

}

// subclass of Personal_Care
class Skin_Care extends Personal_Care{

}
class Hair_Care extends Personal_Care{

}
class Oral_Care extends Personal_Care{

}