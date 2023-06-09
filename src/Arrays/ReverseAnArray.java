package Arrays;

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        //two pointer approach
        for(int i = 0,j = a.length - 1;i<=j;i++,j--){

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
