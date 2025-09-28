 public class SignatureDecorator extends INotificationDecorator {

    SignatureDecorator(INotification notification){
        super(notification);
    }

    @Override
    public String getContent() {
       return notification.getContent() + "Signed by Arghya Chatterjee!!!"; 
    }
}

