
import javax.swing.*;

public class GUIToCaptureUserInput {

    GUIToCaptureUserInput{
            JFrame userInputForm = new JFrame("Capture User Input!!");
            JLabel nameInputField = new JLabel("Enter your name: ");
            JLabel ageInputField = new JLabel("Enter your age: ");
            JLabel genderInputField = new JLabel("Enter your Gender: ");
            JLabel countryOfOriginInputField = new JLabel("Enter your Country of Origin: ");

            nameInputField.setBounds(0,0,100,100);
            ageInputField.setBounds(0,20,100,100);
            genderInputField.setBounds(0,40,100,100);
            countryOfOriginInputField.setBounds(0,80,100,100);

            userInputForm.add(nameInputField);
            userInputForm.add(ageInputField);
            userInputForm.add(genderInputField);
            userInputForm.add(countryOfOriginInputField);

            userInputForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            userInputForm.setResizable(true);
            userInputForm.setLayout(null);
            userInputForm.setSize(400, 300);
            userInputForm.setVisible(true);


    }

    public static void main(String [] args){
            new GUIToCaptureUserInput();


    }
}
