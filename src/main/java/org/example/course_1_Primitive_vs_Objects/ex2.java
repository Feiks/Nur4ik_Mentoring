package org.example.course_1_Primitive_vs_Objects;

public class ex2 {
    public static void main(String[] args) {
        /**
         * Все целочисленные литералы, например, числа 10, 4, -5, воспринимаются как значения типа int,
         * однако мы можем присваивать целочисленные литералы другим целочисленным типам: byte, long, short.
         * В этом случае Java автоматически осуществляет соответствующие преобразования:
         */
        byte a = 1;
        short b = 2;
        long c = 2121;
//        long num = 2147483649L; //compilation error
        long num_ = 2147483649L; //no error


        /**
         * При присвоении переменной типа float дробного литерала с плавающей точкой, например, 3.1, 4.5 и т.д.,
         * Java автоматически рассматривает этот литерал как значение типа double. И чтобы указать,
         * что данное значение должно рассматриваться как float, нам надо использовать суффикс f:
         */

        float fl = 30.6F;
        double db = 30.6;

        /**Символьные переменные не стоит путать со строковыми, 'a' не идентично "a".
         *
         * Строковые переменные представляют объект String,
         * который в отличие от char или int не является примитивным типом в Java:
          */
        String hello = "Hello..."; //object
        System.out.println(hello);
        char greeting= 'h';

        /**
         * Кроме собственно символов, которые представляют буквы, цифры, знаки препинания, прочие символы,
         * есть специальные наборы символов, которые называют управляющими последовательностями.
         * Например, самая популярная последовательность - "\n".
         * Она выполняет перенос на следующую строку.
         */
        String text = "Hello \nworld";
        System.out.println(text);


        /**
         * Начиная с версии 15 Java поддерживает тестовые блоки (text blocks) - многострочный текст,
         * облеченный в тройные кавычки. Рассмотрим, в чем их практическая польза.
         * Например, выведем большой многострочный текст:
         */

        String text1 = "Вот мысль, которой весь я предан,\n"+
                "Итог всего, что ум скопил.\n"+
                "Лишь тот, кем бой за жизнь изведан,\n"+
                "Жизнь и свободу заслужил.";
        System.out.println(text1);


        /**
         * Текстовые блоки, которые появились в JDK15, позволяют упростить написание многострочного текста:
         */

        String text2 = """
                Вот мысль, которой весь я предан,
                fdskflsdlfj,
                fdskfldskfl,
                Итог всего, что ум скопил.
                Лишь тот, кем бой за жизнь изведан,
                Жизнь и свободу заслужил.
                """;
        System.out.println(text2);
    }
}
