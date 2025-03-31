public class MoveHashForward {
    public static void main(String[] args) {
        String s="Move#Hash#to#Front";
        System.out.println(moveHashFront(s));
    }
    public static String moveHashFront(String s) {
        int hash=0;
        String output="";
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(String.valueOf(c).equals("#")){
                hash++;
            }
        }
        String formattedString=s.replaceAll("#","");
        for(int i=1;i<=hash;i++){
            output=output.concat("#");
        }
        return output.concat(formattedString);
    }
}
