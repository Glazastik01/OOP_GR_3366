import Products.Mineral_Water;
import Products.product;
import VendingMachine.VendingMachine;


public class App {
    public static void main(String[] args) throws Exception {

        product item1 = new product("Cola", 79.9);
        item1.setPrice(89.9);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new product("Milk", 79.9));
        itemMachine.addProduct(new product("Chips", 159.9));
        itemMachine.addProduct(new product("Mineral_Water", 32.9));
        itemMachine.addProduct(new product("Marmalade Haribo", 54.9));
        itemMachine.addProduct(new Mineral_Water("LimonFresh", 67.9, 300));
        itemMachine.addProduct(new Mineral_Water("IceTea", 59.9, 250));

        for(product prod: itemMachine.getAllProducts()){
            
            System.out.println(prod.toString());    
        }
    }
}
