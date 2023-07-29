package Arrays;

import java.util.Scanner;

public class MoveZeroesToTheBegining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }


        if(a.length < 2){
            return;
        }
        //Moving zeroes to end

        int zero = a.length-1;
        int nonZero = a.length-1;

        //using two pointer approach
        while(nonZero>=0) {

            if (a[nonZero] != 0) {
                int temp = a[nonZero];
                a[nonZero] = a[zero];
                a[zero] = temp;
                nonZero--;
                zero--;
            } else {
                nonZero--;
            }
        }
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}
