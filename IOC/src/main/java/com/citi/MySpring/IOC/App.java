package com.citi.MySpring.IOC;

/**
 * Hello world!
 *
 */
public class App 
{
	private String message;
	
    public String getMessage() {
    	System.out.println("Your Message : " + message);
    	return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	 
}
