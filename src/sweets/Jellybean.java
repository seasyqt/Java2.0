package sweets;

public class Jellybean  extends Sweets{ //наследование у класса Sweets
    private int sizeMillimeter;

    public Jellybean(String name, double weight, int price, int sizeMillimeter) { //конструктор для мармеладок
        super(name, weight, price);
        this.sizeMillimeter = sizeMillimeter; //устанавливаем размер 1 марметадки
    }
    @Override //переопределение метода
    public String toString(){
        return "Jellybean - " + super.toString() + "\tРазмер: " + sizeMillimeter ;
    }
}
