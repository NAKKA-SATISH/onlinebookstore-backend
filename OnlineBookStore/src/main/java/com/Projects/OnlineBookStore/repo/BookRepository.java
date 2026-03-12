package com.Projects.OnlineBookStore.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Projects.OnlineBookStore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{}
