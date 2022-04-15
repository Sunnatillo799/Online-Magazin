package com.example.onlineMagazin.service.userCart;

import com.example.onlineMagazin.dto.productImage.ImageDto;
import com.example.onlineMagazin.dto.productImage.ImagePathDto;
import com.example.onlineMagazin.dto.userCart.AuthUserCartCreateDto;
import com.example.onlineMagazin.dto.userCart.AuthUserCartUpdateDto;
import com.example.onlineMagazin.dto.userCart.CartFullDto;
import com.example.onlineMagazin.entity.product.Product;
import com.example.onlineMagazin.entity.userCart.AuthUserCart;
import com.example.onlineMagazin.mappers.userCart.AuthUserCartMapper;
import com.example.onlineMagazin.repository.authUser.AuthUserRepository;
import com.example.onlineMagazin.repository.product.ProductRepository;
import com.example.onlineMagazin.repository.userCart.AuthUserCartRepository;
import com.example.onlineMagazin.response.Response;
import com.example.onlineMagazin.service.AbstractService;
import com.example.onlineMagazin.service.product.ImageService;
import com.example.onlineMagazin.validator.userCart.AuthUserCartValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AuthUserCartService extends AbstractService<AuthUserCartRepository, AuthUserCartMapper, AuthUserCartValidator> {

    private final ProductRepository productRepository;
    private final AuthUserRepository authUserRepository;
    private final ImageService imageService;

    protected AuthUserCartService(AuthUserCartRepository repository, AuthUserCartMapper mapper, AuthUserCartValidator validator, ProductRepository productRepository, AuthUserRepository authUserRepository, ImageService imageService) {
        super(repository, mapper, validator);
        this.productRepository = productRepository;
        this.authUserRepository = authUserRepository;
        this.imageService = imageService;
    }

    public ResponseEntity<List<CartFullDto>> getAll(Long id) {
        List<AuthUserCart> carts = repository.findAuthUserCartsByAuthUserById(id);
        List<CartFullDto> fullCarts = new ArrayList<>();
        for (AuthUserCart cart : carts) {
            if (Objects.nonNull(cart)){
                fullCarts.add(toFullCartDto(cart));
            }
        }
        return  new ResponseEntity<>( fullCarts,HttpStatus.OK);
    }

    private CartFullDto toFullCartDto(AuthUserCart cart) {
        CartFullDto cartFullDto = new CartFullDto();
        cartFullDto.setProduct(cart.getProduct());
        cartFullDto.setImage(getMainImage(cart.getProduct()));
        return cartFullDto;
    }

    private ImagePathDto getMainImage(Product product) {
        ImageDto body = imageService.getByMain(product.getId()).getBody();
        return new ImagePathDto(body.getId(), body.getImage_path());
    }

    public ResponseEntity<AuthUserCart> getById(Long id) {
        return new ResponseEntity<>(repository.getById(id), HttpStatus.OK);
    }

    public ResponseEntity<Response> delete(Long id) {
        repository.delete(repository.getById(id));
        return new ResponseEntity<>(new Response("Successfully deleted Auth User Cart", HttpStatus.OK.value()), HttpStatus.OK);
    }

    public ResponseEntity<Response> create(AuthUserCartCreateDto authUserCartCreateDto) {
        AuthUserCart authUserCart = mapper.fromCreateDto(authUserCartCreateDto);
        authUserCart.setAuthUser(authUserRepository.findById(authUserCartCreateDto.getUserId()).get());
        authUserCart.setProduct(productRepository.getById(authUserCartCreateDto.getProductId()));
        repository.save(authUserCart);
        return new ResponseEntity<>(new Response("Successfully created Auth User Cart", HttpStatus.OK.value()), HttpStatus.OK);
    }

    public ResponseEntity<Response> update(AuthUserCartUpdateDto authUserCartUpdateDto) {
        Optional<AuthUserCart> byId = repository.findById(authUserCartUpdateDto.getId());
        AuthUserCart authUserCart = byId.get();
        authUserCart.setAccept(authUserCartUpdateDto.getAccept());
        authUserCart.setCount(authUserCartUpdateDto.getCount());
        authUserCart.setUpdatedAt(LocalDateTime.now());
        repository.save(authUserCart);
        return new ResponseEntity<>(new Response("Successfully updated Auth User Cart", HttpStatus.OK.value()), HttpStatus.OK);
    }

    public ResponseEntity<Response> updateAll(List<AuthUserCartUpdateDto> dtos) {
        for (AuthUserCartUpdateDto dto : dtos) {
            update(dto);
        }
        return new ResponseEntity<>(new Response("Successfully updated Auth User Cart",
                HttpStatus.OK.value()), HttpStatus.OK);
    }

    public ResponseEntity<Integer> sumCartPrice(Long userId) {
        List<AuthUserCart> carts = repository.findAuthUserCartsByAuthUserById(userId);
        return new ResponseEntity<>(carts.stream().mapToInt(cart -> (int) (cart.getCount() * cart.getProduct().getPrice())).sum(),HttpStatus.OK);
    }
}
