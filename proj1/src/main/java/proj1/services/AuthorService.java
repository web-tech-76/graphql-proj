/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.services;

import org.springframework.stereotype.Service;
import proj1.entities.Author;
import proj1.repositories.AuthorRepository;

import java.util.List;

@Service
public class AuthorService{


    private final AuthorRepository authorRepository;


    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author newAuthor(Author author){
        return authorRepository.save(author);
    }

    public Author authorById(int authorId){
        return authorRepository.findById(authorId).get();
    }

    public List<Author> allAuthors(){
        return authorRepository.findAll();
    }

}
