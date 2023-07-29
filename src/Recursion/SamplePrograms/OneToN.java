package Recursion.SamplePrograms;

import java.util.Scanner;

public class OneToN {

    static void oneToN(int n){



        //we need to stop somewhere and i choose to stop at zero
        if(n==0){
            return;
        }
        else{
            oneToN(n-1);

            // the printing starts from when n reaches one
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        oneToN(n);

    }
}
