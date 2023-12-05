/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.web;


import graphql.app.entities.Author;
import graphql.app.entities.Book;
import graphql.app.graphql.params.AuthorInput;
import graphql.app.services.AuthorService;
import graphql.app.services.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        return bookService.bookById(Integer.valueOf(id));
    }

    @QueryMapping
    public Book[] allBooks() {
        return bookService.allBooks();
    }

    @MutationMapping
    public Book newBook(@Argument AuthorInput authorInput) {
        List<Author> authorsList = new ArrayList<>();

        for (Integer authorId : authorInput.getId()) {
            Author author = authorService.authorById(authorId);
            if (author != null) {
                authorsList.add(author);
            }
        }

        Book book = new Book();
        book.setBookName(authorInput.getBookName());
        book.setAuthors(authorsList);
        bookService.newBook(book);
        return book;
    }

}
