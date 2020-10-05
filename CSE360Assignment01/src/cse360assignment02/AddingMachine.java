/**
* The AddingMachine program implements methods that will
* add, subtract, get the total, display the arithmetic
* and clear the data.
* @author  Stephanie Mejia Vazquez
*/
package cse360assignment02;

public class AddingMachine {
	
	 private int total;
	 private String record;
	  
	  /**
	   * This is the constructor of the AddingMachine class.
	   * @param args unused.
	   * @return none.
	  */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    record = "" + total; // record is a string (keeps track of history transaction) set to start string at 0. 
	  }
	  
	  /**
	   * This method return the total.
	   * @param args unused.
	   * @return int. This returns the total sum. 
	  */
	  public int getTotal () {
	    return total; // return the total
	  }
	  
	  /**
	   * This method adds the parameter value to the total variable.
	   * @param args value. This parameter is an integer.
	   * @return void.
	  */
	  public void add (int value) {
		  total = total + value; // total is equal to the total plus the parameter value
		  record +=  " + " + value; // append the parameter value to record string
	  }
	  
	  /**
	   * This method subtracts the parameter value from the total variable.
	   * @param args value. This parameter is an integer.
	   * @return void.
	  */
	  public void subtract (int value) {
		  total = total - value; // total is equal to the total minus the parameter value
		  record += " - " + value; // append the parameter value to record string
	  }
	  
	  /**
	   * This method displays the history transaction as a string.
	   * @param args unused.
	   * @return String. This returns the history transaction. It starts from the initial 0 value to the last input as a string. 
	  */
	  public String toString () {
	    return record; // return the entire record String that appended all the values
	  }
	  
	  /**
	   * This method clears the data.
	   * @param args unused.
	   * @return void.
	  */
	  public void clear() {
		  total = 0; // set the total to be cleared, set to 0
		  record = "" + total; // set record string to hold no data
	  }
}
