public class RandomMassive {
    public static void main(String[] args) {
        int [] randomMassive = new int[20]; // объявление переменной массива c 20 ячейками
        //цикл с рандомным заполнением ячеек массива

        for (int numberElementsMassive = 0;numberElementsMassive < randomMassive.length; numberElementsMassive++)
        {
            randomMassive[numberElementsMassive] = (int)Math.round(-10+ (Math.random() * 20)); // пристоение элементу массива случайное число
            System.out.print(randomMassive[numberElementsMassive] + " "); //вывод всех рандомных чисел
        }
int numberElementMinPositive = 0,numberElementMaxNegative = 0;
        int temp ;

        for(int numberElementsMassive = 0;numberElementsMassive < randomMassive.length;numberElementsMassive++)
        {
            if (randomMassive[numberElementsMassive] >= 0) //вычисляем мин. положительный
            {

                if (randomMassive[numberElementsMassive] < randomMassive[numberElementMinPositive]) //текущее число массива меньше ,чем мин.положительнео
                {
                    numberElementMinPositive = numberElementsMassive; //текущее число массива , становиться мин.полож.
                }
                else if (randomMassive[numberElementMinPositive] < 0) // если мин.полож. - отрицательное
                {
                    numberElementMinPositive = numberElementsMassive; //то мин.полож. - текущий элемент массива
                }

            }
            else if (randomMassive[numberElementsMassive] < 0) //вычисляем макс. отрицательное число
            {
                if (randomMassive[numberElementsMassive] > randomMassive[numberElementMaxNegative]) //если элем.массива больше чем макс.отрицательное
                {
                    numberElementMaxNegative = numberElementsMassive;// то номер макс.отрицательного числа - текущий
                }
                else if (randomMassive[numberElementMaxNegative] >= 0) // если макс.отрицательный  - положительный
                {
                    numberElementMaxNegative = numberElementsMassive; //то макс.отрицательное - текущий элемент массива
                }
            }

        }
        System.out.println("\nМинимальное положительное число " + randomMassive[numberElementMinPositive]); //вывод мин. полож.
        System.out.println("Максимальное отрицательное число " + randomMassive[numberElementMaxNegative]);  //вывод макс. отрицательного

        //замена значения в массиве
        temp = randomMassive[numberElementMinPositive];
        randomMassive[numberElementMinPositive] = randomMassive[numberElementMaxNegative];
        randomMassive[numberElementMaxNegative] = temp;
        System.out.println("Теперь минимальное положительное число такое:" + randomMassive[numberElementMinPositive]); // вывод мин.+ после изменения
        System.out.println("Теперь максимальное отрицательное число такое:" + randomMassive[numberElementMaxNegative]); // вывод макс.- после изменения

    }
}
