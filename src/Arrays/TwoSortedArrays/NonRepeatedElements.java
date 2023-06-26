package Arrays.TwoSortedArrays;
import java.util.Scanner;
public class NonRepeatedElements {

    static void nonRepeated(int[] a1,int[] a2){
        int count = 0;
        //first array
        for(int i = 0;i<a1.length;i++){
            count = 0;
            for(int j = 0;j<a2.length;j++){
                if(a2[j]!=a1[i]){
                    count++;
                }

            }
            if(count == a2.length){
                System.out.print(a1[i]+" ");
            }
        }

        //2nd array
        for(int i = 0;i<a2.length;i++){
            count = 0;
            for(int j = 0;j<a1.length;j++){
                if(a1[j]!=a2[i]){
                    count++;
                }

            }
            if(count == a1.length){
                System.out.print(a2[i]+" ");
            }
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        if (arr1.length == 0 || arr2.length == 0) {
            return;
        }

        nonRepeated(arr1,arr2);


    }

}
