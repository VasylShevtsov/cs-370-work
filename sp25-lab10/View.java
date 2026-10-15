import javax.swing.*;
import java.awt.*;
import java.util.List;

public class View extends JFrame implements Observer {
    private final JTextField firstName = new JTextField();
    private final JTextField lastName = new JTextField();
    private final JTextField email = new JTextField();
    private final JTextField graduationYear = new JTextField();
    private final JTextArea messages = new JTextArea();
    private Controller controller;

    public View() {
        setTitle("Messages");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel form = new JPanel(new GridLayout(5, 2, 0, 5));
        form.setBackground(Color.PINK);
        form.setPreferredSize(new Dimension(600, 200));

        form.add(new JLabel(" First name:"));
        form.add(firstName);
        form.add(new JLabel(" Last name:"));
        form.add(lastName);
        form.add(new JLabel(" Email:"));
        form.add(email);
        form.add(new JLabel(" Graduation Year:"));
        form.add(graduationYear);
        form.add(new JLabel(""));

        JButton postButton = new JButton("Post data");
        form.add(postButton);
        postButton.addActionListener(e -> {
            String message = firstName.getText() + " " + lastName.getText() + ", " + email.getText() + ", " + graduationYear.getText();
            controller.postMessage(message);
            firstName.setText("");
            lastName.setText("");
            email.setText("");
            graduationYear.setText("");
        });

        messages.setEditable(false);
        add(form, BorderLayout.NORTH);
        add(new JScrollPane(messages), BorderLayout.CENTER);
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void onMessagesChanged(List<String> messages) {
        this.messages.setText(String.join("\n", messages));
    }
}
