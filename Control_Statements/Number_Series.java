import java.io.*;
import java.util.*;

public class Number_Series {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                int t = (i*i)-2;
                System.out.print(t+" ");
            }
            else{
                int t =(i*i)-1;
                System.out.print(t+" ");
            }
        }
    }
}