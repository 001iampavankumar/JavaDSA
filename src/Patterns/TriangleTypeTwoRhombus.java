package Patterns;

import java.util.Scanner;

public class TriangleTypeTwoRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = in.nextInt();
        for(int row = 1;row<=n;row++){

            for(int spaces = 0;spaces<(n - row);spaces++){

                System.out.print(" ");
            }

            for(int col = 1;col<=(row*2 - 1);col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //reverse
        for(int row = n;row>=1;row--){

            for(int spaces = (n - 1 - row);spaces>=0;spaces--){

                System.out.print(" ");
            }

            for(int col = (row*2 - 1);col>=1;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
