import java.util.ArrayList;
import java.util.List;
    // Создание класса Market и подключение к интерфейсам iMarketBehaviour,iQueueBehaviour,iReturnOrder
public class Market implements iMarketBehaviour,iQueueBehaviour,iReturnOrder {
    //private List<Actor> queue;
    private List<iActorBehaviour> queue;
    // Конструктор класса Market
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }
    // Клиент зашёл в магазин и добавлен в очередь
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }
    // Добавление клиента в очередь
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }
    // Клиент покинул магазин и удалён из очереди
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }
    // Обновление данных по приёму заказа, выдаче и удалении из очереди.
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
    // Метод по выдаче клиенту заказа
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)
        {
            if(actor.isMakeOrder())
            {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
    // Удаление клиента из очереди и его выход из магазина
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>();
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder())
        {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors);
    }


    // Метод по приёму заказа от клиента
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue)
        {
            if(!actor.isMakeOrder())
            {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
    
    // Метод возврата товара в магазин, выход из очереди и выхода из магазина
    @Override
    public void ReturnOrder() {
        List<Actor> releaseActors = new ArrayList<>();
        for(iActorBehaviour actor:queue)
        {
            if(actor.isTakeOrder())
            {
                actor.setTakeOrder(false);
                System.out.println(actor.getActor().getName()+" вернул товар в магазин ");

                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
            }
        }
    releaseFromMarket(releaseActors);
    }
}