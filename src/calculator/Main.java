package calculator;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
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
        }catch (InputMismatchException e ) {
            System.out.println("Некорректный ввод числа");
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("Ссылка для объекта равна null");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Ошибка выполнения , деление на ноль");
            e.printStackTrace();
        }
    }

}
