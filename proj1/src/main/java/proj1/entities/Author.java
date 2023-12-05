/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  //  @EqualsAndHashCode.Include()
    private Integer id;

    @Column(name = "author_name", nullable = false)
    private String name;

}
