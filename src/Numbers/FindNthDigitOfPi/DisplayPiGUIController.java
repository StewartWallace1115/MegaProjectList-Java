/*
 * Name: Stewart Wallace
 * Date: 5/8/2016
 * Purpose: This controls the DisplayPIGUI. It outputs pi to the amount of 
 * digits the user specified.
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DisplayPiGUIController {
	@FXML TextField numberOfDigitsTextField;
	@FXML Text      displayDigitsText;
	
	@FXML
	public void handleButtonClick(ActionEvent ae){
		String userInput = numberOfDigitsTextField.getText();
		double roundedNumber = 0;
		
		try{
			if(userInput.equals("") || userInput == null)
				throw new NullStringException("Textfield is empty");
			
			int numberOfDigits = Integer.parseInt(userInput);
			
			if(numberOfDigits < 0)
				throw new NumberFormatException("Number entered must be greater than 0");
			
			long multiplier = (long) Math.pow(10, numberOfDigits);
			roundedNumber = (double) Math.round(Math.PI * multiplier) / multiplier;
			displayDigitsText.setText(roundedNumber+"");
		} catch (NumberFormatException e) {
			displayDigitsText.setText(e.getMessage());
		} catch (NullStringException e){
			displayDigitsText.setText("Text field is empty");
		}
        
        
	}
	
}
