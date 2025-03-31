import java.util.ArrayList;
import java.util.Arrays;

public class TwoEqualSubArray {
    public static void main(String[] args) {
        int[] target={1,2,3,4};
        int[] arr={2,4,1,3};
        System.out.println(canBeEqual(target,arr));
    }
    private static boolean canBeEqual(int[] target, int[] arr) {
        boolean condition;
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<target.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (target[i] == arr[j]) {
                    result.add(i, arr[j]);
                }
            }
        }
        int[] arr2 = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            arr2[i] = result.get(i);
        }
        condition=Arrays.equals(target,arr2);
        return condition;
    }
}
