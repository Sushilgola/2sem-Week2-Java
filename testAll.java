import java.util.*;
public class testAll{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your choice: ");
        boolean flag = true;
        char again = 'y';
       
        while(again == 'y'){    
        System.out.println("1 for Progam OddEven \n2 for Program Square_Cube()\n3 for Program reciprocal\n4 for Program even_num\n5 for Program tringle");
        int ch_num = sc.nextInt();
            switch (ch_num) {
                case 1:
                    OddEven pro1 = new OddEven();
                    pro1.myprogram();
                    break;
                case 2:
                    Square_Cube pro2 = new Square_Cube();
                    pro2.myprogram();
                    break;
                case 3:

                    reciprocal pro3 = new reciprocal();
                    pro3.myprogram();
                    break;
                case 4:
                    even_num pro4 = new even_num();
                    pro4.myprogram();
                    break;
                case 5:
                    tringle pro5 = new tringle();
                    pro5.myprogram();
                    break;
                default:
                    System.out.println("You Give a Wrong Value.");;
            }
            System.out.println("If you want to run again (y/n)");
            again = sc.next().charAt(0);
        }
        System.out.println("Program Exit.");
    }
}
