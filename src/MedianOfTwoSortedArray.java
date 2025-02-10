import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedianOfTwoSortedArray {

    public static void main(String[] args) {
        int[] n1={1,2};
        int[] n2={3,4};
        System.out.println(mergeArray(n1,n2));
        median(mergeArray(n1,n2));
    }
    public static List<Integer> mergeArray(int[] n1, int[] n2){
        List<Integer> mergedNumbers=new ArrayList<>();
        for (int i=0;i<n1.length;i++){
            mergedNumbers.add(n1[i]);
        }
        for (int i=0;i<n2.length;i++){
            mergedNumbers.add(n2[i]);
        }
        return mergedNumbers;
    }
    public static void median(List<Integer> mergedArray){
        List<Integer> subArray=new ArrayList<>();
        double result;
        if(mergedArray.size()%2==0){
            int m=mergedArray.size()/2;
            subArray=mergedArray.subList(m,mergedArray.size());
            System.out.println("mergedArray : "+mergedArray.get(m-1));
            System.out.println("subArray : "+subArray.get(0));
            result=(mergedArray.get(m-1)+(double)subArray.get(0))/2;
            System.out.println(result);
        }else{
            int n=mergedArray.size()/2;
            System.out.println(mergedArray.get(n));
        }
    }
}
