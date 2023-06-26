package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }


        if(a.length < 2){
            return;
        }
        //Moving zeroes to end

        int zero = 0;
        int nonZero = 0;

        //using two pointer approach
        while(nonZero<a.length) {

            if (a[nonZero] != 0) {
                int temp = a[nonZero];
                a[nonZero] = a[zero];
                a[zero] = temp;
                nonZero++;
                zero++;
            } else {
                nonZero++;
            }
        }
        for (int i:a) {
            System.out.print(i+" ");
        }
    }
}


