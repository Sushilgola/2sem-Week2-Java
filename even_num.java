import java.util.*;
public class even_num{
    public static void myprogram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Sum of Even Number\n");
        System.out.println("Enter the range: ");
        int num = sc.nextInt();
        int sum_num = 0;
        for(int i=0; i<=num; i++){
            if(i % 2 == 0){
                sum_num += i;
            }
        }
        System.out.println("Sum Of Enven No: " + sum_num);
    }
}