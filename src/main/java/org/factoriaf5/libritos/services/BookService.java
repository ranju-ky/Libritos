package org.factoriaf5.libritos.services;
import org.factoriaf5.libritos.models.Book;
import org.factoriaf5.libritos.models.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> allBooks() {
        List<Book> allBooks = (List<Book>) bookRepository.findAll();
        return allBooks;
    }

    public void save(Book book) {
        bookRepository.save(book);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

}