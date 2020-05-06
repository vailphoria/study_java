/**
 * @author Valeri
 *
 */
public class Playground {

	public static Double calculate(final double numberOne, final String operation, final double numberTwo) 
	{
	    Double Result = null;
	    
	    if (operation == "+") Result = numberOne + numberTwo;
	    else if (operation == "-") Result = numberOne - numberTwo;
	    else if (operation == "*") Result = numberOne * numberTwo;
	    else if (operation == "/") {
	    	if (numberTwo != 0) Result = numberOne / numberTwo;
	    }
		return Result;		
	}
	public static void main(String[] args) {

	}

}
