import java.io.*;
import java.util.*;

public class Round_Off {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        System.out.println((int)n);
        System.out.println(Math.round(Math.ceil(n)));
        System.out.println(Math.round(Math.floor(n)));
    }
}