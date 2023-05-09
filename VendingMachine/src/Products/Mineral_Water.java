package Products;

public class Mineral_Water extends product{

    /**
     * объём продукта
     */
    private int volume;

    /**
     * конструктор продукта
     * @param name наименование
     * @param price цена
     * @param volume объём
     */
    public Mineral_Water(String name, double price, int volume){

        super(name, price);
        this.volume = volume;

    }

    /**
     * получение объёма
     */
    public int getVolume(){
        
        return volume;

    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // Переопределение вывода данных
    @Override
    public String toString(){
      return "Product {" + 
      "name= '" + super.getName() + '\''+ 
      ", cost= " + super.getPrice() + 
      ", volume= " + volume +
      '}';
    }
}

