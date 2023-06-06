public class Example1Class {
    public static void main(String[] args){
        double temparr[][] = new double[4][7];
        int count = 2;
        for(int i=0; i<temparr.length; i++){
            
            for(int j=0; j<temparr[i].length; j++){
                temparr[i][j] = (i+j+1)*count ;
            }
            count++;
        }

        // print array
        for(int i=0; i<temparr.length; i++)	// it iterates row(0,1,2)
		{
			for(int j=0; j<temparr[i].length; j++) // it iterates collumns(0,1,2,3,4)
			{
				System.out.print(temparr[i][j] + "\t");
			}
			System.out.println("\n");	
		}

        
        for(int i=0; i<temparr.length; i++){
            Statistics.average(temparr[i]);
            
        }
        
    }
    
}

class Statistics{
    static double avg;
    static double sum = 0;

    static void average(double arr[]){
            for(int i=0; i<arr.length; i++){
                sum += arr[i];
            }
            avg = sum/7;
            System.out.println("The average is: "+ avg);
    }
}
