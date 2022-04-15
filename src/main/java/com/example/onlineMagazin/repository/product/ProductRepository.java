package com.example.onlineMagazin.repository.product;

import com.example.onlineMagazin.entity.product.Product;
import com.example.onlineMagazin.entity.userCart.AuthUserCart;
import com.example.onlineMagazin.repository.AbstractRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.awt.*;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, AbstractRepository, JpaSpecificationExecutor<Product> {
    List<Product> findAllByDeletedFalse(Pageable request);

    Optional<Product> findByIdAndDeletedFalse(Long id);

    List<Product> findAllByNameContains(String word);

    @Transactional
    @Modifying
    @Query(value = "select online_store.public.product.*,\n" +
            "       online_store.public.product_color.color_id,\n" +
            "       online_store.public.product_size.size_id,\n" +
            "       online_store.public.product_rating.rating_type_id\n" +
            "from online_store.public.product\n" +
            "         full outer join online_store.public.product_color on product.id = product_color.product_id\n" +
            "         full outer join online_store.public.product_size on product.id = product_size.product_id\n" +
            "         full outer join online_store.public.product_rating on product.id = product_rating.product_id;", nativeQuery = true)
    List<Product> filter();
}
