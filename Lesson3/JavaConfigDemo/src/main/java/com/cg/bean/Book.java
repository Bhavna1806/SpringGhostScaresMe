package com.cg.bean;

import javax.annotation.*;

public class Book
{
	private Author author;
	private String isbn;
	private String year;
	
	@PostConstruct
    public void customBookInit() 
    {
        System.out.println("Method customBookInit() invoked...");
    } 
    @PreDestroy
    public void customBookDestroy() 
    {
        System.out.println("Method customBookDestroy() invoked...");
    }
	public void setUp()throws Exception
	{
		
		System.out.println(" Initializing the Book Bean with custom Config");
	}
	
	public void cleanUp()throws Exception
	{
		
		System.out.println(" Destroying the Book Bean with custom Config");

	}

	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [author=" + author + ", isbn=" + isbn + ", year=" + year
				+ "]";
	}

}
