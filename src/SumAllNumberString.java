public class SumAllNumberString {
    public static void main(String[] args) {
        String str="1abc23";
        System.out.println(sumAllNumberString(str));
    }
    public static int sumAllNumberString(String str) {
        String s=str.replaceAll("[abcdefghijklmnopqrstuvwxyz]"," ");
        String[] n=s.split(" ");
        int sum=0;
        for (int i=0;i<n.length;i++) {
            if (n[i]!="") {
                int v = Integer.parseInt(n[i]);
                sum = sum + v;
            }
        }
        return sum;
    }
}
