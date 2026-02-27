import java.util.*;
class Square_Cube{
    public static void myprogram() {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int square = 0;
        int cube = 0;
        System.out.print("Welcome to Squarea and cube Table \n");
        System.out.print("Enter Array Size: ");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("Enter the numbers: ");
        for(int i=0; i<arr_size; i++){

            arr[i] = sc.nextInt();
        }
        System.err.println("\tNumber \tSquare \tCube");
        for(int i=0; i<arr_size; i++){
            square = arr[i] * arr[i];
            cube = arr[i] * arr[i] * arr[i];
            System.out.println("\t"+ i + "\t" + square + "\t"+ cube);
        }
    }
}