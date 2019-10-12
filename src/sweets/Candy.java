package sweets;

public class Candy extends Sweets { //наследование у класса Sweets
    private Colour colour; //цвет конфеты

    public Candy(String name, double weight, int price, Colour colour) { //конструктор для конфет
        super(name, weight, price); //
        this.colour = colour; //устанавливаем цвет конфет
    }
    @Override //переопределение метода
    public String toString(){
        return "Candy - " + super.toString() + "\tЦвет: " + colour;
    }
}
