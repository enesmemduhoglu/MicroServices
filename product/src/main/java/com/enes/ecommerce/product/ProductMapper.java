package com.enes.ecommerce.product;

import com.enes.ecommerce.category.Category;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {

    public Product toProduct(ProductRequest request) {
        Category category = new Category();
        category.setId(request.categoryId());

        Product product = new Product();
        product.setId(request.id());
        product.setName(request.name());
        product.setDescription(request.description());
        product.setPrice(request.price());
        product.setAvailableQuantity(request.availableQuantity());
        product.setCategory(category);

        return product;
    }

    public ProductResponse toProductResponse(Product product) {
            return new ProductResponse(
                    product.getId(),
                    product.getName(),
                    product.getDescription(),
                    product.getAvailableQuantity(),
                    product.getPrice(),
                    product.getCategory().getId(),
                    product.getCategory().getName(),
                    product.getCategory().getDescription()
            );
    }

    public ProductPurchaseResponse toProductPurchaseResponse(Product product, double quantity) {
        return new ProductPurchaseResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                quantity
        );
    }
}
