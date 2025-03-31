public class Capitalize {
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(CapitalizeCharacter(str,'l'));
    }
    private static String CapitalizeCharacter(String str,char a) {
       return str.replaceAll(String.valueOf(a),String.valueOf(a).toUpperCase());
    }
}
