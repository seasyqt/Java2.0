import java.util.Scanner; //импорт сканера из пакета

/**
 * @author kirilltokarev
 *@version 2.0
 * @since 22.09.2019
 */

public class Calculator {


    private static Scanner scan = new Scanner(System.in); //Объявление сканера

    public static void main(String[] args) {
        twoOperations();

    }
    private static void twoOperations(){  // приватный метод короторый ничего не возращает
        System.out.println("Выберете функцию ,цифра 1 - калькулятор , 2 - поиск максимального слова  ");
        int getNumberIsOperation = scan.nextInt(); //заполнение переменной first с консоли
        if (getNumberIsOperation == 1)
        {
            double firstNumber = getNumber(true); //переменная а с дробным типом выполняет метод ввода 1 числа с консоли
            char typeOperation = view(); //переменная oper с символьным типом выполняет метод view
            double secondNumber = getNumber(false); //вызов метода и присвоение переменной
            double result = calc(firstNumber, secondNumber, typeOperation); // переменная результат выполняет метод calc с входными значениями
            System.out.printf("Результат : %.4f", result); //вывод результата с округлением до 4 знаков после запято
        }
            else if(getNumberIsOperation == 2) maxElementOperation(); //выполняется метод Опер2

           else {    System.out.println("Вы ввели не правильный вариант!");
                twoOperations();  //рекурсия,при не правильном вводе переменной first
        }

    }


    private static double getNumber(boolean isFirstNumber) {
       if (isFirstNumber){System.out.println("Введите первое дробное число : ");}
       else {System.out.println("Введите следующее дробное число : ");}
        double setNumberConsole; //переменная setNumberConsole с дробным типом
        if (scan.hasNextDouble()) { // проверка что вводим дробное число
            setNumberConsole = scan.nextDouble();//ввод переменной setNumberConsole с консоли

        } else { // иначе выполняется эта блок
            System.out.println("Вы ошиблись");
            scan.next();
            setNumberConsole = getNumber(isFirstNumber); //рекурсия к началу метода
        }
        return setNumberConsole;
    }
    private static char view(){
        System.out.println("Введите операцию");
        char oper; //объявление переменной с типом char
        if(scan.hasNext()){ //проверка на ввод слова
            oper = scan.next().charAt(0);//ввод переменной с консоли и считываем 1 символ строки
        }
        else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scan.next();
            oper = view();//рекурсия метода

        }
        return oper;

    }

    private static double calc(double firstNumber, double secondNumber, char operationMath)//метод подсчета с входными значениями переменных
    {
       if (operationMath =='-') return firstNumber - secondNumber; //если символ переменной operation равен минус,то выполняется вычитание
       else if (operationMath == '+') return firstNumber + secondNumber; //если символ переменной operation равен плюс,то выполняется сложение
       else if (operationMath == '*') return firstNumber * secondNumber; //если символ переменной operation равен умножение,то выполняется умножение
       else if (operationMath == '/') return firstNumber / secondNumber; //если символ переменной operation равен деление,то выполняется деление
       else { //иначе во всех остальных случаях
           System.out.println("Операция не распознана. Повторите ввод.");
           return calc(firstNumber, secondNumber, view()); //повторяем ввод тип операции
       }

    }
    private static void maxElementOperation(){
        System.out.println("Введите какое кол-во слов хотите сравнить : ");
        int sizeMassive = scan.nextInt(); // записываем кол-во слов с консоли в переменную
        String[] masWords = new String[sizeMassive];//объявление строкового массива с размером введенном с консоли
        for (int countWords = 0; countWords < masWords.length; countWords++) //цикл заполнения массива словами
        {
            System.out.printf("Введите %d слово из %d : " ,countWords+1,masWords.length);
            masWords[countWords] = scan.next();    //записываем слова в массив для кождого элемента
        }

        int lengthIsMaxWord = masWords[0].length();   //Длина максимального слова
        int numberMaximumWord = 0;                    //Номер максимального слова в массиве
        for (int countWords = 0; countWords < masWords.length; countWords++)  //цикл подсчета символов в каждом слове
        {
            if (masWords[countWords].length() > lengthIsMaxWord)  //Если длина слова под номером countWords больше ,чем lengthIsMaxWord то выполняем
            {
                lengthIsMaxWord = masWords[countWords].length();      // Заменяем макс. длину слова
                numberMaximumWord = countWords;                       // Номер длинного слова в массиве
            }
        }
        System.out.println("Самое большое слово в массиве это " + masWords[numberMaximumWord]+ " и оно состоит из " + lengthIsMaxWord + " букв");
    }

}