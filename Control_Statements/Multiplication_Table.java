import java.io.*;
import java.util.*;

public class Multiplication_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter n");
        int m = sc.nextInt();
        System.out.println("Enter m");
        System.out.println("The multiplication table of "+n+" is");
        for(int i=1; i<=m; i++){
            int c = i*n;
            System.out.println(i+"*"+n+"="+c);
        }
    }
}