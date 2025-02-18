import java.util.ArrayList;

public class LongestSubStringCharacters {
    public static void main(String[] args) {
        String s="abcdefabcbb";
        longestSubString(s);
    }
    public static int longestSubString(String s){
        ArrayList<Character> result = new ArrayList<>();
        int num=0;
        for(int i=0;i<s.length()-1;i++) {
            if (!result.contains(s.charAt(i))) {
                result.add(s.charAt(i));
                num++;
            } else if (result.contains(s.charAt(i))) {
                break;
            }
        }
        System.out.println(num);
        return num;
    }
}
