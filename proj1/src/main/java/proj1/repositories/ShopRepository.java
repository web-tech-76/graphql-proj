/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.repositories;

import graphql.app.entities.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ShopRepository extends JpaRepository<Shop, Integer>, JpaSpecificationExecutor {
}
