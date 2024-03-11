import java.io.*;
import java.util.*;

public class Online_Shopping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fp = sc.nextInt();
        int fd = sc.nextInt();
        int fs = sc.nextInt();
        int sp = sc.nextInt();
        int sd = sc.nextInt();
        int ss = sc.nextInt();
        int ap = sc.nextInt();
        int ad = sc.nextInt();
        int as = sc.nextInt();
        int ft = (int)(fp-(fp*(fd*0.01)))+fs;
        System.out.println("In Flipkart: Rs." +ft);
        int st = (int)(sp-(sp*(sd*0.01)))+ss;
        System.out.println("In Snapdeal: Rs." +st);
        int at = (int)(ap-(ap*(ad*0.01)))+as;
        System.out.println("In Amazon: Rs." +at);
        if(ft<=st && ft<=at){
            System.out.println("Choose Flipkart");
        }
        else if(st<=at){
            System.out.println("Choose Snapdeal");
        }
        else{
            System.out.println("Choose Amazon");

        }
    }
}