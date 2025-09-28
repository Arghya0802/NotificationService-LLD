public class EmailNotificationStrategy implements INotificationStrategy{
    @Override
    public void sendNotification(String notificationContent) {
        System.out.println("Sending this " + notificationContent + " from Email!! ");
    }
}
