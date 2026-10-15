import java.util.List;

public interface Observer {
    void onMessagesChanged(List<String> messages);
}
