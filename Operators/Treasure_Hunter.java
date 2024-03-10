import java.io.*;
import java.util.*;

public class Treasure_Hunter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gold = sc.nextInt();
        int ben = sc.nextInt();
        int black = sc.nextInt();
        int benp = (gold*ben)/100;
        gold = gold - benp;
        int blackp = (gold*black)/100;
        gold = gold - blackp;
        int share = gold/3;
        System.out.println(benp);
        System.out.println(blackp);
        System.out.println(share);
    }
}