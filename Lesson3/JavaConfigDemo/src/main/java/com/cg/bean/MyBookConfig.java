package com.cg.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
public class MyBookConfig 
{
	@Bean
	public Author author()
	{		
		return new Author("Kanetkar","Nagpur");

	}

	@Bean(initMethod="setUp",destroyMethod="cleanUp")
	//@Scope("prototype")
	public Book book()
	{
		Book book=new Book();
		book.setYear("1995");
		book.setIsbn("Kj77756");
		book.setAuthor(author());
		return book;

	}


}
