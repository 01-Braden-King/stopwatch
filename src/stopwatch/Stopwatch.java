package stopwatch;

import java.util.*;

public class Stopwatch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        boolean x = true;
        double time  = 0;
        while (x==true){
            
        try {
            System.out.println("");
            Thread.sleep(1000);
            time = time + 1000;
            System.out.println("A second has passed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.println("Do you to end the stopwatch");
            String ans = input.next();
            if (ans.equalsIgnoreCase("yes")) {
                x=false;
                System.out.println((time/1000)+" seconds");
            }else{
                
            }
        }
    }
    }

