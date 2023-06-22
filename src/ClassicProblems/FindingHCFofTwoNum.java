package ClassicProblems;

import java.util.Scanner;

public class FindingHCFofTwoNum {


    //brute force

    static int findHCF1(int n,int m){

        for(int i = Math.min(n,m);i>=1;i--){

            if(n%i==0 && m%i==0){
                return i;
            }
        }
        return 1;
    }

    //efficient approach

    static int findHCF2(int n,int m){
        int a = Math.max(n,m);
        int b = Math.min(n,m);
        int r = a%b;
        while(r!=0){
           a = b;
           b = r;
           r = a%b;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();
        System.out.println(findHCF2(num1,num2));
    }
}
