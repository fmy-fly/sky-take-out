package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ShoppingCartService {



    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    List<ShoppingCart> showShoppingCart();

    void cleanShoppingCart();
}
