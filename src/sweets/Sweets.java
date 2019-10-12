package sweets;

public abstract class Sweets { // абстрактный класс Сладостей
    private String name; //название сладости
    private double weight; //вес сладости
    private int price; //цена сладости

    public Sweets() { //конструктор по умолчанию
    }

    public Sweets(String name, double weight, int price) { //конструктор с параметрами
        this.name = name; //устанавливаем название сладости
        this.weight = weight; //устанавливаем вес сладости
        this.price = price; //устанавливаем цену сладости
    }

    /*
    Методы
     */

    public String getName() { //возвращаем название сладости
        return name;
    }

    public void setName(String name) { //задаем названием сладости
        this.name = name;
    }

    public double getWeight() { //возвращаем вес сладости
        return weight;
    }

    public void setWeight(double weight) { //задаем вес сладости
        this.weight = weight;
    }

    public int getPrice() { //возвращаем цену сладости
        return price;
    }

    public void setPrice(int price) { //задаем цену сладости
        this.price = price;
    }
    @Override
    public String toString(){ // выводим всю информацию о сладости
        return "Название: " + name + "\tВес: " + weight + "\tЦена: " + price ;
    }
}
