public class Wrapperclass {
    public static void main(String[] args){
        // Autoboxing-> (primitive datatypes convert into wrapper class object(Integer))
        int i = 25;
       // Integer obj_i = Integer.valueOf(i);  // this is used before java 1.8 version

        Integer obj_i = i;      // This methord used currently
        System.out.println(obj_i);


        // Unboxing-> (wrapper class object convert into premitive datatype)
        //Integer obj_j = new Integer(30);     
       // int j = obj_j.intValue();      // this is used in previous versions

       Integer obj_j = 30;      // This is currently used
        int j = obj_j;
        System.out.println(j);
    }
}
