package ClassicProblems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
       EvenOrOdd_NtoM();
       evenOrOdd();
    }

    static void EvenOrOdd_NtoM(){

        Scanner in  = new Scanner(System.in);

        System.out.println("Even or odd : ");
        System.out.print("Enter Start num : ");
        int m = in.nextInt();
        System.out.print("Enter End num : ");
        int n = in.nextInt();

        for(int i = m;i<=n;i++){

            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
            if(i%10==0)
                System.out.println();
        }
    }
    static void evenOrOdd(){
        Scanner in = new Scanner(System.in);
        System.out.println("Even or odd : ");
        int n = in.nextInt();
        if(n%2==0){
            System.out.println(n+" is even");
        }
        else{
            System.out.println(n+" is odd");
        }
    }

}
