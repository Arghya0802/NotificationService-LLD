public interface IObservable {
    public void addObserver(IObserver observer);
    public void removeObserver();
    public void notifyObservers(); // Design is done such that all the actual implementations have their own listOfObservers 
}