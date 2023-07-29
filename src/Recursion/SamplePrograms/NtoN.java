package Recursion.SamplePrograms;

import java.util.Scanner;

public class NtoN {

    static void nTon(int n,int mid){
        if(n==mid){
            System.out.print(n+" ");
            return;
        }
        else{
            System.out.print(n+" ");
            nTon(n+1,mid);
            System.out.print(n+" ");

        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1;i<=n;i++){
            System.out.print("  ".repeat(n-i));
            nTon(i,i*2-1);
            System.out.println();
        }
    }
}


