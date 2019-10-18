package hello;

public class perem {
    static byte b = 127;
    static short aShort = 8;
    static int it = 99;
    static long l = 6546;


    static float fl=2.6f;
    static double aDouble = 3.7;
    // сначала тип хранимых данных например int
    // b, l, it - имя -можно любое кроме цифр можно цифры вконце ставить например it6
    boolean bool= true;
    boolean bool2 = false;
    //логический оератор принимает значения только правда и ложь
    public static void main(String[] args) {  // точка входа в программу
        System.out.println("byte: " + b);
        System.out.println("short: " + aShort);
        System.out.println("int: " + it);
        System.out.println("long: " + l);

        System.out.println("float: " + fl);
        System.out.println("double: " + aDouble);
        System.out.println("bool: " + true );
        System.out.println("bool2: " + false);
        // Ctrl+d - дубирование строки

    }

}
