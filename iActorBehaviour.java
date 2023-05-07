// Создание интерфейса iActorBehaviour, который заключает в себе действия клиента "Сделать заказ", "Взять заказ"
public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean pickUpOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}