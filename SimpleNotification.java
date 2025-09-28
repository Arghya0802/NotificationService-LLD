// For now we are using SimpeNotification, later on it can be extended to HTMLBasedNotifcation and others
public class SimpleNotification implements INotification{
    private final String text;

    SimpleNotification(String text) {
        this.text = text;
    }

    @Override
    public String getContent() {
     return this.text;   
    }
}
