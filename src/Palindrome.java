public class Palindrome {
    public static void main(String[] args) {
        palindrome("madam");
    }
    private static void palindrome(String word){
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        if(rev.equals(word)){
            System.out.println("It is a Palindrome: "+word);
        }
        else{
            System.out.println("It is not a Palindrome: "+word);
        }
    }
}


