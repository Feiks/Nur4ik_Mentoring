package org.example.course_11_Exceptions.ex6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start sytem");
         getFactorial(6);
        Person nur4ik = new Person(12,"Nur4ik");
        Person felix = null;

        System.out.println(nur4ik.getAge()); //12
        System.out.println(nur4ik.getName()); //Nur4ik

        System.out.println("End system");


    }

    public static void getFactorial(int num) {
        try {
            int array[] = new int[6];
            array[0] = 0;
            array[1] = 0;
            array[2] = 0;
            array[3] = 0;
            array[4] = 0;
            array[5] = 0;
                array[6] = 0;
        }
        catch (Exception e){
           e.printStackTrace();
            System.out.println(e.getMessage());

        }

        return ;
    }
}
class Person{
    int age ;
    String name ;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}