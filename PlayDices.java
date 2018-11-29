package dices;

import java.awt.Toolkit;

import javax.swing.JOptionPane;


public class PlayDices {

	public static void main(String[] args) {
		

	//Create an instance of the dices
		
		Dices dado1= new Dices();
		
	//Rename de JOption pane default message from "Aceptar" to "Ok", then show a message dialog to start playing
		
		Object[] Joption = {"OK"};
		
	
		JOptionPane.showMessageDialog(null, "Press OK to play");
		
		dado1.play();
	
	//Play a beep to show the result
		
		Toolkit.getDefaultToolkit().beep();				
        
		System.out.println(dado1.toString()+"\n"+dado1.result());
	}

}
