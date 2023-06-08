package ClassicProblems;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if(evenOrOdd(14)){
            System.out.println();
        }
    }

    static boolean evenOrOdd(int n){
        return (n%2==0);
    }

}
