// Создание абстрактного класса Actor и подключение к интерфейсу iActorBehaviour
public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
    // Конструктор класса Actor
    public Actor(String name) {
        this.name = name;
    }

    // Создание абстрактного метода, которое будет вызывать имя экземпляра
    public abstract String getName(); 

}