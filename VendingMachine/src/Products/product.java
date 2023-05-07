package Products;


// Базовый класс продукта
public class product{

    // Наименование продукта
    private String name;
    // Цена продукта
    private Double price;

    /** Конструктор продукта 2 параметра 
     * @param name наименование продукта
     * @param price цена продукта
     */  
    public product(String name, Double price){
        this(name);
        this.price = price;
    }

    /** Конструктор имени продукта 
     * @param name наименование продукта
     */  
    public product(String name){
        this.name = name;
    }
    
    // Получаем наименование продукта
    public String getName(){
        return name;
    }

    // Получаем цену продукта
    public Double getPrice(){
        return price;
    }

    /** Конструктор цены продукта
     * @param price новая цена продукта
     */ 
    public void setPrice(Double value){
        if(value <= 0){
            throw new IllegalStateException(String.format("Цена указана не корректно", value));
        }
        this.price = value;
    }

    // Переопределение вывода данных
    @Override
    public String toString(){
        return "Product {" + "name= '" + name + '\''+ ", cost= " + price + '}';
    }
}
