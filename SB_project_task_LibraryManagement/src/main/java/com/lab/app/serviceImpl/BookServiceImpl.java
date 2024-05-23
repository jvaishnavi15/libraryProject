package com.lab.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.app.model.Book;
import com.lab.app.repository.BookRepository;
import com.lab.app.serviceI.BookServiceI;
@Service
public class BookServiceImpl implements BookServiceI
{
	@Autowired
	BookRepository br;
	

	@Override
	public Book saveBookData(Book b) {
		
		return br.save(b);
		
	}

	@Override
	public List<Book> getAllBookData() {
		List<Book> li=br.findAll();
		return li;
	}
 

	@Override
	public void deleteAllData(Integer bookId) {
		br.findById(bookId);
		
	}


	@Override
	public Book updateBookData(Integer bookId,Book bo) {
		Optional<Book> ob = br.findById(bookId);
		{
			if(ob.isPresent())
			{
				Book book=ob.get();
				
				if(bo.getBookId()!=null)
				{
					book.setBookId(bo.getBookId());
				}
				if(bo.getBookTitle()!=null)
				{
					book.setBookTitle(bo.getBookTitle());
				}
				if(bo.getAuthor()!=null)
				{
					book.setAuthor(bo.getAuthor());
				}
				if(bo.getUser().getUserId()!=null)
				{
					book.getUser().setUserId(bo.getUser().getUserId());
				}
				if(bo.getUser().getUserName()!=null)
				{
					book.getUser().setUserName(bo.getUser().getUserName());
				}
				if(bo.getUser().getUserContact()!=null)
				{
					book.getUser().setUserContact(bo.getUser().getUserContact());
				}
				if(bo.getUser().getUserAddress()!=null)
				{
					book.getUser().setUserAddress(bo.getUser().getUserAddress());
				}
				
				return br.save(book);
			}else
					{
				return null;
					}
		}
		
	}

}
