public class LongestPalindrome {
    public static void main(String[] args) {
        String word="abcabccb";
        System.out.println(lengthOfLongestSubstring(word));;
    }
    public static int lengthOfLongestSubstring(String word) {
        String result="";
        String temp="";
        for (int i=0;i<word.length();i++) {
            if(!result.contains(temp+word.charAt(i))){
                result=result+word.charAt(i);
            }
        }
        return result.length();
    }
}
