import java.util.*;
public class tringle{
    public void myprogram(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Floyed's Tringle\n ");
        System.out.println("Enter range: ");
        int num = sc.nextInt();
        int n = 1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println("");
        }
    }
}