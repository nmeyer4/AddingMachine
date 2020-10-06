package cse360assignment02;
/*	This class is an adding machine.
*	It adds and subtracts to the variable total and 
*	returns it, as well as saves and returns
*	all past transactions as a string.
*/

public class AddingMachine {
  private int total;
  private StringBuffer transactions;
  
  //Constructor
  public AddingMachine () {
    total = 0;
    transactions = new StringBuffer("0");
    
  }
  
  //accessor method for the total
  public int getTotal () {
    return total;
  }
  
  //adds the input
  public void add (int value) {
	  total = value + total;
	  transactions.append(" + " + value);
  }

  //subtracts the input
  public void subtract (int value) {
	  total = total - value;
	  transactions.append(" - " + value);
  }

  //returns the history of transactions as a string
  public String toString () {
    return transactions.toString();
  }

  //method to clear variables
  public void clear() {
	  total = 0;
	 transactions.delete(0, transactions.length());
  }
}