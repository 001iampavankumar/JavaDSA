package Arrays.SubArrays;
import java.util.Scanner;

public class SmallestSubArrayWithSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }

        int count1 = Integer.MAX_VALUE;
        int count2 = 0;
        int sum = 0;
        int start = -1;
        int end = -1;

        for(int i = 0;i<a.length;i++){
            for(int j = i;j<a.length;j++){
                sum = 0;
                for(int k = i;k<=j;k++){
                    sum = sum + a[k];
                    count2++;
                }
                if(sum == -res || sum==res){
                    if(count1>count2){
                        count1 = count2;
                        start = i;
                        end = j;
                    }
                }
            }

        }

        for(int i = start;i<=end;i++){
            System.out.print(a[i]+" ");
        }
    }
}
