public class RemoveCharacters {
    public static void main(String[] args) {
        String str1= "computer";
        String str2 = "cat";
        System.out.println(removeCharacters(str1, str2));
    }
    public static String removeCharacters(String str1, String str2) {
        String output=str1.replaceAll("["+str2+"]","");
        return output;
    }
}
