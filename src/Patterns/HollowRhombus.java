package Patterns;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");

        int n = input.nextInt();


        //defines no of rows
        for(int row = 1;row<=n;row++){


            //printing spaces before every row
            for(int spaces = 0;spaces<n-row;spaces++){
                System.out.print(" ");
            }

            //taking care of coloums
            for(int col = 1;col<=row;col++){

                if(row == 1||col==1||col==row){
                    System.out.print("* ");
                }

                //taking care of inside spaces of a triangle
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }


        //reverse
        for(int row = n;row>=1;row--){
            //printing spaces before every row
            for(int spaces = n-1-row;spaces>=0;spaces--){
                System.out.print(" ");
            }
            //taking care of coloums
            for(int col = row;col>=1;col--){
                if(row == 1||col == row||col==1){
                    System.out.print("* ");
                }
                //taking care of inside spaces of a triangle
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
