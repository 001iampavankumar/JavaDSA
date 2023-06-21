package Arrays.BasicPrograms;

import java.util.Scanner;

public class CountUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){

            a[i] = sc.nextInt();
        }

        int count = 0;
        for(int i  = 1;i<a.length;i++){
            if(a[i-1] == a[i]){
                count++;
            }

        }

        System.out.println(a.length - count);
    }
}
