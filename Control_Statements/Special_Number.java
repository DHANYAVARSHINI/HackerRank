import java.io.*;
import java.util.*;

public class Special_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=m; i<=n; i++){
            int t = i%10;
            int s = i/10;
            int f = ((t*s)+(t+s));
            if(i==f){
                System.out.println(i);
            }
        }
    }
}