package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator first = new Calculator();
        System.out.println("Вы запустили калькулятор");
        System.out.println("Введите первое число : ");
    first.setFirstNumber(scanner.nextDouble());
        System.out.println("Введите второе число : ");
    first.setSecondNumber(scanner.nextDouble());
        System.out.println("Введите тип операции над числами из \"+,-,/,*\"");
    first.setOperation(scanner.next().charAt(0));
        first.result();
        System.out.println("Результат : " + first.getResult());


    }

}
