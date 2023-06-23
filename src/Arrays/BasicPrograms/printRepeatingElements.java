package Arrays.BasicPrograms;

public class printRepeatingElements {

    public static void main(String[] args) {
        int[] a = { 1,5,7,2,4};
        int max = 0;

        for(int i = 0,j = 1,k = 1;i<=a.length;i++,j++){

            if (max < a[i]*a[j]){
                max = a[i]*a[j];
            }

            if(i==a.length){
                i = k;
                k++;
            }
        }
    }

}
