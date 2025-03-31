import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] number={7,8,2,0,1,3,9,5,2};
        bubbleSort(number);
        String[] fruits={"apple","banana","orange","mango"};
        sortWords(fruits);
    }
    private static void bubbleSort(int[] number){
        int temp;
        for (int i=0;i<number.length;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]<number[j]){
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
            System.out.print(number[i]+", ");
        }
    }
    private static void sortWords(String[] fruits){
        Arrays.sort(fruits);
        for(String fruit: fruits){
            System.out.print(fruit+", ");
        }
    }
}


