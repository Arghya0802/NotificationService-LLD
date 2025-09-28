 public class SignatureDecorator extends NotificationDecorator {

    SignatureDecorator(INotification notification){
        super(notification);
    }

    @Override
    public String getContent() {
       return notification.getContent() + "Signed by Arghya Chatterjee!!!"; 
    }
}

