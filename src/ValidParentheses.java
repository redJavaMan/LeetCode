public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean result= Boolean.parseBoolean(null);
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(s.substring(i+1,s.length()-1).contains(")")){
                    result=true;
                }else {
                    result=false;
                    break;
                }

            }
            if(s.charAt(i)=='{') {
                if (s.substring(i + 1, s.length() - 1).contains("}")) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            if(s.charAt(i)=='[') {
                if (s.substring(i + 1, s.length() - 1).contains("]")) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }}
