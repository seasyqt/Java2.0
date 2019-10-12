package sweets;

public class GiftBox {

    public static void main(String[] args) {
        Candy goldenChicken = new Candy("Золотой петушок",2.0,10,Colour.BLACK); //создаем объект типа Candy
        Jellybean jellybean = new Jellybean("Мармелад",4.0,30,10); //создаем объект типа Jellybean
        Lollipop chupaChups  = new Lollipop("Чупа чупс",10.0,15,true); //создаем объект типа Lollipop
        Sweets [] box = {goldenChicken,jellybean,chupaChups}; //создаем коробку сладостей и передаем созданные сладости в
int priceAllSweetsInBox = 0; // цена всех сладостей в коробке
double weightAllSweetsInBox = 0; // вес всех сладостей в коробке
        for (Sweets sweetInBox:box) {
            System.out.println(sweetInBox.toString()); //выводим все сладости в коробке
            priceAllSweetsInBox += sweetInBox.getPrice(); //суммируем цены всех сладостей в коробке
            weightAllSweetsInBox += sweetInBox.getWeight(); //суммируем вес всех сладостей в коробке
        }
        //выводим в консоль вес и цену всех сладостей в коробке
        System.out.println("Вес всех сладостей : " + weightAllSweetsInBox + "\nЦена всех сладостей : " + priceAllSweetsInBox);
    }
}
