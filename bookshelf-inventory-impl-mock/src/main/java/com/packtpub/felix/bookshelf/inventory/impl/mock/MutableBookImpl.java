package com.packtpub.felix.bookshelf.inventory.impl.mock;

import com.packtpub.felix.bookshelf.inventory.api.MutableBook;

public class MutableBookImpl implements MutableBook {

    private String isbn;
    private String author;
    private String title;
    private String category;
    private int rating;

    public MutableBookImpl(String isbn) {
	setIsbn(isbn);
    }

    public String getIsbn() {
	return isbn;
    }

    public void setIsbn(String isbn) {
	this.isbn = isbn;
    }

    public String getTitle() {
	// TODO Auto-generated method stub
	return null;
    }

    public String getAuthor() {
	// TODO Auto-generated method stub
	return null;
    }

    public String getCategory() {
	// TODO Auto-generated method stub
	return null;
    }

    public int getRating() {
	// TODO Auto-generated method stub
	return 0;
    }

    public void setTitle(String title) {
	// TODO Auto-generated method stub

    }

    public void setAuthor(String author) {
	// TODO Auto-generated method stub

    }

    public void setCategory(String category) {
	// TODO Auto-generated method stub

    }

    public void setRating(String rating) {
	// TODO Auto-generated method stub

    }

    public String toString() {
	StringBuffer buf = new StringBuffer();
	buf.append(getCategory()).append(": ");
	buf.append(getTitle()).append(" from ").append(getAuthor());
	buf.append(" [").append(getRating()).append(']');
	return buf.toString();
    }

}
