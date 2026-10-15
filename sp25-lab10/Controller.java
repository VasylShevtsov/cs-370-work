public class Controller {
    private final Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void postMessage(String message) {
        if (!message.trim().isEmpty()) {
            model.addMessage(message);
        }
    }
}
