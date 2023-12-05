/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proj1.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
