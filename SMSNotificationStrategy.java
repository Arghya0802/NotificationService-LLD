public class SMSNotificationStrategy implements INotificationStrategy{
    @Override
    public void sendNotification(String notificationContent) {
        System.out.println("Sending this notification " + notificationContent + " through SMS");
    }
    
}
