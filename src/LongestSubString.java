public class LongestSubString {
    public static void main(String[] args) {
        String word="babad";
        String subString;
        String rev="";
        for (int i=0;i<word.length();i++) {
            for (int j=i+1;j<word.length();j++) {
                subString=word.substring(i,j);
                for (int k=subString.length()-1;k>=0;k--) {
                    rev=rev+subString.charAt(k);
                    if (subString.equals(rev)) {
                        System.out.println(subString);
                    }
                }
            }

        }
    }
}
