package Task_3.Task_3_2;

public class ToDouble {
    public static void main(String[] args) {
        Double first = Double.valueOf(3.14);
        System.out.println(first);

        String numbers = "333.1231";
        Double second = Double.parseDouble(numbers);
        System.out.println(second);

        Double third = Double.valueOf(3.33);
        int inter = third.intValue();
        System.out.println(inter);
        short sh = third.shortValue();
        System.out.println(sh);
        double doub = third.doubleValue();
        System.out.println(doub);
        float floatt = third.floatValue();
        System.out.println(floatt);
        long lon = third.longValue();
        System.out.println(lon);
        byte byt = third.byteValue();
        System.out.println(byt);

        double dd = 3.14;
        String d = Double.toString(dd);
        System.out.println(d);








    }

}
