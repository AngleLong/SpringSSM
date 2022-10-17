package com.angle.service.impl;

import com.angle.dao.BookDao;
import com.angle.domain.Book;
import com.angle.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean upDate(Book book) {
        bookDao.upDate(book);
        return true;
    }

    @Override
    public boolean delete(int id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getById(int id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
