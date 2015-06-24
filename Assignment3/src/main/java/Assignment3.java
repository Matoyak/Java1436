import javax.swing.*;

/**
 * Created by Matoyak on 6/24/2015.
 */
public class Assignment3 {
    public static void main(String[] args) {
        String age_s;
        int age;

        age_s = JOptionPane.showInputDialog(null, "What is your age?");
        age = Integer.parseInt(age_s);

        if (age < 18) {
            JOptionPane.showMessageDialog(null, "Sorry, you are underage.\nYou may not smoke, nor are you allowed\n"
            + "to consume alcohol.");
        } else if (age >= 18 && age < 21) {
            JOptionPane.showMessageDialog(null, "Congratulations, you are old enough to smoke!\nUnfortunately, you are"
            + " too young to consume alcohol.");
        } else if (age >= 21) {
            JOptionPane.showMessageDialog(null, "Congratulations, you are old enough to both drink and smoke.");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid input.");
        }
    }
}
