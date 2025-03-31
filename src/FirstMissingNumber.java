import java.util.ArrayList;

public class FirstMissingNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 3, 4, 7, 8};
        firstMissingPositiveNumber(num);
    }

    public static void firstMissingPositiveNumber(int[] num) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            res.add(num[i]);
        }
        for (int i = 1; i < 10; i++) {
            if (!res.contains(i)) {
                System.out.println("Missing Positive Number Is: " + i);
                break;
            }
        }
    }
}