package Arrays.SubArrays;
import java.util.Scanner;

public class SmallestSubArrayWithSum {

    static void smallestSubArray(int[] a,int res){

        //count for finding minimum sub array
        int count = a.length+1;

        //find start index of sub array
        int start = -1;

        //find end index of sub array
        int end = -1;
        //System.out.println("hi");

        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a.length;j++){
                int sum = 0;

                //calculating sum
                for(int k = i;k<=j;k++){
                    sum = sum + a[k];
                }

                //checking sum with given sum
                if(sum == -res || sum==res){
                    //count is for finding minimum sub array
                    if(count>j-i+1){
                        start = i;
                        end = j;
                        count = j-i+1;
                    }
                }
            }
        }

        if(count==a.length+1){
            System.out.println("No subarray found.");
            return;
        }
        for(int i = start;i<=end;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        smallestSubArray(a,k);




    }
}
