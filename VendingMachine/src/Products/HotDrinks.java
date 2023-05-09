package Products;

public class HotDrinks extends product {

    /**
     * Температура напитка
     */
    private int temperature;

    public HotDrinks (String name, double price, int temperature){

        super(name, price);
        this.temperature = temperature;
    }

    /**
     * Получаем температуру
     */
    public int getTemperature(){

        return temperature;

    }

    /**
     * Устанавливаем температуру
     */
    public void setTemperature(int temperature){

        this.temperature = temperature;

    }
    // Переопределение вывода данных
    @Override
    public String toString(){
    return "Product {" + 
     "name= '" + super.getName() + '\''+ 
     ", cost= " + super.getPrice() + 
    ", temperature= " + temperature +
     '}';
    }
}
