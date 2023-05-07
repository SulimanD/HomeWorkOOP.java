// Создание класса OrdinaryClient, наследника абстрактного класса Actor
public class OrdinaryClient extends Actor {
    // Конструктор класса OrdinaryClient
    public OrdinaryClient(String name)
    {
        super(name);
    }
    // Метод для вызова имени экземпляра
    @Override
    public String getName() {        
        return super.name;
    }
    // Метод для вызова boolean переменной экземпляра (сделан ли заказ)
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    // Метод для вызова boolean переменной экземпляра (взят ли заказ)
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    // Метод, который устанавливает значение переменной isMakeOrder, равное входящей переменной makeOrder
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }
    // Метод, который устанавливает значение boolean переменной экземпляра (взят ли заказ) по входной boolean переменной
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }
    // Получение данных экземпляра класса
    @Override
    public Actor getActor() {
        return this;
    }

    
}
