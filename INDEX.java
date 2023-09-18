import javax.swing.JOptionPane;
import java.util.Scanner;

public class INDEX {
    public static void main(String[] args) {

        Double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of mass in KG"));
        Double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of height in Meters"));

        double BMI = x / (y * y); // This Formular Calculates the Body Mass Index of a person by getting inputs

        JOptionPane.showMessageDialog(null, "YOUR BODY MASS INDEX (BMI) IS =  " + BMI);

        if (x > 0 && y > 0) {
            if (BMI < 18.5) {
                JOptionPane.showMessageDialog(null, "You are within the Underweight range less than 18.5");

            } // the first Range of the IBM

            if (BMI > 18.5 && BMI <= 24.9) {
                JOptionPane.showMessageDialog(null, "You are within the Healthy weight range withis within 18.5 t0 24.9:");
            } // The second Range of the IBM

            if (BMI > 25.0 && BMI <= 29.9) {
                JOptionPane.showMessageDialog(null, "You are within the over weight range within 25.0 to 29.9:");
            } // The Third Range of the IBM

            if (BMI > 30) {
                JOptionPane.showMessageDialog(null, "You are Obsese kindly Seek Medical Attention(Above 30):");
            } // The fourth Range of the IBM

        }

        else
            JOptionPane.showMessageDialog(null, "Kindly input Positive values for the Weight and/or the Height:");

    }
}