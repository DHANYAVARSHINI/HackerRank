import java.io.*;
import java.util.*;


public class Harry_Potter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = Math.abs(a);
        int c = (b/1000)%10+(b%10);
        System.out.println(c);
    }
}