package Interfaces;

import Classes.Actor;

public interface iReturnOrder {
    void requestReturnOrder(Actor order);
    void confirmReturnOrder(Actor order);
}