/**Author: Stanley Haynes
Class ID: 401
Assignment: 2
Description: Program to provide a calculator function to
perform operations of addition, subtraction, multiplication
and division.*/

package cse360assign3;
import java.util.ArrayList;
/**
* calculator --- program to create calculator
* with operations and history.
* @author Stanley Haynes
*/
public class Calculator {

	private int total;
	private static ArrayList<String> calcArray = new ArrayList<String>();
	/**
	* Constructor for class Calculator
	*/
	public Calculator () {
		total = 0;  // not needed - included for clarity
		calcArray.add("0");
	}
	/**
	* Obtains total of all parameters.
	*/
	public int getTotal () {
		return total;
	}
	/**
	* Adds the parameter to the total variable
	*/
	public void add (int value) {
		total = total + value;
		calcArray.add(" add ");
		calcArray.add(value + " ");
	}
	/**
	* Subtracts the parameter from the total variable.
	*/
	public void subtract (int value) {
		total = total - value;
		calcArray.add(" subtract ");
		calcArray.add(value + " ");
	}
	/**
	*Multiplies the total by the parameter.
	*/
	public void multiply (int value) {
		total = total * value;
		calcArray.add(" multiply ");
		calcArray.add(value + " ");
	}
	/**
	*Divides the total by the parameter.
	*If parameter is zero, total set to zero.
	*No error will be printed or exception provided.
	*/
	public void divide (int value) {
		total = total / value;
		calcArray.add(" divide ");
		calcArray.add(value + " ");
	}
	/**
	* History starts at zero to last.input
	* loops to determine appropriate operator to append
	* to string and ensures spaces between
	* inputs and operators.*/
	public String getHistory () {
		String entry = "";
		for(int position = 0; position < calcArray.size(); position++)
			if (calcArray.get(position) == " add ") {
				entry = entry + " + ";
			} else if (calcArray.get(position) == " subtract ") {
				entry = entry + " - ";
			} else if (calcArray.get(position) == " multiply ") {
				entry = entry + " * ";
			} else if (calcArray.get(position) == " divide ") {
				entry = entry + " / ";
			} else {
					entry = entry + calcArray.get(position);
			}
		return entry;
	}
}
