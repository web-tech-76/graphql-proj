/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Collection;

//@Entity
//@Table(name = "book_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "order_date" , nullable = false)
    private LocalDateTime orderDate;

    @OneToMany
    private Collection<Book> books;

    private Integer quantity;

    private Double totalPrice;

    private String orderedBy;

}
