import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeStampDecorator extends NotificationDecorator {

    TimeStampDecorator(INotification notification){
        super(notification);
    }

    @Override
    public String getContent() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "[" + localDateTime.format(formatter) + "] " + notification.getContent();
    }
}
