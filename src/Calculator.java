import java.util.Scanner; //импорт сканера из пакета

/**
 * @author kirilltokarev
 *@version 1.0
 * @since 21.09.2019
 */

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Введите первое дробное число : ");
        Scanner scan = new Scanner(System.in); // добавление объекта сканер с именем scan

        double a = scan.nextDouble(); //объявление переменной и ввод её с клавиатуры
        System.out.println("Введите второе дробное число : ");
        double b = scan.nextDouble(); // объявление переменной и ввод её с клавиатуры

        System.out.printf ("Равно : %.4f" ,   a + b ); // Сложение вводимых чисел с использованием форматированного принта и округление с помощью "%.4f"
        scan.close(); //закрытие потока сканер
    }

}