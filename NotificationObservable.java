import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable{
    protected final List<IObserver> listOfObservers;
    private final INotification notification;

    NotificationObservable(INotification notification) {
        this.notification = notification;
        this.listOfObservers = new ArrayList<>();
    }

    public String getNotification(){
        return this.notification.getContent();
    }
    @Override
    public void addObserver(IObserver observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver() {
        if(listOfObservers.isEmpty()) {
            System.out.println("List is already empty! Cannot delete anyone");
            return;
        }
        
        listOfObservers.removeLast(); // Removing the last Observers for now
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer: listOfObservers) {
            observer.update(getNotification());
        }
    }
}
