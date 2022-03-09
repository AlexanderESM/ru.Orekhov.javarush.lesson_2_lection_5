import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
    /*
    Задача 1. Минимум двух чисел
    Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
    */
    Value myValue = new Value();
    myValue.inputValue();

    /*
    Задача 2. Максимум четырех чисел
    Ввести с клавиатуры четыре числа, и вывести максимальное из них.
    */
    myValue.inputFourNumber();

    /*
    Задача 3. Сортировка трех чисел
    Ввести с клавиатуры три числа, и вывести их в порядке убывания
    */
     SortNumber mySortNum = new SortNumber();
     mySortNum.sortArray();

    /*
    Задача 4. Сравнить имена
    Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
    Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны»
    */
    EqualsString myEqualsName = new EqualsString();
    myEqualsName.equalsString();

    /*
    Задача 5. 18+
    Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
    */
    Age age = new Age();
    age.age();

    /*
    Задача 6. И 18-ти достаточно
    Ввести с клавиатуры имя и возраст.
    Если возраст больше 20 вывести надпись «И 18-ти достаточно»
     */
    age.age();

    /*
    1. 10 чисел
    Вывести на экран числа от 1 до 10, используя цикл while.
    */
    int i=1;
    while(i<11){
        System.out.println(i);
        i++;
    }

    /*
    2. 10 чисел наоборот
    Вывести на экран числа от 10 до 1, используя цикл while.
    */
    while( i != 1 ){
        i--;
        System.out.println(i);

    }

    /*
    3. Хорошего не бывает много

    Ввести с клавиатуры строку и число N.
    Вывести на экран строку N раз, используя цикл while.

    Пример ввода:
    абв
    2
    Пример вывода:
    абв
    абв
     */
    RepeatLine repeatLine = new RepeatLine();
    repeatLine.repitLine();

    /*
    4. S-квадрат

    Вывести на экран квадрат из 10х10 букв S используя цикл while.
    Буквы в каждой строке не разделять.
     */
    RepeatLetter repeat = new RepeatLetter();
    repeat.vertically(10,10 );

    /*
    5. Таблица умноження

    Вывести на экран таблицу умножения 10х10 используя цикл while.
    Числа разделить пробелом.
     */

       int a=1, b=1;
        while(a<=10)
        {
            System.out.print(a+" ");
            while(b<=9)
            {
                b++;
                System.out.print(a*b+" ");
            }
            a++;
            b=1;
            System.out.println("");
        }

/*
1. Четные числа

Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
 */

        for (int n=1; n < 101;n++)
        {
            if (n%2==0)
                System.out.println(n);
        }


/*
2. Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888
 */
    MakeSquare square = new MakeSquare();
    square.makeSquare();
/*
3. Рисуем треугольник

Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.

Пример:
8
88
888
 */
    MakeTriangle triangle = new MakeTriangle();
    triangle.makeTriangle();

/*
4. Рисуем линии

Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
 */

    MakeLine makeLine = new MakeLine();
    makeLine.makeLike();
/*
5. Все любят Мамбу

Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
 */
    Love love = new Love();
    love.love();

    }
}

class Love{
    void love(){
       String myName=null;
        InputName name = new InputName();
        myName = name.setName();
        for(int i=0; i<10; i++) {
            System.out.println(myName + " любит меня.");
        }
    }
}

//для ввода имени
class InputName{
    String setName(){
        String str="";

        Scanner scanner = new Scanner(System.in);
        // строка недолжна быть пустой

        while (str.trim().length() == 0){
            System.out.print("Введите имя:");
            str = scanner.nextLine();
        }

        return str;
    }
}

//для ввода числа
class InputNumber{
    void setNumber(){
       int num=0;
        Scanner scanner = new Scanner(System.in);
       //номер num должени быть > 0
        while (num==0){
            System.out.print("Введите число:");
            num = scanner.nextInt();
        }


    }



}

class MakeLine{
    void makeLike(){

        for(int i = 1; i <= 10; i++){

            System.out.print(8);
        }
        System.out.println( );
        for(int i = 1; i <= 10; i++){
            System.out.println(8);
        }

    }


}


//одно задание лучьше другого

class MakeTriangle{
    void makeTriangle (){
        String str = "8";
        for (int i = 0; i < 10; i++){
            System.out.println(str);
            str = str + 8;
        }
    }
}

class MakeSquare {
    void makeSquare(){
       int num1=0, num2=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        num1 = scanner.nextInt();
        System.out.print("Введите второе число:");
        num2 = scanner.nextInt();
        for(int i=1; i <= num1; i++){
            for(int j=1; j <= num2; j++)
                System.out.print("8");
            System.out.println();
        }
    }

}

//'обожаю' задания с JavaRush
class RepeatLetter{
    void repeatРorizontally(int a){
        while (a > 0)
        {
            System.out.print("S");
            a--;
        }
    }
    void vertically(int b, int a){
        while (b>0){
            repeatРorizontally(a);
            System.out.println();
            b--;
        }
    }


}

class RepeatLine{
    void repitLine(){
        int i=0,num=0;
        String str="";

        Scanner scanner = new Scanner(System.in);
        // строка недолжна быть пустой

        while (str.trim().length() == 0){
            System.out.print("Введите имя:");
            str = scanner.nextLine();
        }

        //номер num должени быть > 0
       while (num==0){
            System.out.print("Введите число:");
            num = scanner.nextInt();
        }


        while (num != i){
            System.out.println(str);
            i++;
        }

    }
}

class Age{
    void age(){
        String name1=null;
        int age=0, ADULT=18, TWENTY=20;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите имя:");
        try {
            name1 = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Укажите возраст:");
        try {
            age = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (age < ADULT) {System.out.println("Подрасти еще");
        }else{
         if (age > TWENTY ) System.out.println("И 18-ти достаточно");
        }
    }
}


class EqualsString{
    void equalsString(){

        String name1=null, name2=null;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите первое имя:");
        try {
            name1 = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Укажите второе имя:");
        try {
            name2 =bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //name1.toUpperCase()
        if ( name1.toUpperCase().trim().equals(name2.toUpperCase().trim())) {
           System.out.println("Имена идентичны");
        }else{
            if ( name1.trim().length() == name2.trim().length() )
                System.out.println("Длины имен равны");
        }
    }
}

class SortNumber{

    void sortArray(){
        Scanner inputVal = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int val1 = inputVal.nextInt();
        System.out.print("Введите второе чсло: ");
        int val2 = inputVal.nextInt();
        System.out.print("Введите третье чсло: ");
        int val3 = inputVal.nextInt();

        int[] array = {val1,  val2, val3};
        Arrays.sort(array);
        System.out.println("результат сортировки:"+ Arrays.toString(array));

    }


}

class Value{

    void inputValue(){
        Scanner inputVal = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int val1 = inputVal.nextInt();

        System.out.print("Введите второе чсло: ");
        int val2 = inputVal.nextInt();
        //minVal (val1,val2);
        System.out.println("Вы ввели "+val1 + " и "+ val2+" минимальное из них= "+minVal (val1,val2));
    }
    //для ввода 4х числе
    void inputFourNumber(){
        Scanner inputVal = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int val1 = inputVal.nextInt();

        System.out.print("Введите второе чсло: ");
        int val2 = inputVal.nextInt();

        System.out.print("Введите третье чсло: ");
        int val3 = inputVal.nextInt();

        System.out.print("Введите четвёртое чсло: ");
        int val4 = inputVal.nextInt();

        System.out.println("Вы ввели первое число="+val1
                + " второе число= "+ val2
                + " третье число= "+ val3
                + " четвёртое число= "+ val4
                + " максимальное из них= "+ maxOfFour(val1, val2, val3, val4) );
    }



    //минимум из 2х числех (тип данных int)
    int minVal(int a, int b) {
        if (a == b) return a;
        return (a < b) ? a : b;
    }

    //максимум из 2х числех (тип данных int)
    int maxVal(int a, int b) {
        if (a == b) return a;
        return (a > b) ? a : b;
    }

    //минимум из 4
    int minOfFour (int a, int b, int c, int d){
        return (minVal(a, b) < minVal(c, d) ) ? minVal(a, b) : minVal(c, d);
    }
    //максимум из 4 чисел
    int maxOfFour (int a, int b, int c, int d){
        return (maxVal(a, b) > maxVal(c, d) ) ? maxVal(a, b) : maxVal(c, d);
    }
}
