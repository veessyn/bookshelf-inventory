package com.packtpub.felix.bookshelf.inventory.api.exception;

public class BookAlreadyExistsException extends Exception {
    
    public BookAlreadyExistsException(String message){
	super(message);
    }

}
