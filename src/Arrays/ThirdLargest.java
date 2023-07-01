package Arrays;

import java.util.Scanner;

public class ThirdLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int Smax = Integer.MIN_VALUE;
        int Tmax = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                Tmax = Smax;
                Smax = max;
                max = arr[i];
            }
            else if(Smax<arr[i]){
                Tmax = Smax;
                Smax = arr[i];
            }
            else if(Tmax<arr[i]){
                Tmax = arr[i];
            }
        }
        System.out.println(Tmax);


    }
}
