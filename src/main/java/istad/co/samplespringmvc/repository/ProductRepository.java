package istad.co.samplespringmvc.repository;

import istad.co.samplespringmvc.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

// Data Access Object - DAO

@Repository
public class ProductRepository {
    //create list of product storing data
    private final List<Product> allProducts = new ArrayList<>(){{
        add(Product.builder()
                .id(1)
                .title("product title one ")
                .description("this is the product one description")
                .price(3.4f)
                .imageUrl("productimageone.jpg")
                .build());
        add(Product.builder()
                .id(2)
                .title("product title two ")
                .description("this is the product two description")
                .price(3.4f)
                .imageUrl("productimagetwo.jpg")
                .build());
        add(Product.builder()
                .id(3)
                .title("product title three ")
                .description("this is the product one description")
                .price(3.4f)
                .imageUrl("productimagethree.jpg")
                .build());
    }};
    //method retrieve all data in allProducts
    public List<Product> getAllProducts(){
        return allProducts;
    }
    //method add more product in Product
    public void addProduct(Product product){
        allProducts.add(product);
    }
    public void updateProduct(Product product){
        // need find the index of the product
        int index = allProducts.indexOf(
                allProducts.stream()
                        .filter(pro->pro.getId()==product.getId())
                        .findFirst()
                        .orElse(null)
        ) ;
        allProducts.set(index,product);
    }
}
