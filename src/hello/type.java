package hello;

public class type {
    static int a = 2;
    static double b = 2.9;
    static char c1 =102;
    static Integer in = 2;
    static Float f1 = 2.6f;
    static Double g = 7.8;
    static String st = "27";
    static Short sh = 3;


    public static void main (String[] args) {
        int c = (int) b;
        double b1 = (double) a;
        int v = c1;
        Number n = f1;
        Number n1 = new Double(7.8);
        Integer r1 = n.intValue();
        Integer r2 = n1.intValue();
        Number n3 = g;
        int nb = g.intValue();
        System.out.println(r1);
        System.out.println(c);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(nb);
        System.out.println(r2);

        String txt = "Hello World";
        System.out.println(txt);


    }
}
