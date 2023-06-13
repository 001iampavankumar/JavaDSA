package Patterns.StriverPatterns;

import java.util.Scanner;
class PatternPrograms{
    void pattern_20(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            for (int spaces = (n * 2 - row * 2); spaces > 0; spaces--) {
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= (n - row + 1); col++) {
                System.out.print("* ");
            }

            for (int spaces = 0; spaces < (row * 2 - 2); spaces++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= (n - row + 1); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void pattern_21(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                if(row==1 || row ==n || col==1 || col==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void pattern_19(int n){


        for(int row = 1;row<=n;row++){

            for(int col = 1;col<=(n-row+1);col++){
                System.out.print("* ");
            }

            for(int spaces = 0;spaces<(row*2-2);spaces++){
                System.out.print("  ");
            }

            for(int col = 1;col<=(n-row+1);col++){
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }

            for(int spaces = (n*2 - row*2);spaces>0;spaces--){
                System.out.print("  ");
            }

            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    void pattern_18(int n){

        for(int row = n;row>=1;row--){

            for(int col = row;col<=n;col++){
                System.out.print((char)(64+col)+" ");
            }
            System.out.println();
        }
    }
    void pattern_17(int n){

        for(int row = 1;row<=n;row++){

            for(int spaces = 0;spaces<(n-row);spaces++){
                System.out.print("  ");
            }

            for(int col = 1;col<=row;col++){

                System.out.print(col+" ");
            }

            for(int col2 = (row-1);col2>=1;col2--){
                System.out.print(col2+" ");
            }
            System.out.println();
        }
    }
    void pattern_14(int n){
        for(int row = 1;row<=n;row++){

            for(int col = 1;col<=row;col++){

                System.out.print((char)(64+col)+" ");
            }
            System.out.println();
        }
    }
    void pattern_12(int n){

        for(int row = 1;row<=n;row++){

            //First triangle
            for(int first = 1;first<=row;first++){

                System.out.print(first+" ");
            }

            //spaces
            for(int spaces = 1;spaces<=(n*2 - row*2);spaces++){
                System.out.print("  ");
            }

            //Last triangle
            for(int last = row;last>=1;last--){
                System.out.print(last+" ");
            }

            System.out.println();
        }

    }
}

public class PrintingPatternPrograms {
    public static void main(String[] args) {
        PatternPrograms pp = new PatternPrograms();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();
        pattern_21(n);

    }

    static void pattern_21(int n){

        for(int i = n;i>=1;i--){

/*            for(int spaces = 0;spaces<=(n-i);spaces++){
                System.out.print("  ");
            }*/

            for(int side = n;side>i;side--){
                System.out.print(side+" ");
            }
            for(int j = 1;j<=(i*2 -1);j++){
                System.out.print(i+" ");
            }
            for(int side = i+1;side<=n;side++){
                System.out.print(side+" ");
            }
            System.out.println();
        }

        for(int i = 2;i<=n;i++){
/*            for(int spaces = 0;spaces<=(n-i);spaces++){
                System.out.print("  ");
            }*/

            for(int side = n;side>i;side--){
                System.out.print(side+" ");
            }
            for(int j = (i*2 -1);j>=1;j--){
                System.out.print(i+" ");
            }
            for(int side = i+1;side<=n;side++){
                System.out.print(side+" ");
            }
            System.out.println();
        }
    }

}

