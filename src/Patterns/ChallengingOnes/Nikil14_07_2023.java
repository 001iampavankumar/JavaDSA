package Patterns.ChallengingOnes;

import java.util.Scanner;

public class Nikil14_07_2023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int row = 1;row<=n;row++){

            for(int s = 0;s<n-row;s++){
                System.out.print("  ");
            }
            for(
                    int i = row,j = row*2 - 2,col = 1;
                    col<=row*2-1;
                    i++,col++
            ){
                if(i<=row*2-1){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(j+" ");
                    j--;
                }


            }
            System.out.println();
        }
    }
}
