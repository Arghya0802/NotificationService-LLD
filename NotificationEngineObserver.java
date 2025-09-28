public class NotificationEngineObserver implements IObserver{
    private final INotificationStrategy notificationStrategy;
    private int countOfStrategies;
     
    NotificationEngineObserver(INotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
        countOfStrategies = 0 ;
    }

    public void addNotificationStrategy(){
        this.countOfStrategies += 1;
    }
    public void removeNotificationStrategy(){
        if(this.countOfStrategies > 0){
            this.countOfStrategies -= 1;
        }
    }
    
    public int getCountOfDifferentStrategies(){
        return this.countOfStrategies;
    }

    @Override
    public void update(String notficationContent) {
        // We will have listOfStrategies and each of them will be informed

        for(int i = 0; i < countOfStrategies; i++){
            notificationStrategy.sendNotification(notficationContent);
        }
    }
}
