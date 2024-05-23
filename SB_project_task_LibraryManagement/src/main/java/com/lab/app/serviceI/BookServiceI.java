package com.lab.app.serviceI;

import java.util.List;

import com.lab.app.model.Book;

public interface BookServiceI {

	Book saveBookData(Book b);

	List<Book> getAllBookData();

	void deleteAllData(Integer bookId);

	Book updateBookData(Integer bookId, Book bo);

}
