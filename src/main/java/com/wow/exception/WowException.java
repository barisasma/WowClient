package com.wow.exception;

public class WowException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WowException(final String message) {
        super(message);
    }
    
    public WowException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public WowException(final Throwable cause) {
        super(cause.getMessage(), cause);
    }
	
	
}
