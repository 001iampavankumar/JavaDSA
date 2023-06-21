package Arrays;
import java.util.Scanner;
public class Secondargest {
    public static int findSecondLargest(int[] arr) {
        // write your code here

        int lar = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){

            if(lar<arr[i]){
                sec = lar;
                lar = arr[i];
            }
            else if(sec<arr[i]){
                sec = arr[i];
            }
        }
        return sec;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for(int i = 0;i<a.length;i++){

            a[i] = scanner.nextInt();
        }
        System.out.println(findSecondLargest(a));

    }
}
