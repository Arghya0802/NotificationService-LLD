// Decorator uses both 'is-a' and 'has-a' relationship 
public abstract class INotificationDecorator implements INotification{
    protected final INotification notification; // Composition

    INotificationDecorator(INotification notification) {
        this.notification = notification;
    }

    public abstract String getContent();
}
