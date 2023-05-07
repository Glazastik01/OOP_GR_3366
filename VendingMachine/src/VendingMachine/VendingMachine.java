package VendingMachine;

import Products.product;
import java.util.ArrayList;
import java.util.List;


public class VendingMachine {
    
    private int volume;
    private List<product> Products;
    private List<String> worklog;

    public VendingMachine(int volume){
        
        this.volume = volume;
        Products = new ArrayList<product>();
        worklog = new ArrayList<String>();
    }

    public void addProduct(product Prod){
        
        Products.add(Prod);
    }
    
    public void addSales(String line){

        worklog.add(line);
    }

    public product getProdByName(String name){
        
        for(product prod: Products){
            
            if(prod.getName().contains(name)){
                
                return prod;

            }        
        }
        return null; 
    }

    public List<product> getAllProducts(){

        return Products;

    }
}
