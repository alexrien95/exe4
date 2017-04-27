package javaapplication2;

public class Factorial_capsa_negra {

    private static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    private static int fact2(int n){
        int res = 0;
        if(n==0 || n==1)System.out.println("1");
        for(int i=2; i<=n; i++) res=res*i;
        return res;
    }
    public static void main(String[] args){
        System.out.println(factorial(Integer.parseInt(args[0])));
    }
}
