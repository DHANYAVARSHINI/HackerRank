import java.io.*;
import java.util.*;

public class Debt_Repay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextInt();
        float r = sc.nextInt();
        float n = sc.nextInt();
        float a = (p*n*r)/100;
        float b = p+a;
        float c = (a*2)/100;
        float tot = b-c;
        System.out.printf("%.2f",a);
        System.out.printf("\n%.2f",b);
        System.out.printf("\n%.2f",c);
        System.out.printf("\n%.2f",tot);
        
    }
}