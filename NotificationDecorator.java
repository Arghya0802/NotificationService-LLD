// Decorator uses both 'is-a' and 'has-a' relationship 
public abstract class NotificationDecorator implements INotification{
    protected final INotification notification; // Composition

    NotificationDecorator(INotification notification) {
        this.notification = notification;
    }

    public abstract String getContent();
}
