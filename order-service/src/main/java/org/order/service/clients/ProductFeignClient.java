package org.order.service.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("catalog-service")
public interface ProductFeignClient {

    @GetMapping(value = "/products/{id}")
    Object existsById(@PathVariable String id);
}
