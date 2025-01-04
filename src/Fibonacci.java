public class Fibonacci {
    public static void main(String[] args) {
    fibonacci(5);
    }
    private static void fibonacci(int fibonacciNumber){
        //0,1,1,2,3,5
        int n1=0;
        int n2=1;
        int result;
        for (int i=0; i<fibonacciNumber;i++){
            result=n1 + n2;
            System.out.println(result);
            n1=n2;
            n2=result;
        }
    }
}
