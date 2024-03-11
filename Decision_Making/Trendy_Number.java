import java.io.*;
import java.util.*;

public class Trendy_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>99 && n<=999){
            int n1 = (n/10)%10;
            if(n1%3==0){
                System.out.println("Trendy Number");
            }
            else{
                System.out.println("Not a Trendy Number");
            }
        }
        else{
             System.out.println("Invalid Number");
        }
    }
}