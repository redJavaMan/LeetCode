public class Factorial {
    public static void main(String[] args) {
    factorial(5);
    }
    private static void factorial(int factorialNumber){
        //1*2*3*4*5*6*7*8*9*10
        int result=1;
        for (int i=1;i<=factorialNumber;i++){
            result= result*i;
        }
        System.out.println(result);
    }
}

