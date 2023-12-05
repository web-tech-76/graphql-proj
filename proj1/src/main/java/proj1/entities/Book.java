/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_name" , nullable = false)
    private String bookName;

    @OneToMany(targetEntity = Author.class, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Author> authors;
}
