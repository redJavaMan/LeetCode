import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String roman) {
        Map<Character,Integer> romanValues=new HashMap<>();
        romanValues.put('I',1);
        romanValues.put('V',5);
        romanValues.put('X',10);
        romanValues.put('L',50);
        romanValues.put('C',100);
        romanValues.put('D',500);
        romanValues.put('M',1000);
        int result=0;
        for(int i=0;i<roman.length();i++){
            result=result+romanValues.get(roman.charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
        String roman="III";
        System.out.println(romanToInt(roman));
    }
}
