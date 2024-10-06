package dao;

import interfaces.IBook;
import models.Book;

import java.util.List;

public class BookDao implements IBook {
    @Override
    public void save(Book book) {

    }

    @Override
    public Book getBook() {
        return null;
    }

    @Override
    public void delete(Book book) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public List<Book> getBooks() {
        return List.of();
    }
}
