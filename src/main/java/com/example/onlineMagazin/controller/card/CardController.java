package com.example.onlineMagazin.controller.card;

import com.example.onlineMagazin.controller.AbstractController;
import com.example.onlineMagazin.dto.card.CardCreateDto;
import com.example.onlineMagazin.dto.card.CardDto;
import com.example.onlineMagazin.dto.card.CardUpdateDto;
import com.example.onlineMagazin.response.Response;
import com.example.onlineMagazin.service.card.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CardController extends AbstractController<CardService> {

    public CardController(CardService service) {
        super(service);
    }

    @RequestMapping(value = PATH + "/card/update", method = RequestMethod.PUT)
    public ResponseEntity<Response> update(@RequestBody CardUpdateDto cardUpdateDto) {
        return service.update(cardUpdateDto);
    }

    @RequestMapping(value = PATH + "/card/list", method = RequestMethod.GET)
    public ResponseEntity<List<CardDto>> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = PATH + "/card/{id}", method = RequestMethod.GET)
    public ResponseEntity<CardDto> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @RequestMapping(value = PATH + "/card/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @RequestMapping(value = PATH + "/card/create", method = RequestMethod.POST)
    public ResponseEntity<Response> create(@RequestBody CardCreateDto cardCreateDto) {
        return service.create(cardCreateDto);
    }
}
