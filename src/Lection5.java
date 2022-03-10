public class Lection5 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.getName();
        System.out.println("1 name ="+ dog.getName() );

        dog.getAge();
        System.out.println("1 age ="+ dog.getAge() );

        dog.steName("Rex");
        dog.setAge(5);

        System.out.println("1 name ="+ dog.getName() );
        System.out.println("1 age ="+ dog.getAge() );

        Friend f = new Friend();
        f.initialize("Petr");


 /*
4. Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо
 */
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();


    cat1.age=2; cat1.name="Vaska"; cat1.weight=7; cat1.strength=11;
    cat2.age=1; cat2.name="Murka"; cat2.weight=3; cat2.strength=4;
    cat3.age=5; cat3.name="Pushistic"; cat3.weight=12; cat3.strength=10;

   //cat1.age=5; cat1.name="Vaska"; cat1.weight=4; cat1.strength=0;
   //cat2.age=4; cat2.name="Murka"; cat2.weight=4; cat2.strength=1;
/*
5. Провести три боя попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

        System.out.println( cat1.fight(cat2) );
        System.out.println( cat2.fight(cat3));
        System.out.println( cat3.fight(cat1));




    }

}


/*
1. Создать класс Cat
Создать класс Cat.
У кота должно быть имя (name, String),
возраст (age, int),
вес (weight, int),
сила (strength, int).
 */
class Cat{
    String name;
    int age;
    int weight;
    int strength;
/*
2. Реализовать метод fight
ps
т.к. не сказано что делать в случае ничьей присвоим побкду нашему котику :)
 */
    boolean fight(Cat cat ){
        int myCatPoint=0, strangerPoin=0;
        /*
        Возраст с 3 до 10 считаем выигрышным
        Вес от 3х до 5 -считаем выигрышным
        Сила чем больше тем лучше
        */

        //System.out.println("стартовые очки "+myCatPoint+" "+strangerPoin);

        //сравним силу strength
       if (this.strength > cat.strength) {myCatPoint++;}
       if (this.strength < cat.strength) {strangerPoin++;}
      // System.out.println(myCatPoint+" "+strangerPoin);

       //объект получит +1 если он в форме
       if (this.weight >= 3 && this.weight <= 5){myCatPoint++;}
       if (cat.weight >= 3 && cat.weight <= 5){strangerPoin++;}
        //System.out.println(myCatPoint+" "+strangerPoin);

       //объект получит +1 если он в оптимальном возрасте
        if(this.age >= 3 && this.age <= 10){myCatPoint++;}
        if(cat.age >= 3 && cat.age <= 10){strangerPoin++;}
       // System.out.println(myCatPoint+" "+strangerPoin);

        if (myCatPoint >= strangerPoin) {
           // System.out.println(myCatPoint+" "+strangerPoin);
            return true;
        }else{
           // System.out.println(myCatPoint+" "+strangerPoin);
            return  false;}
    }
}

/*
3. Геттеры и сеттеры для класса Dog
Создать class Dog.
У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
 */
class Dog{
    String name;
    int age;

    String getName(){return this.name;}
    int getAge(){return this.age;};

    void steName(String name){ this.name=name;}
    void setAge(int age){this.age=age;}

    }

/*
1. Создать класс Friend

Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
 */

class Friend{
    private String name, sex;
    private int age;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}

/*
2. Создать класс Cat

Создать класс Cat (кот) с пятью инициализаторами:
- Имя
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора – сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null). То же касается адреса: null.
 */
class Cat2{
    private String name, color, address;
    private int weight=1, age=1;

    //Имя
   public void initialize(String name){this.name=name;}

    //Имя, вес, возраст
    public  void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    //Имя, возраст (вес стандартный)
   public void initialize(String name, int age){
        this.name = name;
        this.age = age;

    }
//вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
   public void initialize(int weight, String color){
        this.weight=weight;
        this.color = color;

        this.name ="";
        this.address="";
        this.age = age;

    }

    //вес, цвет, адрес (чужой домашний кот)
    public void initialize(int weight, String color, String address){
        this.weight=weight;
        this.color = color;
        this.address = address;

    }

}

/*
3. Создать класс Dog

Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
class Dog2{
    private String name,collor;
    private int height;

    public void initialize(String name){ this.name = name;}
    public void initialize(String name, int height){ this.name = name; this.height = height;}
    public void initialize(String name, int height, String collor){
        this.name = name;
        this.height = height;
        this.collor = collor;

    }

}

/*
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */
class Circle {
    private double centerX, centerY, radius, width;
    private String color;

    public void initialize(double centerX, double centerY, double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(double centerX, double centerY, double radius, double width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public void initialize(double centerX, double centerY, double radius, double width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}

/*
5. Создать класс прямоугольник (Rectangle)

Создать класс прямоугольник (Rectangle).
Его данными будут top, left, width, height
(левая координата, верхняя, ширина и высота).
Создать для него как можно больше методов initialize(…)

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */

class Rectangle{
    private int top=0, left=0, width=0, height=0;

    //аданы 4 параметра: left, top, width, height
    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    //ширина/высота не задана (оба равны 0)
    public void initialize(int left, int top){
        this.left = left;
        this.top = top;
    }

    //высота не задана (равно ширине) создаём квадрат
    public void initialize(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    //создаём копию другого прямоугольника (он и передаётся в параметрах)
    public void initialize(Rectangle rectangle){
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

}

/*
1. Создать класс Friend

Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
 */

class FriendMake{
 private String name, sex;
 private int age;

 public FriendMake(String name){this.name=name;}
 public FriendMake(String name, int age){this.name=name; this.age=age;}
 public FriendMake(String name, int age, String sex) {
    this.name=name;
    this.age=age;
    this.sex=sex;
 }
}

/*
2. Создать класс Cat

Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
 */
class CatMake{
    private String name, color, address;
    private int weight=1, age=1;

    //Имя
    public CatMake(String name){this.name=name;}

    //Имя, вес, возраст
    public  CatMake(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    //Имя, возраст (вес стандартный)
    public CatMake(String name, int age){
        this.name = name;
        this.age = age;

    }
    //вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public CatMake(int weight, String color){
        this.weight=weight;
        this.color = color;

        this.name ="";
        this.address="";
        this.age = age;

    }

    //вес, цвет, адрес (чужой домашний кот)
    public CatMake(int weight, String color, String address){
        this.weight=weight;
        this.color = color;
        this.address = address;

    }

}

/*
3. Создать класс Dog

Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
 */
class DogMake{
    private String name,collor;
    private int height;

    public DogMake(String name){ this.name = name;}
    public DogMake(String name, int height){ this.name = name; this.height = height;}
    public DogMake(String name, int height, String collor){
        this.name = name;
        this.height = height;
        this.collor = collor;

    }

}
/*
4. Создать класс Circle

Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */
class CircleMake {
    private double centerX, centerY, radius, width;
    private String color;

    public CircleMake(double centerX, double centerY, double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public CircleMake(double centerX, double centerY, double radius, double width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public CircleMake(double centerX, double centerY, double radius, double width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

}

/*
5. Создать класс прямоугольник (Rectangle)

Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:

Примеры:
- заданы 4 параметра: left, top, width, height
- ширина/высота не задана (оба равны 0)
- высота не задана (равно ширине) создаём квадрат
- создаём копию другого прямоугольника (он и передаётся в параметрах)
 */
class RectanglMake{
    private int top=0, left=0, width=0, height=0;

    //аданы 4 параметра: left, top, width, height
    public RectanglMake(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    //ширина/высота не задана (оба равны 0)
    public RectanglMake(int left, int top){
        this.left = left;
        this.top = top;
    }

    //высота не задана (равно ширине) создаём квадрат
    public RectanglMake(int left, int top, int width){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    //создаём копию другого прямоугольника (он и передаётся в параметрах)
    public RectanglMake(RectanglMake rectanglMake){
        this.left = rectanglMake.left;
        this.top = rectanglMake.top;
        this.width = rectanglMake.width;
        this.height = rectanglMake.height;
    }

}