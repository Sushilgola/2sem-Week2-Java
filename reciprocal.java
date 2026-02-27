import java.util.*;
public class reciprocal{
    public static void myprogram() {
        Scanner sc = new Scanner(System.in);
        double sum_rec = 0;
        System.out.print("Welcome to Sum of Reciprocals program.\n");
        System.out.println("Enter the Nmber: ");
        double num = sc.nextDouble();
        for(double i=1; i<=num; i++){
            double rec = 1/i;
            sum_rec += rec;
            // System.out.println(rec);5
        }
        System.out.println("Sum of Reciprocal: " + sum_rec);
    }
}
