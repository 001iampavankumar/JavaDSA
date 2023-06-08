package Patterns;

import java.util.Scanner;

public class EquilateralRhombus {

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

        //reverse printing
        for(int row = n-1;row>=1;row--){
            for(int spaces = n-row-1;spaces>-1;spaces--){
                System.out.print(" ");
            }
            for(int col = row;col>=1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
