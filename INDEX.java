import javax.swing.JOptionPane;
import java.util.Scanner;

public class INDEX {
    public static void main(String[] args) {

        Double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of mass in KG"));
        Double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of height in Meters"));

        double BMI = x / (y * y);

        JOptionPane.showMessageDialog(null, "YOUR BODY MASS INDEX (BMI) IS =  " + BMI);

        if (BMI < 16)
            JOptionPane.showMessageDialog(null, "you are seriously underweight get something to eat:");
        else if (BMI < 18)
            JOptionPane.showMessageDialog(null, "you are underweight try eating  more:");
        else if (BMI < 24)
            JOptionPane.showMessageDialog(null, "you are normal weight but continue eating well:");
        else if (BMI < 29)
            JOptionPane.showMessageDialog(null, "you are seriously overweight call Doctor Shimiyana:");
        else if (BMI < 35)
            JOptionPane.showMessageDialog(null, "you are seriously overwight and this is risk:");
        else
            JOptionPane.showMessageDialog(null, "you are over weight beyond Zambia Health Desk Regulation:");

    }
}