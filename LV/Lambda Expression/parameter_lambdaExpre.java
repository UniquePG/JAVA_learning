interface sayable
{   
    // with one parameter
    public String say(String name);


}

class parameter_lambdaExpre {
    public static void main(String args[]){

        sayable obj = (name) -> {
            return "I am saying to hello to " + name;
        };

        System.out.println(obj.say("Prakash"));

        // omit parameter paranthesis
        sayable obj2 = name -> {
            return "I am saying Bye to " + name;
        };

        System.out.println(obj2.say("prakash"));

    }
}
