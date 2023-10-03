import javax.swing.JOptionPane;
import java.util.Scanner;

public class INDEX {
    public static void main(String[] args) {

        Double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of mass in KG"));
        Double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the value of height in Meters"));

        double BMI = x / (y * y); // This Formular Calculates the Body Mass Index of a person by getting inputs
        //If the numbers are out of range then we the output will be not desplayed in that specified range.
        if (x > 0 && y > 0) {
            JOptionPane.showMessageDialog(null, "YOUR BODY MASS INDEX (BMI) IS =  " + BMI);
            if (BMI < 18.5) {
                JOptionPane.showMessageDialog(null, "You are within the Underweight range less than 18.5");

            } // the first Range of the IBM,the output show the the range of all the programs in how it will defect from it 

            if (BMI > 18.5 && BMI <= 24.9) {
                JOptionPane.showMessageDialog(null,
                        "You are within the Healthy weight range withis within 18.5 t0 24.9:");
            } // The second Range of the IBM

            if (BMI > 25.0 && BMI <= 29.9) {
                JOptionPane.showMessageDialog(null, "You are within the over weight range within 25.0 to 29.9:");
            } // The Third Range of the IBM

            if (BMI > 30) {
                JOptionPane.showMessageDialog(null, "You are Obsese kindly Seek Medical Attention(Above 30):");
            } // The fourth Range of the IBM

        }

        else {
            // The output below only display when one/both values entered are negative
            JOptionPane.showMessageDialog(null, "Your Height and/or weight should be positive", "Error",
                    JOptionPane.ERROR_MESSAGE);

        }

    }
}