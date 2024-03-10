import java.io.*;
import java.util.*;

public class Splitting_into_the_teams {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("The number of friends in each team is "+a/b+ " and left out is " +a%b);
    }
}