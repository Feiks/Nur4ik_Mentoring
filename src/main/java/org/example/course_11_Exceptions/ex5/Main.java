package org.example.course_11_Exceptions.ex5;

public class Main {
    public static void main(String[] args) {

        try {
            int result = getFactorial(5);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static int getFactorial(int num) throws Exception{

        if(num<1) throw new Exception("The number is less than 1");
        int result=1;
        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}

