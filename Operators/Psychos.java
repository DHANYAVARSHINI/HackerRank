import java.io.*;
import java.util.*;

public class Psychos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double x = (x1+x2)/2.0;
        double y = (y1+y2)/2.0;
        System.out.println("Arun's house is located at("+(float)x+ "," +(float)y+ ")");
    }
}