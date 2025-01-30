package org.example.course_2_Objects_Constructors.ex2;

public class Program {
    public static void main(String[] args) {

        /**
         * Если необходимо, чтобы при создании объекта производилась какая-то логика,
         *  например, чтобы поля класса получали какие-то определенные значения,
         *  то можно определить в классе свои конструкторы. Например:
         */
        Person bob = new Person();      // вызов первого конструктора без параметров
        bob.displayInfo();

        Person tom = new Person("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();

        Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}

class Person {

    String name;    // имя
    int age;        // возраст

    Person() {
        name = "Undefined";
        age = 18;
    }

    Person(String n) {
        name = n;
        age = 18;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}