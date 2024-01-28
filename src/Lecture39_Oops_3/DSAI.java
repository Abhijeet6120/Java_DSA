/**
 * 
 */
package Lecture39_Oops_3;

/** AA
 * @author ABHIJEET KUMAR
 *
 */
public interface DSAI extends StackI, Dynamic_StackI{		// StackI and Dynamic StackI parents of DSAI child class
														// one child have two father
	// MultiLevel inheritance achieving through Interface
	
	public void Display();
	
	public int size();
	
	
	

}
