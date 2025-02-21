import java.util.ArrayList;

public class BorrowNumber {
    public static void main(String[] args) {
     int num1=754;
     int num2=658;
     int output=0;
     String sNum1=String.valueOf(num1);
     String sNum2=String.valueOf(num2);
        ArrayList<Integer> number1=new ArrayList<>();
        ArrayList<Integer> number2=new ArrayList<>();
        for(int i=0;i<=sNum1.length()-1;i++){
            number1.add(Integer.parseInt(String.valueOf(sNum1.charAt(i))));
            number2.add(Integer.parseInt(String.valueOf(sNum2.charAt(i))));
        }
        for (int i=number1.size()-1;i>=0;i--){
            if (number1.get(i)<number2.get(i)){
                output++;
                int a = number1.get(i - 1) - 1;
                number1.set(i-1,a);
            }
        }
        System.out.println(output);
    }
}
