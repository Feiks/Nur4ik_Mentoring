package org.example.course_1_Primitive_vs_Objects;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                int num1 = scanner.nextInt();
                System.out.print("Введите второе число: ");
                int num2 = scanner.nextInt();

                int sum = num1 + num2;
                double average = sum / 2.0;

                System.out.println("Сумма чисел: " + sum);
                System.out.println("Среднее: " + average);
    }
}
