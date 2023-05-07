package Products;

public class Mineral_Water extends product{

    private int volume;

    public Mineral_Water(String name, double price, int volume){

        super(name, price);
        this.volume = volume;

    }

    public int getVolume(){
        
        return volume;

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
