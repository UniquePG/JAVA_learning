package mypack;

public class UD_packageDemo1    // only public class imported using *(So we have to make class public in package)
 {
        int i;
        int j;
        
        public UD_packageDemo1(int i, int j){
            this.i = i;
            this.j = j;
        }

        public String toString(){
            return "I: "+ i + " J:" + j;
        }
}
