public class NotificationService {
   private final INotification notification;
   private final IObservable observable;
   
    NotificationService(INotification notification, IObservable observable){
    this.notification = notification;
    this.observable = observable;
   }

   public void sendNotification() {
    String notificationContent = notification.getContent();
    System.out.println("New Notification received: " + notificationContent);
    this.observable.notifyObservers();
   }
}
