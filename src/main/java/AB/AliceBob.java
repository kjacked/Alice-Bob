package AB;

import javax.swing.JOptionPane;



public class AliceBob {

    public static void money() {
        String userInput = JOptionPane.showInputDialog("Hi, what's your name?");
        if (userInput.toLowerCase().equals("alice") || (userInput.toLowerCase().equals("bob"))){
            System.out.println("Hi " + userInput);
        }
        else {}
    }
}