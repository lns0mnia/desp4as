import java.util.List;
import java.util.ArrayList;
public class NewPostEventBus {

    private List<NewPostObserver> observers = new ArrayList<>();

    public void registerObserver(NewPostObserver observer) {
        observers.add(observer);
    }

    public void unregisterObserver(NewPostObserver observer) {
        observers.remove(observer);
    }

    public void publishEvent(NewPostEvent event) {
        for (NewPostObserver observer : observers) {
            observer.onNewPost(event.getUser(), event.getPostContent());
        }
    }
}