import java.io.*;
import java.util.*;

public class Dollars_&_Cents {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d2 = sc.nextInt();
        int c2 = sc.nextInt();
        int dor = (d1+d2)+((c1+c2)/100);
        int cen = (c1+c2)%100;
        System.out.println(dor);
        System.out.println(cen);
    }
}