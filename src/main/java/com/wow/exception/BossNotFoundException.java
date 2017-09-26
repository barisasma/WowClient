package com.wow.exception;

public class BossNotFoundException extends WowException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BossNotFoundException(final String message) {
        super(message);
    }
    
    public BossNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public BossNotFoundException(final Throwable cause) {
        super(cause.getMessage(), cause);
    }

}
