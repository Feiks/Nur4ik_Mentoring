package org.example.course_2_Objects_Constructors.ex4;

public class ex4{

    public static void main(String[] args) {

        Person kate = new Person("Kate", 30);
        System.out.println(kate.getAge());      // 30
        kate.setAge(33);
        System.out.println(kate.getAge());      // 33
        kate.setAge(123450);
        System.out.println(kate.getAge());      // 33
    }
}
class Person{

    private String name;
    private int age = 1;

    public Person(String name, int age){

        setName(name);
        setAge(age);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        if(age > 0 && age < 110)
            this.age = age;
    }
}

/**
 * И затем вместо непосредственной работы с полями name и age в классе Person мы будем работать с методами,
 * которые устанавливают и возвращают значения этих полей.
 * Методы setName, setAge и наподобие еще называют мьютейтерами (mutator),
 * так как они изменяют значения поля.
 * А методы getName, getAge и наподобие называют аксессерами (accessor),
 * так как с их помощью мы получаем значение поля.
 */