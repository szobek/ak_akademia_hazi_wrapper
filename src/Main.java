public class Main {
    public static void main(String[] args) {
        double d = 3.14;

        //double->Double
        Double dw = Double.valueOf(d);

        //Doube ->double
        Double dw2 = 3.14;
        double d2 = dw2.doubleValue();

        //String->double
        String s1 = "3.14";
        double d3 = Double.parseDouble(s1);
        //double->String

        String s2 = String.valueOf(d);

        //Double->String
        String s3 = Double.toString(dw);

        //String->Double
Double dw3 = Double.parseDouble(s1);
//**********************************************************************************************************


        //boolean->Boolean

    }
}