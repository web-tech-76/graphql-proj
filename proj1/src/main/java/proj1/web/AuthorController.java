/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.web;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import proj1.entities.Author;
import proj1.services.AuthorService;

import java.util.List;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @QueryMapping
    public Author authorById(@Argument int authorId){
        return authorService.authorById(authorId);
    }

    @QueryMapping
    public Author[] allAuthors(){
        List<Author> authorList = authorService.allAuthors();
        return authorList.stream().toArray(Author[]::new);
    }

    @MutationMapping
    public Author newAuthor(@Argument String name) {
        Author author = new Author();
        author.setName(name);
        return authorService.newAuthor(author);
    }


}
