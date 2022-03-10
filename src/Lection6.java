import java.sql.Time;
import java.util.Scanner;

//https://javarush.ipnodns.ru/lesson/lect6.html
public class Lection6 {

    public static void main(String[] args) {

    /*
    3. По 50 000 объектов Cat и Dog
    Создать в цикле по 50 000 объектов Cat и Dog.
     (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
     */
        System.out.println("start make object");
        // todo for(int i = 0; i < 200000; i++)
        for(int i = 0; i < 2; i++)
        {

            Cat5 cat = new Cat5("Murzik");
            Dog5 dog = new Dog5("Rex");
        }
        System.out.println("Finish make object");

        double d;
        d= Unit.getDistance(1.0, 2.2, 3.9, 17);
        System.out.println("getDistance="+d );



    }
}

/*
1. Метод finalize класса Cat

В классе Cat создать метод protected void finalize() throws Throwable
 */

/*
4. Счётчик котов
В конструкторе класса Cat [public Cat()]
увеличивать счётчик котов (статическую переменную catCount этого же класса) на 1.
В методе finalize уменьшать на 1.
 */

class Cat5
{
    public static int catCount = 0;

      //получаем значение статичкой переменной catCount
    public static int getCatCount()
    {
        return Cat5.catCount;

    }

    //инициализируем значение статической переменной catCount
    public static void setCatCount(int i)
    {
        Cat5.catCount = i;

    }

    private String name;

    Cat5(String name)
    {
        this.name = name;
        Cat5.catCount++;
        //System.out.println(this.name + " build");
    }

    public Cat5()
    {

        catCount++;
    }

    protected void finalize() throws Throwable
    {
        Cat5.catCount--;
        System.out.println(this.name + " destroyed!!!!!!!!!!!!!!");
    }
}
/*
2. Классы Cat и Dog и метод finalize для каждого
В каждом классе Cat и Dog написать метод finalize,
 который выводит на экран текст о том, что такой-то объект уничтожен.
 */
class Dog5{
   private String name;

    Dog5(String name)
    {
        this.name = name;
        //System.out.println(this.name + " build");
    }

    protected void finalize() throws Throwable
    {
        System.out.println(this.name + " destroyed!!!!!!!!");
    }

}

/*
3. Класс Util
Реализовать статический метод double getDistance(x1, y1, x2, y2).
Он должен вычислять расстояние между точками.
Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра
 */

class Unit{

    private static double x1, y1, x2, y2;

    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

}

/*
4. Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false"
и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли
(BufferedReader или Scanner) внутри каждого метода
 */

class ConsoleReader{

    //читает с клавиатуры строку
    public static String readString(){
        Scanner scanner = new Scanner(System.in );
        return scanner.nextLine();
    };

    //читает с клавиатуры число
    public static int readInt(){
        Scanner scanner = new Scanner(System.in );
        return scanner.nextInt();
    };



    //читает с клавиатуры дробное число
    public  static double readDouble(){
        Scanner scanner = new Scanner(System.in );
        return scanner.nextDouble();
    }

    //читает с клавиатуры строку "true" или "false"
    public static boolean readBoolean(){
        Scanner scanner = new Scanner(System.in );
        return scanner.hasNextBoolean();
    }

}

/*
5. Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку, повторенную count раз.
String multiply(String s) – возвращает строку, повторенную 5 раз.

 */
class StringHelper {
    public static String multiply(String s) {
        String result = "";

        for (int i = 0; i < 5; i++) {
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";

        for (int j = 0; j < count; j++) {
            result += s;
        }
        return result;
    }

}
/*
public class StringHelper {
    public static String multiply(String s) {
        String result = "";

        for (int i = 0; i < 5; i++) {
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";

        for (int j = 0; j < count; j++) {
            result += s;
        }
        return result;
    }
}
 */
