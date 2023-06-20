import javax.swing.JOptionPane;

public class ex_6_1 {
    public static void main(String[] args) {
        int options = JOptionPane.showConfirmDialog(null, "Do you wanna change to the first class ticket?",
                "Choosing options", 0);
        JOptionPane.showMessageDialog(null, "You've choose " + (options == JOptionPane.YES_OPTION ? "yes" : "no"), null,
                options);
        System.exit(0);
    }
}
