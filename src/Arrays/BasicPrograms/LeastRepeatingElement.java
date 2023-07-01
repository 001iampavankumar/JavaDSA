package Arrays.BasicPrograms;

import java.util.Scanner;

public class LeastRepeatingElement {


    static void leastRepeating(int[] a){

        //take a hold of count
        //take a hold of minCount;
        int count = 1;
        int min = Integer.MAX_VALUE;
        int element = Integer.MAX_VALUE;

        for(int i = a.length -1;i>0;i--){

            if(a[i-1]==a[i]){
                count++;
            }
            else{
                if(count<min && count>1){
                    min = count;
                    element = a[i];
                }
                count = 1;
            }
        }
        if(count<min && count>1){
            element = a[0];
        }
        System.out.println(element);


    }
    // 1 1 2 2 3 3 4 4 5 5 6 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        leastRepeating(a);
    }
}
