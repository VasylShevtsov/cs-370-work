import java.util.ArrayList;
import java.util.List;

public class Model {
    private final List<String> messages;
    private final List<Observer> observers;

    public Model(){
        messages = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void addMessage(String message) {
        messages.add(message);
        notifyObservers();
    }

    public List<String> getMessages() {
        return messages;
    }

    private void notifyObservers() {
        for (Observer o : observers) {
            o.onMessagesChanged(getMessages());
        }
    }
}
