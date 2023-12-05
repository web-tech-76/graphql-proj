/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.services;

import org.springframework.stereotype.Component;
import proj1.entities.Book;
import proj1.repositories.BookRepository;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@Component
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book bookById(int id){
        System.out.println(" getBookById called with id as ... " + id );
        return bookRepository.findById(id).get();
    }

    public Book[] allBooks(){
        System.out.println(" findAllBooks called ..." );
        Iterator<Book> bookIterator = bookRepository.findAll().iterator();
        List<Book> bookList = new LinkedList<>();

        while (null!= bookIterator && bookIterator.hasNext()){
            bookList.add(bookIterator.next());
        }

        return bookList.stream().toArray(Book[]::new);

    }

    public Book newBook(Book book){
        return bookRepository.save(book);
    }

}
