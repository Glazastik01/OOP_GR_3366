package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    void returnOrder(iActorBehaviour actor);
    void acceptReturn();
    void DefoltReturn();
    void cashReturn();
}