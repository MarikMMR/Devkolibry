package hello;

public class perem {
    // примитивные типы данных
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

    // Ссылочые ипы данных имеют какие то свойства, это отдельне классы
     static String st = "hi, guy";
     static char c = 'i'; // хранит только один символ

    public static void main(String[] args) {  // точка входа в программу
        System.out.println("byte: " + b);
        System.out.println("short: " + aShort);
        System.out.println("int: " + it);
        System.out.println("long: " + l);
        System.out.println("           ");
// существует 2 вида коментариев однострочный
        /* а
              так
                  же
                      многострочный
                                    с таким вот синтаксисом
         */
        System.out.println("float: " + fl);
        System.out.println("double: " + aDouble);
        System.out.println("            ");
        System.out.println("bool: " + true );
        System.out.println("bool2: " + false);
        System.out.println("               ");
        // Ctrl+d - дубирование строки
        System.out.println(st);
        System.out.println(c);

    }

}
