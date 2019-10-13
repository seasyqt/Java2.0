public class RandomMassive {
    public static void main(String[] args) {
        int [] randomMassive = new int[20]; // объявление переменной массива c 20 ячейками
        //цикл с рандомным заполнением ячеек массива

        for (int numberElementsMassive = 0;numberElementsMassive < randomMassive.length; numberElementsMassive++)
        {
            randomMassive[numberElementsMassive] = (int)Math.round(-10+ (Math.random() * 20)); // пристоение элементу массива случайное число
            System.out.print(randomMassive[numberElementsMassive] + " "); //вывод всех рандомных чисел
        }
        int max = randomMassive[0] , min = randomMassive[0]; // объявление макс и мин
int numberMax = 0,numberMin = 0;

        for(int numberElementsMassive = 0;numberElementsMassive < randomMassive.length;numberElementsMassive++)
        {
            if(randomMassive[numberElementsMassive] > max  ) // сравнение всех чисел в массиве как самое макс
            {
                max = randomMassive[numberElementsMassive]; // и присваивает в переменную это число
                numberMax = numberElementsMassive;
            }
            if (randomMassive[numberElementsMassive] < min) //тоже самое ,что и выше только с мин.числом
            {
                min = randomMassive[numberElementsMassive];
                numberMin = numberElementsMassive;
            }
        }
        System.out.println("\nМаксимальное число " + max); //вывод макс числа
        System.out.println("Минимальное число " + min);  //вывод мин числа

        //замена значения в массиве
        randomMassive[numberMax] = min;
        randomMassive[numberMin] = max;
        System.out.println("Теперь максимальное число такое:" + randomMassive[numberMax]); // вывод макс после изменения
        System.out.println("Теперь минимальное число такое:" + randomMassive[numberMin]); // вывод мин после изменения

    }
}
