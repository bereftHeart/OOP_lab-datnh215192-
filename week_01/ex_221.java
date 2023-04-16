import javax.swing.JOptionPane;

public class ex_221 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello, welcome to JAVA", "notice", 0);
        String message;
        message = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hi " + message);
    }
}
