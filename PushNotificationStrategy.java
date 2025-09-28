public class PushNotificationStrategy implements INotificationStrategy{

    @Override
    public void sendNotification(String notificationContent) {
        System.out.println("Sending this notifcation " + notificationContent + " from Push Notification");
    }
}
