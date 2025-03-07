import java.util.Arrays;
import java.util.List;

public class ArrayExamples {
    public static void main(String[] args) {
        // 1. Sorting arrays
        int[] numbers = {5, 2, 9, 1, 5};
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        // Output: Sorted array: [1, 2, 5, 5, 9]

        // 2. Binary search
        int key = 9;
        int index = Arrays.binarySearch(numbers, key);
        System.out.println("Binary search for 9: Index " + index);
        // Output: Binary search for 9: Index 4

        // 3. Filling arrays
        int[] filled = new int[5];
        Arrays.fill(filled, 10);
        System.out.println("Filled array: " + Arrays.toString(filled));
        // Output: Filled array: [10, 10, 10, 10, 10]

        // 4. Array copying
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOf(original, 3);
        int[] rangeCopy = Arrays.copyOfRange(original, 1, 4);
        System.out.println("Copied arrays: " + Arrays.toString(copy) + " | " + Arrays.toString(rangeCopy));
        // Output: Copied arrays: [1, 2, 3] | [2, 3, 4]

        // 5. Array comparison
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean equal = Arrays.equals(arr1, arr2);
        System.out.println("Arrays equal? " + equal);
        // Output: Arrays equal? true

        // 6. Converting to List
        String[] words = {"apple", "banana", "cherry"};
        List<String> wordList = Arrays.asList(words);
        System.out.println("Array as List: " + wordList);
        // Output: Array as List: [apple, banana, cherry]

        // 7. Hash code calculation
        int hash = Arrays.hashCode(arr1);
        System.out.println("Array hash code: " + hash);
        // Output: Array hash code: 30817

        // 8. Multidimensional arrays
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("Deep toString: " + Arrays.deepToString(matrix));
        // Output: Deep toString: [[1, 2], [3, 4]]

        // 9. Comparing nested arrays
        int[][] matrix2 = {{1, 2}, {3, 4}};
        boolean deepEqual = Arrays.deepEquals(matrix, matrix2);
        System.out.println("Deep equals? " + deepEqual);
        // Output: Deep equals? true

        // 10. Lexicographical comparison
        int[] set1 = {1, 2, 3};
        int[] set2 = {1, 2, 4};
        int comparison = Arrays.compare(set1, set2);
        System.out.println("Comparison result: " + comparison);
        // Output: Comparison result: -1

        // 11. Finding mismatch
        int mismatchIndex = Arrays.mismatch(set1, set2);
        System.out.println("First mismatch at index: " + mismatchIndex);
        // Output: First mismatch at index: 2

        // 12. Parallel sorting
        int[] bigArray = {5, 3, 9, 1, 7, 2, 8, 4};
        Arrays.parallelSort(bigArray);
        System.out.println("Parallel sorted: " + Arrays.toString(bigArray));
        // Output: Parallel sorted: [1, 2, 3, 4, 5, 7, 8, 9]

        // 13. Set values using generator
        int[] generated = new int[5];
        Arrays.setAll(generated, i -> i * 2);
        System.out.println("Generated array: " + Arrays.toString(generated));
        // Output: Generated array: [0, 2, 4, 6, 8]

        // 14. Stream processing
        System.out.print("Array stream: ");
        Arrays.stream(generated).forEach(n -> System.out.print(n + " "));
        // Output: Array stream: 0 2 4 6 8

    }
}
