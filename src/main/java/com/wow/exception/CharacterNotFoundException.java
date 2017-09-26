package com.wow.exception;

public class CharacterNotFoundException extends WowException{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public CharacterNotFoundException(final String message) {
        super(message);
    }
    
    public CharacterNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
    
    public CharacterNotFoundException(final Throwable cause) {
        super(cause.getMessage(), cause);
    }

}
