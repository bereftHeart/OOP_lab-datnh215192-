import javax.swing.JOptionPane;
import java.lang.String;
import java.lang.Math;

public class ex_226 {
    static void first_deg_equation() {
        String strNum1 = JOptionPane.showInputDialog("You choose: ax+b \n Enter a: ");
        double a = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog("You choose ax+b \n Enter b: ");
        double b = Double.parseDouble(strNum2);

        if (a == 0) {
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "The equation has infinitely solutions");
            } else {
                JOptionPane.showMessageDialog(null, "The equation has no solution");
            }
        } else {
            double root = -b / a;
            String output = "x = " + root;
            JOptionPane.showMessageDialog(null, output);
        }
    }

    // ---------------------------------------------------------------------------------------------------

    static void system_of_first_deg_equation() {
        JOptionPane.showMessageDialog(null, "You choose a11x1 + a12x2 = b1a21x1 + a22x2 = b2.");

        String strNum1 = JOptionPane.showInputDialog("Enter a11: ");
        double a11 = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog("Enter a12: ");
        double a12 = Double.parseDouble(strNum2);

        String strNum3 = JOptionPane.showInputDialog("Enter b1: ");
        double b1 = Double.parseDouble(strNum3);

        String strNum4 = JOptionPane.showInputDialog("Enter a21: ");
        double a21 = Double.parseDouble(strNum4);

        String strNum5 = JOptionPane.showInputDialog("Enter a22: ");
        double a22 = Double.parseDouble(strNum5);

        String strNum6 = JOptionPane.showInputDialog("Enter b2: ");
        double b2 = Double.parseDouble(strNum6);

        double D = a11 * a22 - a21 * a12;
        if (D == 0) {
            JOptionPane.showMessageDialog(null, "Infinite number of roots!");
        } else {
            double Dx = b2 * a12 - b1 * a22;
            double Dy = b1 * a11 - b2 * a21;
            double x1 = Dx / D;
            double x2 = Dy / D;
            String output = "The two roots of the linear system: " + "\n" + "x1= " + x1 + " and x2= " + x2;
            JOptionPane.showMessageDialog(null, output);
        }
    }

    // ---------------------------------------------------------------------------------------------------
    static void second_deg_equation() {
        JOptionPane.showMessageDialog(null, "You choose ax^2 + bx + c = 0.");

        String strNum1 = JOptionPane.showInputDialog("Enter a: ");
        double a = Double.parseDouble(strNum1);

        String strNum2 = JOptionPane.showInputDialog("Enter b: ");
        double b = Double.parseDouble(strNum2);

        String strNum3 = JOptionPane.showInputDialog("Enter c: ");
        double c = Double.parseDouble(strNum3);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    JOptionPane.showMessageDialog(null, "The equation has infinitely solutions");
                } else {
                    JOptionPane.showMessageDialog(null, "The equation has no solution");
                }
            } else {
                double root = -c / b;
                String output = "x = " + root;
                JOptionPane.showMessageDialog(null, output);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                JOptionPane.showMessageDialog(null, "The equation has no solution");
            } else if (delta == 0) {
                double root = -b / (2 * a);
                String output = "x1 = x2 = " + root;
                JOptionPane.showMessageDialog(null, output);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                String output = "The equation has two roots x1= " + x1 + " and x2=" + x2;
                JOptionPane.showMessageDialog(null, output);
            }
        }

    }
    // ---------------------------------------------------------------------------------------------------

    public static void main(String[] args) {

        String[] options = { "1.The first-degree equation (linear equation) with one variable.",
                "2.The system of first-degree equations (linear system) with two variables.",
                "3.The second-degree equation with one variable." };
        int option = JOptionPane.showOptionDialog(null, "Which type of equation do you want to solve?",
                "Choose an option", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (option) {
            case 0:
                first_deg_equation();
                break;
            case 1:
                system_of_first_deg_equation();
                break;
            case 2:
                second_deg_equation();
                break;
            default:
                JOptionPane.showMessageDialog(null, "No options selected", null, option);
                break;
        }
    }
}
