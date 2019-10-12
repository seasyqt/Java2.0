package sweets;

public class Lollipop extends Sweets { //наследование у класса Sweets
    private boolean withTopping; //Имеет ли начинку сладость

    public Lollipop(String name, double weight, int price, boolean withTopping) { //конструктор для леденцов
        super(name, weight, price);
        this.withTopping = withTopping;
    }

    @Override //переопределение метода
    public String toString(){
        return "Lollopop - " + super.toString() + "\tС начинкой: " + withTopping ;
    }
}
