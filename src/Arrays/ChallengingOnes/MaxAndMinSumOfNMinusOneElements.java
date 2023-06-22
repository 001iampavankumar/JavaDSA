package Arrays.ChallengingOnes;

import java.util.Scanner;

public class MaxAndMinSumOfNMinusOneElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("enter " + n + " Elements: ");

        for (int i = 0; i < a.length; i++) {

            a[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                if(i!=j){
                    sum = sum + a[j];
                }
            }
            if(sum>max){
                max = sum;
            }
            if(min>sum){
                min = sum;
            }
            sum = 0;
        }

        System.out.println(min +" "+ max);

    }

}
