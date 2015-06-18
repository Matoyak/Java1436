import javax.swing.*;

/**
 * Created by Mason Worrell on 6/17/2015.
 */
public class Assignment2 {
    String name, age_s, costSemester_s, costClass_s, gradSemester_s;
    int age;
    double costSemester, costClass;
    boolean gradSemester = false, flag = true;

    public static void main(String[] args) {
        Assignment2 assignment2 = new Assignment2();
        assignment2.userInputs();
        assignment2.output(assignment2);
    }

    private void userInputs() {

        name = JOptionPane.showInputDialog(null, "Hello. What is your name?");
        JOptionPane.showMessageDialog(null,"Welcome, " + name + ".");

        age_s = JOptionPane.showInputDialog(null, "How old are you?");
        age = Integer.parseInt(age_s);

        costClass_s = JOptionPane.showInputDialog(null, "How much did you pay for this class?");
        costClass = Double.parseDouble(costClass_s);

        costSemester_s = JOptionPane.showInputDialog(null, "How much did you pay for this semester?");
        costSemester = Double.parseDouble(costSemester_s);

        do {
            gradSemester_s = JOptionPane.showInputDialog(null, "Do you graduate this semester?");
            gradSemester_s.toLowerCase();
            if (gradSemester_s == "n" || gradSemester_s == "no" || gradSemester_s == "false" || gradSemester_s == "f" || gradSemester_s == "0") {
                gradSemester = false;
                flag = false;
            } else if (gradSemester_s == "y" || gradSemester_s == "yes" || gradSemester_s == "true" || gradSemester_s == "t") {
                gradSemester = true;
                flag = false;
            } else {
                JOptionPane.showMessageDialog(null, "I'm sorry, we did not understand.\nPlease try again.");
            }
        } while (flag);

        //debug(name, age, costClass, costSemester, gradSemester);
    }

    private void output(Assignment2 obj) {
        System.out.println(obj.age);
        //stuff
    }

    private static void debug(String name, int age, double costClass, double costSemester, boolean gradSemester) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(costClass);
        System.out.println(costSemester);
        System.out.println(gradSemester);
    }
}
