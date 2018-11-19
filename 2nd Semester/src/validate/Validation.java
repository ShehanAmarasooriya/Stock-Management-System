/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import javax.swing.JTextField;

/**
 *
 * @author Dulitha Dissanayake
 */
public class Validation {
    
    

    public static void priceTextValidation(JTextField textField) {
        for (int i = 1; i <= textField.getText().length(); i++) {
            String text = textField.getText().substring(0, i);
            if (!text.matches("[\\d]+[.]{0,1}[\\d]{0,2}")) {
                textField.setText(textField.getText().substring(0, i - 1));
                break;
            }
        }
    }

    /*public static void textValidation(JTextField textField){
     for (int i = 1; i <= textField.getText().length(); i++) {
     String text = textField.getText().substring(0, i);
     System.out.println("Checked");
     if (text.matches("[|*]++")) {
     textField.setText(textField.getText().substring(0, i - 1));
     break;
     }
     }
     }*/
    public static void textValidation(JTextField textField) {
        char ch[] = textField.getText().toCharArray();
        int i = 0;
        for (char c : ch) {
            if (c == '*' || c == '|') {
                textField.setText(textField.getText().substring(0, i));
                break;
            }
            i++;
        }
    }

}
