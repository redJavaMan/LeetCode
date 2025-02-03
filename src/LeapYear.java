public class LeapYear {
    public static void main(String[] args) {
        leapYear(2016);
    }
    private static void leapYear(int year){
        if(year%4==0 && (year % 100 != 0 || year % 400 == 0)){
            System.out.println("It is a Leap Year");
        }else{
            System.out.println("It is not a Leap Year");
        }
    }
}

