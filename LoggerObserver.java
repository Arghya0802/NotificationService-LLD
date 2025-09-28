public class LoggerObserver implements IObserver {
    @Override
    public void update(String notificationContent) {
        System.out.println("Logging the below Notification for now!!");
        System.out.println(notificationContent);
    }
}
