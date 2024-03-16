import java.io.*;
import java.util.*;

public class Collatz_Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        int count =0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
                count++;
            }
            else{
                n=(3*n)+1;
                count++;
            }
            System.out.println(n);
        }
        System.out.println(count);
    }
}