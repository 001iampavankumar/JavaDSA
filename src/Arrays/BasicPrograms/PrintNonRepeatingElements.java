package Arrays.BasicPrograms;
import java.util.Scanner;
public class PrintNonRepeatingElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for(int i = 0;i<a.length;i++){

            a[i] = sc.nextInt();

        }

        for(int i = 1;i<a.length;i++){
            if(a[i-1]!=a[i]){
                System.out.print(a[i-1] + " ");
            }
            else if(a[i-1]==a[i]){
                i = i+1;
            }
        }
    }
}
