import java.util.*;
public class Averageof3no{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = a+b+c/3;
        System.out.println("Average = " + avg);
    }
}