package com.Projects.OnlineBookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Projects.OnlineBookStore.entity.Book;
import com.Projects.OnlineBookStore.repo.BookRepository;

@Service
public class BookService {

@Autowired
BookRepository repo;

public List<Book> getAllBooks(){
return repo.findAll();
}

public Book addBook(Book book){
return repo.save(book);
}

public void deleteBook(Long id){
repo.deleteById(id);
}

}
