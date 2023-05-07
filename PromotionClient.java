// Создание класса PromotionClient, наследника абстрактного класса Actor
public class PromotionClient extends Actor{
    public String PromotionName;
    public static int ClientPromotionNimber;
    // Конструктор класса PromotionClient
    public PromotionClient(String name,String PromotionName, int ClientPromotionNimber){
        super(name);
        this.PromotionName = PromotionName;
        this.ClientPromotionNimber = ClientPromotionNimber;
    }
    // Метод для вызова имени экземпляра
    @Override
    public String getName() {
        return super.name;
    }
    // Получение данных экземпляра класса
    @Override
    public Actor getActor() {
        return this;
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







}