package courses.lab1example;


/*
Целые. К ним относятся типы byte, short, int и long. Эти типы предназначены для целых чисел со знаком.
Типы с плавающей точкой — float и double. Они служат для представления чисел, имеющих дробную часть.
Символьный тип char. Этот тип предназначен для представления элементов из таблицы символов, например, букв или цифр.
Логический тип boolean. Это специальный тип, используемый для представления логических величин.
*/

public class Lab1Example {
    public static void main(String[] args) {
        //int - целое число с диапазоном -2147483648 до 2147483647.
        int intExample1;
        int intExample2;

        intExample1 = 2147483647;
        intExample2 = -2147483648;
        System.out.println(intExample1);
        System.out.println(intExample2);

        //short - целое число с диапазоном от  -32768 до 32767.
        short shortExample1;
        short shortExample2;

        shortExample1 = 32767;
        shortExample2 = -32768;
        System.out.println(shortExample1);
        System.out.println(shortExample2);

        //long - целое число в диапазоне от −2147483648 до 2147483647.
        long longExample1;
        long longExample2;

        longExample1 = 2147483647;
        longExample2 = -2147483648;
        System.out.println(longExample1);
        System.out.println(longExample2);

        //float служит для хранения чисел с плавающей запятой Диапазон значений — от -3.4028235E+38 до 3.4028235E+38
        float floatExample1;
        float floatExample2;

        floatExample1 = 10000.5F;
        floatExample2 = -10000.5F;
        System.out.println(floatExample1);
        System.out.println(floatExample2);

        //Double представляет вещественное число двойной точности с плавающей точкой в диапазоне +/- 1.7E-308 до 1.7E+308. В памяти занимает 8 байт (64 бита)

        double doubleExample1;
        double doubleExample2;

        doubleExample1 = 10.5;
        doubleExample2 = -1111.5;
        System.out.println(doubleExample1);
        System.out.println(doubleExample2);

        //char: представляет один символ в кодировке ASCII. Занимает в памяти 1 байт (8 бит). Может хранить любое значение из диапазона от -128 до 127, либо от 0 до 255
        char charExample;
        charExample = 'a';
        System.out.println(charExample);

        //bool: логический тип. Может принимать одну из двух значений true (истина) и false (ложь). Размер занимаемой памяти для этого типа точно не определен.
        boolean booleanExample1;
        boolean booleanExample2;

        booleanExample1 = true;
        booleanExample2 = false;
        System.out.println(booleanExample1);
        System.out.println(booleanExample2);

        for(int counter = 0; counter < 15;counter++){
            System.out.println(counter);
        }

        int whileExample = 1;
        while (whileExample>20){
            whileExample ++;
            whileExample = whileExample +1;
        }

        if (booleanExample1 == true)
        {
            System.out.println("Boolean is true");
        }
    }
}
