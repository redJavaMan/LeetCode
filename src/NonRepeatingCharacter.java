import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(nonRepeatingCharacter(s));
    }
    public static String nonRepeatingCharacter(String s){
        int c=1;
        Map<Character,Integer> result = new HashMap<>();
        String output="";
        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<s.length();j++) {
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                }
                if(j==s.length()-1){
                    if(!result.containsKey(s.charAt(i))) {
                        result.put(s.charAt(i), c);
                        c = 1;
                    }
                }
            }
        }
        for(Map.Entry<Character,Integer> entry : result.entrySet()){
            if(entry.getValue()==1){
                output=output+entry.getKey();
            }
        }
        return output;
    }
}
