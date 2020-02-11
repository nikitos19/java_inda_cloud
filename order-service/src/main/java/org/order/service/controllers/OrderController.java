package org.order.service.controllers;

import org.order.service.entities.Order;
import org.order.service.services.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAll();
    }

    @GetMapping(value = "/{orderId}")
    public Order getOrder(@PathVariable String orderId) {
        return orderService.getById(orderId);
    }

    @PostMapping(consumes = "application/json")
    public Order createOrder(@RequestParam String productId, @RequestParam Long quantity) {
        return orderService.save(productId, quantity);
    }
}
