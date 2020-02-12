package org.order.service.clients;

import org.springframework.stereotype.Component;

@Component
public class ProductFeignClientFallback implements ProductFeignClient {
    @Override
    public Object existsById(String id) {
        return null;
    }
}
