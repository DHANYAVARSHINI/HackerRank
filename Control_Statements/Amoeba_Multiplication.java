import java.io.*;
import java.util.*;

public class Amoeba_Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp=0;
        for(int i=3; i<=n; i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        System.out.println(temp);
    }
}