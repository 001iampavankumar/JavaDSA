package Patterns.ChallengingOnes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class binaryRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No of rows: ");
        int n = sc.nextInt();

        for(int row = 1;row<=n;row++){

            for(int col =  1;col<=row;col++){
                if((row+col)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
    }

}
