package com.example.onlineMagazin.controller.productImage;

import com.example.onlineMagazin.controller.AbstractController;
import com.example.onlineMagazin.dto.language.LanguageCreateDto;
import com.example.onlineMagazin.dto.language.LanguageUpdateDto;
import com.example.onlineMagazin.dto.productImage.ImageCreateDto;
import com.example.onlineMagazin.dto.productImage.ImageUpdateDto;
import com.example.onlineMagazin.entity.language.Language;
import com.example.onlineMagazin.entity.product.ProductImage;
import com.example.onlineMagazin.response.Response;
import com.example.onlineMagazin.service.product.ImageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductImageController extends AbstractController<ImageService> {

    public ProductImageController(ImageService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/product/image/update", method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody ImageUpdateDto imageUpdateDto) {
        return service.update(imageUpdateDto);
    }

    @RequestMapping(value = PATH + "/product/image/list", method = RequestMethod.GET)
    public ResponseEntity<List<ProductImage>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/product/image/{id}", method = RequestMethod.GET)
    public ResponseEntity<ProductImage> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @RequestMapping(value = PATH + "/product/image/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @RequestMapping(value = PATH + "/product/image/create", method = RequestMethod.POST)
    public ResponseEntity<Response> create(@RequestBody ImageCreateDto imageCreateDto) {
        return service.create(imageCreateDto);
    }
}
