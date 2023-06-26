package Arrays;

import java.util.Scanner;

public class RepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 1;i<a.length;i++){

            if(a[i-1]==a[i]){
                System.out.print(a[i-1]+" ");
                //suppose if there are any adjacent element equal then we will iterate through it
                while(a[i-1]==a[i]){
                    i++;
                }
            }
        }
    }
}
