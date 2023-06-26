package Patterns.ChallengingOnes;


import java.util.Scanner;

public class SquarePatternWithoutUsingCount {

    static void numSquare(int n){
        for(int i = 1;i<=n*n;i++){
            System.out.print(i+" ");
            if(i%5==0){
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter rows: ");
        int n = s.nextInt();
        numSquare(n);
    }
}
