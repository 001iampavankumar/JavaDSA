package Patterns;
import java.util.Scanner;
public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");

        int n = input.nextInt();

        for(int row = 1;row<=n;row++){
            for(int spaces = 0;spaces<n-row;spaces++){
                System.out.print(" ");
            }
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
