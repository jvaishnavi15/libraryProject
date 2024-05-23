package com.lab.app.controller;

import java.lang.annotation.Retention;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab.app.model.Book;
import com.lab.app.model.User;
import com.lab.app.serviceI.BookServiceI;
import com.lab.app.serviceI.UserServiceI;

import jakarta.validation.Valid;

@RestController

@RequestMapping("/user")
public class HomeController 
{
	@Autowired
	UserServiceI usi;
	
	@PostMapping("/user")
	public User saveUserData(@Valid@RequestBody User l)
	{
		User li=usi.saveUserData(l);
		return li;
	}
	
	@GetMapping("/users")
	public List<User >getUserData()
	{
		List<User> li=usi.getUserAllData();
		return li;
	}
	@DeleteMapping("/user/{UserId}")
	public void deleteUserData(@PathVariable Integer UserId)
	{
		usi.deleteUserData(UserId);
	}
	
	@PutMapping("/user/{UserId}")
	public User updateUserData(@PathVariable Integer UserId,@RequestBody User u)
	{
		User uu=usi.updateUserData(UserId,u);
		return uu;
	}
	
	@Autowired
	BookServiceI bsi;
	
	@PostMapping("/book")
	public Book saveData(@Valid @RequestBody Book b)
	{
		Book bo=bsi.saveBookData(b);
		return bo;
	}
	
	@GetMapping("/book")
	public List<Book> getAllBookData()
	{
		List<Book> li=bsi.getAllBookData();
		return li;
	}
	@DeleteMapping("/book/{bookId}")
	public void deleteAllData(@PathVariable Integer bookId)
	{
		bsi.deleteAllData(bookId);
	}
	
	@PutMapping("/book/{bookId}")
	public Book updateData(@PathVariable Integer bookId,@Valid@RequestBody Book bo)
	{
		Book b=bsi.updateBookData(bookId,bo);
		return b;
	}

}
