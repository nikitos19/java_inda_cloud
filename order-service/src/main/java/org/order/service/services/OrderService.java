package org.order.service.services;

import org.order.service.entities.Order;

import java.util.List;

public interface OrderService {
    Order save(String productId, Long quantity);

    List<Order> getAll();

    Order getById(String orderId);
}
