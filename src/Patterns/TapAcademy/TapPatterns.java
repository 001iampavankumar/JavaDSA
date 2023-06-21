package Patterns.TapAcademy;

import java.util.Scanner;

class patterns{
    void pattern_01(int n){
        int count = 0;
        for(int row = 1;row<=n;row++){

            if(row%2==0){
                count = count + row;
                for(int col = 0;col<row;col++){
                    System.out.print(count - col+" ");
                }
            }
            else {
                for (int col = 1;col<=row;col++){

                    System.out.print(++count+" ");
                }
            }
            System.out.println();
        }

    }
}

public class TapPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter no of rows: ");
        int n = sc.nextInt();
        pattern_01(n);
    }
    static void pattern_01(int n){
        int count = 1;
        for(int row = 1;row<=n;row++){

            if(row%2==0){
                for(int col = count+row;col>=row;col--){
                    System.out.print(col+" ");
                    count ++;
                }
            }
            else {
                for (int col = 1;col<=row;col++){

                    System.out.print(count++ +" ");
                }
            }
            System.out.println();
        }

    }
}
