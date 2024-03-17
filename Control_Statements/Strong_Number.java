import java.io.*;
import java.util.*;

public class Strong_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m;
        int sum = 0;
        while(n!=0){
            int t = n%10;
            int fact = 1;
            int i =1;
            while(i<=t){
                fact = fact*i;
                i++;
            }
            sum = sum+fact;
            n = n/10;
        }
        if(sum == m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}