package com.angle.service;

import com.angle.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    public boolean save(Book book);

    public boolean upDate(Book book);

    public boolean delete(int id);

    public Book getById(int id);

    public List<Book> getAll();
}
