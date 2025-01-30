package org.example.course_2_Objects_Constructors.ex1;

public class ex1 {
    public static void main(String[] args) {

        /**
         * Для создания объекта Person используется выражение new Person().
         * Оператор new выделяет память для объекта Person.
         * И затем вызывается конструктор по умолчанию, который не принимает никаких параметров.
         * В итоге после выполнения данного выражения в памяти будет выделен участок,
         * где будут храниться все данные объекта Person.
         * А переменная tom получит ссылку на созданный объект.
         */
        Person tom = new Person();
        tom.displayInfo();

        // изменяем имя и возраст
        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
    }
}


class Person{

    String name;    // имя
    int age;        // возраст
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

