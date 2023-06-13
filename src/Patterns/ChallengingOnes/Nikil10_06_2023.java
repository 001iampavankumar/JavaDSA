package Patterns.ChallengingOnes;

import java.util.Scanner;

public class Nikil10_06_2023 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            for(int col = 1;col<=i;col++){
                if(col==i||i==n){
                    System.out.print(col+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

   static void  pattern_01(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int col = 1;col<=i;col++){

                if((col+i)%2==0){
                    System.out.print(col+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        for(int i = n-1;i>=1;i--){
            for(int col = 1;col<=i;col++){

                if((col+i)%2==0){
                    System.out.print(col+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
