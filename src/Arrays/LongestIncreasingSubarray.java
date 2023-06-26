package Arrays;

import java.util.Scanner;

public class LongestIncreasingSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        //3 4 7 2 6 8 9 10 3 4 5 7 9 10 15
        int mc = 0;
        int c = 0;
        int start = 0;
        int end = 0;
        int last = 0;
        for(int i = 0;i<a.length;i++){
            c = 0;
            for(int j = i+1;j<a.length;j++){

                if(a[j]<=a[j-1]){
                    break;
                }
                c++;
                //System.out.println("count "+c);
                last = j;
               // System.out.println(end);
            }
            if(mc<c){
                mc = c;
                start = i;
                end = last;

            }

        }
        for(int i = start;i<=end;i++){

            System.out.print(a[i]+" ");

        }

    }
}

