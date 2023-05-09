package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName(); 
    @Override
    public void acceptReturn() {
        System.out.println("Order has been returned");
    }

    @Override
    public void cashReturn() {
        System.out.println("Order has been refunded");
    }

    @Override
    public void DefoltReturn() {
        System.out.println("Order return was denied");
    }

    @Override
    public void returnOrder(iActorBehaviour actor) {
        if (actor.isTakeOrder()) {
            actor.setTakeOrder(false);
            acceptReturn();
            cashReturn();
        } else {
            DefoltReturn();
        }
    }

}