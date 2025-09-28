public class NotificationService {
   private INotification notification;
   private IObservable observable;
    
   // Using Bill-Pugh Singleton pattern and Getters and Setters to set INotification and IObservable
   private NotificationService() {
    this.notification = null;
    this.observable = null;
   }

    private static class Singleton{
        private static final NotificationService instance = new NotificationService();
    }
    public void setNotification(INotification notification){
        this.notification = notification;
    }
    public void setObservable(IObservable observable){
        this.observable = observable;
    }
    public static NotificationService getInstance(){
        return Singleton.instance;
    }

   public void sendNotification() {
    String notificationContent = notification.getContent();
    System.out.println("New Notification received: " + notificationContent);
    this.observable.notifyObservers();
   }
}
