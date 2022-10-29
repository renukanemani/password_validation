package com.problem.password.exception;

public class InvalidPasswordException extends Exception {

	int passwordConditionViolated = 0;
	  
	    public InvalidPasswordException(int conditionViolated)
	    {
	        super("Invalid Password: ");
	        passwordConditionViolated = conditionViolated;
	    }
	  
	    public String printMessage()
	    {
	       
	        switch (passwordConditionViolated) {
	  
	        
	        case 1:
	            return ("Password length should be larger than 8 characters");
	  
	        
	        case 2:
	            return ("Password should not be empty");
	  
	        case 3:
	            return ("Password should contain"
	                    + " at least one digit(0-9)");
	  
	  
	        // Password should contain at least
	        // one uppercase letter(A-Z)
	        case 4:
	            return ("Password should contain at"
	                    + " least one uppercase letter(A-Z)");
	  
	        // Password should contain at least
	        // one lowercase letter(a-z)
	        case 5:
	            return ("Password should contain at"
	                    + " least one lowercase letter(a-z)");
	        }
	  
	        return ("");
	    }
}
