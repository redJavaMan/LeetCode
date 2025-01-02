import java.util.Vector;

public class DistinctArray {
    public static void main(String[] args) {
       String[] arr = {"aaa","aa","a"};
       int k = 1;
        System.out.println(kthDistinct(arr, k));
    }
    private static String kthDistinct(String[] arr, int k) {
        try {
            Vector<String> duplicate = new Vector<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        duplicate.add(arr[i]);
                    }
                }
            }
            Vector<String> result = new Vector<>();
            for (int i = 0; i < arr.length; i++) {
                result.add(arr[i]);
            }
            for (int i = 0; i < duplicate.size(); i++) {
                result.remove(duplicate.get(i));
                result.remove(duplicate.get(i));
            }
            return result.get(k - 1);
        }catch (Exception e){
            return "";
        }
    }
}
