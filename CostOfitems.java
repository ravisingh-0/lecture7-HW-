import java.util.*;
public class CostOfitems{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("Total cost = " + total);
        float costwithGST = total + (total * 0.18f);
        System.out.println("Cost after GST = " + costwithGST);
    }
}
