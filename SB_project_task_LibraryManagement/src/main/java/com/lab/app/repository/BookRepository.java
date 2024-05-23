package com.lab.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.app.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
