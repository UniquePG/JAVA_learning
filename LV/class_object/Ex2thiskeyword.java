import javax.sound.midi.Soundbank;

public class Ex2thiskeyword {
    public static void main(String[] args){
        example2 e1 = new example2(40);
        example2 e2 = new example2(35);

        example2 maxx;      // 
        maxx = e1.greater(e2);
        maxx.printf();
    }
}

class example2{
    int i;

    example2(int i){
        this.i = i;
    }

    example2 greater(example2 d)    // jisme i ke value greater ho bo object return ho jaye
    {
        if(d.i > this.i){
            return d;
        }
        else{
            return this;
        }
    }

    void printf(){
        System.out.println("This greates value of i is: "+ this.i);
    }
}