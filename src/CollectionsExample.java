import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // 1. Sorting a list
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 3));
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers); // [1, 2, 3, 5, 8]

        // 2. Reversing a list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers); // [8, 5, 3, 2, 1]

        // 3. Shuffling elements
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers); // Random order

        // 4. Binary search (list must be sorted first)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Binary Search for 3: Index " + index); // 2

        // 5. Create synchronized collection
        List<String> syncList = Collections.synchronizedList(new ArrayList<>());
        syncList.add("Thread-Safe");
        System.out.println("Synchronized List: " + syncList);

        // 6. Create unmodifiable collection
        List<String> readOnly = Collections.unmodifiableList(Arrays.asList("A", "B", "C"));
        System.out.println("Unmodifiable List: " + readOnly);

        // 7. Frequency of element
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "apple");
        int freq = Collections.frequency(words, "apple");
        System.out.println("Frequency of 'apple': " + freq); // 3

        // 8. Check disjoint collections
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        boolean isDisjoint = Collections.disjoint(list1, list2);
        System.out.println("Are lists disjoint? " + isDisjoint); // true

        // 9. Add multiple elements
        List<String> addAllList = new ArrayList<>();
        Collections.addAll(addAllList, "E", "F", "G");
        System.out.println("After addAll: " + addAllList); // [E, F, G]

        // 10. Swap elements
        List<Integer> swapList = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        Collections.swap(swapList, 0, 3);
        System.out.println("After swapping: " + swapList); // [40, 20, 30, 10]

        // 11. Rotate elements
        List<Integer> rotateList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.rotate(rotateList, 2);
        System.out.println("After rotation: " + rotateList); // [4, 5, 1, 2, 3]

        // 12. Find max/min element
        List<Integer> nums = Arrays.asList(15, 3, 9, 22, 4);
        System.out.println("Max: " + Collections.max(nums)); // 22
        System.out.println("Min: " + Collections.min(nums)); // 3

        // 13. Replace all occurrences
        List<Integer> replaceList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 2));
        Collections.replaceAll(replaceList, 2, 20);
        System.out.println("After replaceAll: " + replaceList); // [1, 20, 3, 20, 4, 20]

        // 14. Fill list with values
        List<String> fillList = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
        Collections.fill(fillList, "A");
        System.out.println("After fill: " + fillList); // [A, A, A]

        // 15. Copy list
        List<String> source = Arrays.asList("One", "Two", "Three");
        List<String> dest = new ArrayList<>(Arrays.asList("", "", ""));
        Collections.copy(dest, source);
        System.out.println("Copied List: " + dest); // [One, Two, Three]

        // 16. Reverse order comparator
        List<Integer> reverseOrderList = new ArrayList<>(Arrays.asList(5, 3, 9, 1));
        Collections.sort(reverseOrderList, Collections.reverseOrder());
        System.out.println("Reverse Order Sort: " + reverseOrderList); // [9, 5, 3, 1]


    }
}
