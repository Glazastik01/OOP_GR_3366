package Classes;

public class PromoClient extends Actor{

    private String promoName;
    private static int clientNumberInPromo;


    public PromoClient(String name, String promoName) {
        super(name);
        this.promoName = promoName;
        clientNumberInPromo++;
    }

    @Override
    public String getName() {
        this.promoName = promoName;
        return promoName;
    }

    public String getPromoName() {
        return promoName;
    }

    public static int getClientNumberInPromo() {
        return clientNumberInPromo;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
        
    }

    
}
