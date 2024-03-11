import java.io.*;
import java.util.*;

public class Hotel_Tariff_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int rent = sc.nextInt();
        int days = sc.nextInt();
        if((mon>=1 && mon<=3) || (mon>=7 && mon<=10)){
            int tot = rent*days;
            System.out.println(tot);
        }
        else if((mon>=4 && mon<=6) || (mon>=11 && mon<=12)){
            int tot = ((rent*120)/100)*days;
            System.out.println(tot);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}