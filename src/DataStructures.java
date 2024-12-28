import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");
        arrayList.add("Second");
        arrayList.add("Third");
        arrayList.set(1, "New Second");  // Modify element
        System.out.println(arrayList.get(0));  // Access by index
        arrayList.remove(1);  // Remove by index

        // Safe for multi-threaded access
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.elementAt(0);  // Access element
        vector.removeElementAt(1);  // Remove element

        // Efficient for insertions/deletions at both ends
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("First");
        linkedList.addLast("Last");
        linkedList.add("Middle");
        linkedList.removeFirst();
        linkedList.removeLast();

        // No guaranteed order
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple");  // Ignored (duplicate)
        System.out.println(hashSet.contains("Apple"));  // true
        System.out.println(hashSet.size());  // 2


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        System.out.println(treeSet);  // Prints in order: [2, 5, 8]
        System.out.println(treeSet.first());  // 2
        System.out.println(treeSet.last());   // 8

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        // Iterates in insertion order
        for(String element : linkedHashSet) {
            System.out.println(element);
        }

        // No guaranteed order
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("John", 26);  // Updates existing value
        System.out.println(hashMap.get("John"));  // 26
        hashMap.remove("Alice");

        // All methods are synchronized
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        System.out.println(hashtable.get(1));  // "One"
        hashtable.remove(2);

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        System.out.println(treeMap);  // Prints in key order
        System.out.println(treeMap.firstKey());  // "A"
        System.out.println(treeMap.lastKey());   // "C"

        //Stack - LIFO (Last-In-First-Out)
        Stack<String> stack = new Stack<>();
        stack.push("Bottom");
        stack.push("Middle");
        stack.push("Top");
        System.out.println(stack.pop());    // Returns "Top"
        System.out.println(stack.peek());   // Returns "Middle" without removing

        //Queue - FIFO (First-In-First-Out)
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println(queue.poll());   // Returns "First"
        System.out.println(queue.peek());   // Returns "Second" without removing

    }
    }

