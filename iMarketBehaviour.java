import java.util.List;
// Создание интерфейса iMarketBehaviour, который заключает в себе действия клиента "Зайти в магазин", "Покинуть магазин" и обновление данных
public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releaseFromMarket(List<Actor> actors);
    void update();    
}