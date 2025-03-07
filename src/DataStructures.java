import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
        // ArrayList - Dynamic array
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("First");             // Add to end
        arrayList.add(0, "New First");      // Add at index
        arrayList.addAll(Arrays.asList("Second", "Third")); // Add collection
        arrayList.set(1, "First");         // Update element
        arrayList.get(0);                  // Access element
        arrayList.remove("First");         // Remove by object
        arrayList.remove(0);               // Remove by index
        arrayList.contains("Third");       // Check existence
        arrayList.indexOf("Second");       // Get first occurrence index
        arrayList.lastIndexOf("Third");    // Get last occurrence index
        arrayList.subList(0, 1);           // Get sublist
        arrayList.ensureCapacity(10);      // Ensure minimum capacity
        arrayList.trimToSize();            // Trim to current size
        arrayList.clear();                 // Clear all elements

        // Vector - Synchronized dynamic array
        Vector<Integer> vector = new Vector<>();
        vector.addElement(1);             // Add element
        vector.insertElementAt(0, 0);      // Insert at index
        vector.setElementAt(2, 1);        // Update element
        vector.elementAt(0);              // Get element
        vector.removeElement(2);           // Remove by object
        vector.removeElementAt(0);        // Remove by index
        vector.firstElement();            // Get first element
        vector.lastElement();             // Get last element
        vector.elements();                // Get enumeration
        vector.setSize(10);               // Force size
        vector.capacity();                 // Get current capacity

        // LinkedList - Doubly-linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("First");      // Add to front
        linkedList.addLast("Last");        // Add to end
        linkedList.offer("Offer");         // Add to end (queue)
        linkedList.push("Push");           // Add to front (stack)
        linkedList.peekFirst();           // Get first without removing
        linkedList.peekLast();            // Get last without removing
        linkedList.pollFirst();           // Remove and return first
        linkedList.pollLast();             // Remove and return last
        linkedList.descendingIterator();  // Reverse order iterator
        linkedList.removeFirstOccurrence("First"); // Remove first match
        linkedList.removeLastOccurrence("Last");   // Remove last match

        // HashSet - Unordered unique collection
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.addAll(Arrays.asList("Banana", "Orange"));
        hashSet.remove("Apple");           // Remove element
        hashSet.contains("Banana");       // Check existence
        hashSet.retainAll(Arrays.asList("Banana")); // Keep only in collection
        hashSet.removeAll(Arrays.asList("Banana")); // Remove all in collection
        hashSet.isEmpty();                // Check if empty

        // TreeSet - Sorted unique collection
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.ceiling(4);               // Smallest element >=4
        treeSet.floor(6);                 // Largest element <=6
        treeSet.higher(3);                // Smallest element >3
        treeSet.lower(6);                 // Largest element <6
        treeSet.headSet(5);               // Elements <5
        treeSet.tailSet(5);               // Elements >=5
        treeSet.pollFirst();              // Remove and return first
        treeSet.pollLast();               // Remove and return last

        // LinkedHashSet - Insertion-ordered unique collection
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.remove("One");
        // Maintains insertion order during iteration

        // HashMap - Key-value pairs
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.putIfAbsent("A", 2);      // Only put if key absent
        hashMap.getOrDefault("B", 0);     // Return default if missing
        hashMap.containsKey("A");         // Check key existence
        hashMap.containsValue(1);         // Check value existence
        hashMap.replace("A", 2);          // Update value
        hashMap.remove("A", 2);           // Remove only if key-value match
        hashMap.compute("A", (k, v) -> v + 1); // Modify value
        hashMap.entrySet();               // Get key-value pairs
        hashMap.keySet();                 // Get all keys
        hashMap.values();                 // Get all values

        // Hashtable - Synchronized key-value pairs
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.elements();             // Get value enumeration
        hashtable.keys();                 // Get key enumeration

        // TreeMap - Sorted key-value pairs
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.ceilingKey("B");          // Smallest key >= "B"
        treeMap.floorKey("B");            // Largest key <= "B"
        treeMap.descendingMap();          // Reverse order view
        treeMap.navigableKeySet();        // Navigable key set

        // Stack - LIFO structure
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.search("First");            // Returns 1-based position
        stack.empty();                    // Check if empty

        // Queue - FIFO structure (using LinkedList implementation)
        Queue<String> queue = new LinkedList<>();
        queue.add("First");               // Throws exception if full
        queue.element();                  // Peek (throws if empty)
        queue.remove();                   // Remove (throws if empty)
    }
}