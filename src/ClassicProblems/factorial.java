package ClassicProblems;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Factorial or not: ");
        System.out.print("Enter num: ");
        int n = in.nextInt();
        //normal recursive method
        System.out.println(recursiveFactorial(n));
        System.out.println(normalFactorial(n));


    }
    //recursive factorial
    static int recursiveFactorial(int n){
        if(n == 0||n==1){
            return 1;
        }

        return n*recursiveFactorial(n-1);
    }

    //normal method
    static int normalFactorial(int n){
        int res = 1;
        for(int i = 1;i<=n;i++){
            res = res*i;
        }

        return res;

    }
}
