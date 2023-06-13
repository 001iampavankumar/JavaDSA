package ClassicProblems;

public class reverseNumber {
    public static void main(String[] args) {

        int n = 12345;
        int rev = 0;
        int rem;
        while(n>0){

            rem = n%10;
            n = n/10;
            rev = rev*10 + rem;

        }
        System.out.println(rev);
    }
}
