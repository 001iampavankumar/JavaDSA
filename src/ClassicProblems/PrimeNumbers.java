package ClassicProblems;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("List of Prime Numbers: ");

        System.out.print("Enter Start: ");
        int n = in.nextInt();
        System.out.print("Enter End: ");
        int m = in.nextInt();

        for(int i = n;i<=m;i++){

            if(primeOrNot(i)){
                System.out.print(i+" ");
            }

        }



    }

    static boolean primeOrNot(int n){

        int fact = 0;
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                fact++;
            }
        }

        return (fact==2);
    }
}
