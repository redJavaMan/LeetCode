public class DataTypes {
    public static void main(String[] args) {
        // String conversions
        String str = String.valueOf(42);              // int to String
        str = Integer.toString(42);                    // int to String
        str = String.valueOf(3.14);                   // double to String
        str = String.valueOf(true);                   // boolean to String
        str = Character.toString('A');                // char to String

        // Numeric conversions
        int num = Integer.parseInt("42");             // String to int
        double dbl = Double.parseDouble("3.14");      // String to double
        long lng = Long.parseLong("1234567890");      // String to long
        float flt = Float.parseFloat("3.14");         // String to float

        // Between numeric types
        int i = (int) 3.14;                          // double to int
        double d = (double) 42;                      // int to double
        long l = (long) 42;                          // int to long
        float f = (float) 3.14;                      // double to float

        // Character conversions
        char c = str.charAt(0);                      // String to char
        int ascii = (int) 'A';                       // char to int
        char fromInt = (char) 65;                    // int to char

        // Boolean conversion
        boolean b = Boolean.parseBoolean("true");     // String to boolean
    }
}



