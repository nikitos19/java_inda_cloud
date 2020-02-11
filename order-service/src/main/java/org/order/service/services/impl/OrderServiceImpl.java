package org.order.service.services.impl;

import org.order.service.clients.ProductFeignClient;
import org.order.service.entities.Order;
import org.order.service.repositories.OrderRepository;
import org.order.service.services.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepository orderRepository;
    @Resource
    private ProductFeignClient productFeignClient;

    @Override
    public Order save(String productId, Long quantity) {
        if (productFeignClient.existsById(productId) == null) {
            throw new RuntimeException("product does not exist");
        }
        Order order = new Order(null, productId, quantity);
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getById(String orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new RuntimeException("order does not exist"));
    }
}
