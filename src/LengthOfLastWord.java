public class LengthOfLastWord {
    public static void main(String[] args) {
      System.out.println(lengthOfLastWord("Hello world"));
    }
    public static int lengthOfLastWord(String s) {
        String[] words =s.split(" ");
        int l=words.length-1;
        String word = words[l];
        return word.length();
    }
}
