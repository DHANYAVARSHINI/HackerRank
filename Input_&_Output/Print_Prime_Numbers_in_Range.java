import java.io.*;
import java.util.*;

public class Print_Prime_Numbers_in_Range {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,prime;
        for(i=2; i<=n ; i++){
            prime=1;
            for(j=2; j<=i/2; j++){
                if(i%j==0){
                    prime=0;
                    break;
                }
            }
            if(prime==1){
                System.out.print(i+" ");
            }
        }
    }
}