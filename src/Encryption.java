import java.util.ArrayList;
import java.util.List;

public class Encryption {
    public static void main(String[] args) {
        List<Integer> numbers =new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        encrypt(numbers);
    }

        public static void encrypt(List<Integer> numbers) {
            List<Integer> result = add(numbers);
            List<Integer> results = conversion(result);
            List<Integer> output = add(results);
            List<Integer> res = conversion(output);
            System.out.println(res);

        }
        public static List<Integer> conversion(List<Integer> result){
            List<Integer> output = new ArrayList<Integer>();
            for(int value:result) {
                if(9<value){
                    String con=String.valueOf(value);
                    output.add(Integer.parseInt(String.valueOf(con.charAt(1))));
                }
                else{
                    output.add(value);
                }
            }
            return output;
        }
        public static List<Integer> add(List<Integer> numbers){
            List<Integer> result = new ArrayList<Integer>();

            for(int i=0;i<numbers.size()-1;i++) {
                //System.out.println(numbers.get(i)+numbers.get(i+1));
                result.add(numbers.get(i)+numbers.get(i+1));
            }
            return result;
        }
}
