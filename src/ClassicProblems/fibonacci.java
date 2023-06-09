package ClassicProblems;

public class fibonacci {
    public static void main(String[] args) {
        int n = 6;

        int a = -1;
        int b = 1;
        int c = 0;
        for(int i = 0;i<=n;i++){
            System.out.print(c+" ");
            c = a+b;
            a = b;
            b = c;
        }
    }
}
