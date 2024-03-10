import java.io.*;
import java.util.*;

public class Fencing_the_Ground {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int a = l*b;
        int p = 2*(l+b);
        System.out.println("The required length is "+p+ " m");
        System.out.println("The required area of carpet is "+a+ " sqm");
}
}