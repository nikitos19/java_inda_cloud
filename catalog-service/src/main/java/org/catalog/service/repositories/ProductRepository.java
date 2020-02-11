package org.catalog.service.repositories;

import org.catalog.service.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {
}
