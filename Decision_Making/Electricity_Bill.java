import java.io.*;
import java.util.*;

public class Electricity_Bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=200){
            double p = n*0.5;
            System.out.println("Rs." +(int)p);
        }
        else if(n>200 && n<=400){
            double p = (n*0.65)+100;
            System.out.println("Rs." +(int)p);
        }
        else if(n>400 && n<=600){
            double p = (n*0.80)+200;
            System.out.println("Rs." +(int)p);
        }
        else{
            double p = (n*1.25)+425;
            System.out.println("Rs." +(int)p);
        }
    }
}