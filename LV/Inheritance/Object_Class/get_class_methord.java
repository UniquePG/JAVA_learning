class get_class_methord {
    public static void main(String args[]){
        // get_class_methord obj = new get_class_methord();    // made a object(obj) of "get_class_methord"
        // String demo = obj.getClass().getName();     // it returns the class name of the object(obj)
        // System.out.println(demo);

     /*    Object obj1 = new get_class_methord();      // made a object(obj1) of "get_class_methord" (obj1 is the reference of Object class)
        String demo1 = obj1.getClass().getName();   // returns the class name of the object obj1
        System.out.println(demo1);
         */
        get_class_methord obj2 = new get_class_methord();    // made a object(obj) of "get_class_methord"
         String demo2 = obj2.getClass().getName();     // it returns the class name of the object(obj)
         System.out.println(demo2.getClass().getName());    // String type object(demo2) (it returns the class name of the object of the String)
         
    }
}

/* 
 * class Class [getClass()] has the following methords--
 
   getConstructor()
   getfields()
   getMethods()
   getName()
   getSuperclass()
   getInterfaces()
 
 */
