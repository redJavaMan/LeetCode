public class MathematicalLogic {
    public static void main(String[] args) {
        String s = "aabbbbeeeeffggg";
        System.out.println(deriveLogic(s));
      }
      private static String deriveLogic(String s) {
          String result = "";
          int count = 1;
          for (int i = 0; i < s.length(); i++) {
              if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                  count++;
              } else {
                  result += s.charAt(i) + (count > 1 ? String.valueOf(count) : "");
                  count = 1;
              }
          }
          return result;
      }
}

