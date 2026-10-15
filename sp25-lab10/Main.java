public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model);

        model.addObserver(view);
        view.setController(controller);
        view.setVisible(true);
    }
}
