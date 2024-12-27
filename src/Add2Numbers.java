import java.util.LinkedList;

public class Add2Numbers {

    public static void main(String[] args) {

        LinkedList<Integer> l1=new LinkedList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList<Integer> l2=new LinkedList<Integer>();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println(reversedSum(reverseNumber(l1),reverseNumber(l2)));
    }
    public static int reverseNumber(LinkedList<Integer> l1){
        String rev="";
        for(int i=l1.size()-1;i>=0;i--){
            rev=rev+l1.get(i).toString();
        }
        return Integer.parseInt(rev);
    }
    public static LinkedList<Integer> reversedSum(int n1,int n2){
        int sum = n1+n2;
        LinkedList<Integer> result=new LinkedList<Integer>();
        String sumString=String.valueOf(sum);
        String rev="";
        for (int i=sumString.length()-1;i>=0;i--){
            result.add(Integer.parseInt(rev+sumString.charAt(i)));
        }
        return result;
    }
}
