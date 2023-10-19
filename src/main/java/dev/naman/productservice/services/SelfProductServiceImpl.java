package dev.naman.productservice.services;

import dev.naman.productservice.dtos.GenericProductDto;
import dev.naman.productservice.models.Category;
import dev.naman.productservice.models.Price;
import dev.naman.productservice.models.Product;
import dev.naman.productservice.repositories.CategoryRepository;
import dev.naman.productservice.repositories.PriceRepository;
import dev.naman.productservice.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
@Service("selfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService {
private ProductRepository productRepository;
private PriceRepository priceRepository;
private CategoryRepository categoryRepository;
    @Override
    public GenericProductDto getProductById(Long id) {
      Optional<Product> product=  productRepository.findById(UUID.fromString(id.toString()));

        return mapperforgenericproductDto(product.get());
    }

    @Override
    public GenericProductDto createProduct(GenericProductDto product) {
        Category category = new Category();
        category.setName(product.getCategory());
        Category savedCategory = categoryRepository.save(category);

        Price price =new Price();
        price.setPrice(product.getPrice());
        Price productprice = priceRepository.save(price);

        Product  product1 = new Product();
        product.setTitle(product1.getTitle());
        product.setDescription(product1.getDescription());
        product1.setCategory(savedCategory);
        product1.setPrice(productprice);
        Product savedproduct = productRepository.save(product1);
        return mapperforgenericproductDto(product1);
    }

    @Override
    public List<GenericProductDto> getAllProducts() {
        List<GenericProductDto> productDtos = new ArrayList<>();

        productRepository.findAll().
                forEach((product)-> productDtos.add(mapperforgenericproductDto(product)));
        return productDtos;
    }

    @Override
    public GenericProductDto deleteProduct(Long id) {

        return null;
    }
    public GenericProductDto mapperforgenericproductDto(Product product){

        GenericProductDto genericProductDto= new GenericProductDto();
        genericProductDto.setTitle(product.getTitle());
        genericProductDto.setDescription(product.getDescription());
        genericProductDto.setPrice(product.getPrice().getPrice());
        genericProductDto.setCategory(product.getCategory().getName());


        return genericProductDto;
    }
}
