public class SeniorCitizen {
    public static int countSeniors(String[] details) {
        int senior=0;
        String age;
        for (String detail : details) {
            if (detail.contains("M")){
                age = detail.split("M")[1];
                int ageNo=Integer.parseInt(age);
                if(ageNo>6000){
                    senior=senior+1;
                }
            }else{
                age = detail.split("F")[1];
                int ageno=Integer.parseInt(age);
                if(ageno>6000){
                    senior=senior+1;
                }
            }
        }
        return senior;
    }
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(SeniorCitizen.countSeniors(details));
    }
}
