// Создание интерфейса iQueueBehaviour, который заключает в себе действия с очередью клиентов: добавлен в очередь, удалён из очереди, взять заказ, отдать заказ
public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder();
    void giveOrder();
}