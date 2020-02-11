package org.order.service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
public class Order {
    private String id;
    private String productId;
    private Long quantity;
}
