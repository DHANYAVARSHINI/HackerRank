import java.io.*;
import java.util.*;

public class The_Newspaper_Agency {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tot = (a*(b-c))-100;
        System.out.println(tot);
    }
}