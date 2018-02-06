/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Feb 2018
 * This program calculates the energy output if you convert the mass of an,
 *     object into energy.
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculateEnergyOutput {

	public static final double speedOfLight = 2.998 * Math.pow(10, 8);
	
	public static void main(String[] args) {
		// calculates the energy output if all of the mass is converted to
		// energy
		String input = null;
		double massOfObject;
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		while(true) {
			System.out.println("Enter the mass of the object in grams: ");
			try {
				//Get user input
				input = reader.readLine();
			} catch (IOException noInput) {
				noInput.printStackTrace();
			}
			try {
				//Convert string to double
				massOfObject = Double.parseDouble(input);
				break;
			} catch (NumberFormatException stringInput) {
				System.out.println("Please enter a number");
			}
		}
		double energy = massOfObject * Math.pow(speedOfLight, 2);
		System.out.println("The amount of energy released from " + massOfObject
				+ "g of matter is " + energy + " J.");
	}
}