package com.Projects.OnlineBookStore.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Projects.OnlineBookStore.entity.Book;
import com.Projects.OnlineBookStore.repo.BookRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookRepository repo;

	@GetMapping
	public List<Book> getBooks() {
		return repo.findAll();
	}

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return repo.save(book);
	}

	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
		repo.deleteById(id);
	}

	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {

		Book b = repo.findById(id).get();

		b.setTitle(book.getTitle());

		b.setAuthor(book.getAuthor());

		b.setPrice(book.getPrice());

		b.setImage(book.getImage());

		b.setCategory(book.getCategory());

		return repo.save(b);

	}
}
