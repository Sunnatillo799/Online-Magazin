package com.example.onlineMagazin.controller.userCart;

import com.example.onlineMagazin.controller.AbstractController;
import com.example.onlineMagazin.dto.userCart.AuthUserCartCreateDto;
import com.example.onlineMagazin.dto.userCart.AuthUserCartUpdateDto;
import com.example.onlineMagazin.dto.userCart.CartFullDto;
import com.example.onlineMagazin.entity.userCart.AuthUserCart;
import com.example.onlineMagazin.response.Response;
import com.example.onlineMagazin.service.userCart.AuthUserCartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthUserCartController extends AbstractController<AuthUserCartService> {

    public AuthUserCartController(AuthUserCartService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/auth/cart/update", method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody AuthUserCartUpdateDto authUserCartUpdateDto) {
        return service.update(authUserCartUpdateDto);
    }

    @RequestMapping(value = PATH + "/auth/cart/list/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<CartFullDto>> getAll(@PathVariable Long id) {
        return service.getAll(id);
    }

    @RequestMapping(value = PATH + "/auth/cart/{id}", method = RequestMethod.GET)
    public ResponseEntity<AuthUserCart> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @RequestMapping(value = PATH + "/auth/cart/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @RequestMapping(value = PATH + "/auth/cart/create", method = RequestMethod.POST)
    public ResponseEntity<Response> create(@RequestBody AuthUserCartCreateDto authUserCartCreateDto) {
        return service.create(authUserCartCreateDto);
    }

    @RequestMapping(value = PATH + "/auth/cart/updateCarts", method = RequestMethod.PUT)
    public ResponseEntity<Response> updateAll(@RequestBody List<AuthUserCartUpdateDto> dtos) {
        return service.updateAll(dtos);
    }

    @RequestMapping(value = PATH + "/auth/cart/sumCartPrice/{id}", method = RequestMethod.GET)
    public ResponseEntity<Integer> getSumPrice(@PathVariable Long id) {
        return service.sumCartPrice(id);
    }

}
