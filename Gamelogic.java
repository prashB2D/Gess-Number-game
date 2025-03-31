
import java.util.Scanner;

public class Gamelogic {

    public boolean check(int a){
        //give range 1 t0 100
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
     int gess = scan.nextInt();
       int leftbond = a-10;
       int rightbond = a+10;
       scan.close();

        if(a==gess){// found checking
            System.out.println(" ***found " +a+ "***");
         flag =false;
        }
      else if(leftbond<= gess & gess <=rightbond){ // hot checking 
        System.out.println("Hot !");
       }
       else{
        System.err.println("Cold ");// cold 
       }
       return flag;
    }
    
}
