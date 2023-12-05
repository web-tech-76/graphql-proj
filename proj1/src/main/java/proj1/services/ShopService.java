/*
 * Copyright (c) All rights reserved , The code is solely property of shantanu valsangikar coping and using it for any purpose is violation of law.
 */

package proj1.services;

import org.springframework.stereotype.Component;
import proj1.entities.Shop;
import proj1.repositories.ShopRepository;

@Component
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }

    public Iterable<Shop> allShops() {
        return shopRepository.findAll();

    }

    public Shop shoById(int id) {
        return shopRepository.findById(id).get();
    }


}
