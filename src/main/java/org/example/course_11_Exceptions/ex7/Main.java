package org.example.course_11_Exceptions.ex7;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        try {
            main.getFactorial("Felix");
        } catch (Nur4ikException e) {
            throw new RuntimeException(e);
        }

    }



    public int getFactorial(String name) throws Nur4ikException {

        if (!name.equals("Nur4ik"))
            throw new Nur4ikException("You are working with Nur4ik", name);
        else {
            System.out.println("Nur4ik is good ");
        }
        return 0;
    }

    class FactorialException extends Exception {

        private int number;

        public int getNumber() {
            return number;
        }

        public FactorialException(String message, int num) {

            super(message);
            number = num;
        }
    }

    class Nur4ikException extends Exception {

    String name;

        public Nur4ikException(String message,String name) {
            super(message);
            this.name = name;
        }
    }
}
