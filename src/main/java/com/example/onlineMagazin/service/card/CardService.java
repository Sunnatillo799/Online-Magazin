package com.example.onlineMagazin.service.card;

import com.example.onlineMagazin.dto.card.CardCreateDto;
import com.example.onlineMagazin.dto.card.CardDto;
import com.example.onlineMagazin.dto.card.CardUpdateDto;
import com.example.onlineMagazin.dto.language.LanguageUpdateDto;
import com.example.onlineMagazin.entity.card.Card;
import com.example.onlineMagazin.entity.language.Language;
import com.example.onlineMagazin.mappers.card.CardMapper;
import com.example.onlineMagazin.repository.card.CardRepository;
import com.example.onlineMagazin.response.Response;
import com.example.onlineMagazin.service.AbstractService;
import com.example.onlineMagazin.service.auth.AuthUserService;
import com.example.onlineMagazin.validator.card.CardValidator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CardService extends AbstractService<CardRepository, CardMapper, CardValidator> {

    private final AuthUserService authUserService;

    protected CardService(CardRepository repository, CardMapper mapper, CardValidator validator, AuthUserService authUserService) {
        super(repository, mapper, validator);
        this.authUserService = authUserService;
    }

    public ResponseEntity<List<CardDto>> getAll() {
        List<Card> all = repository.findAll();
        List<CardDto> cardDtos = new ArrayList<>();
        for (Card card : all) {
            CardDto cardDto = mapper.toDto(card);
            cardDto.setUserId(card.getUserId().getId());
            cardDtos.add(cardDto);
        }
        return new ResponseEntity<>(cardDtos, HttpStatus.OK);
    }

    public ResponseEntity<CardDto> getById(Long id) {
        Card card = repository.getById(id);
        CardDto cardDto = mapper.toDto(card);
        cardDto.setUserId(card.getUserId().getId());
        return new ResponseEntity<>(cardDto, HttpStatus.OK);
    }

    public ResponseEntity<Response> delete(Long id) {
        repository.delete(repository.getById(id));
        return new ResponseEntity<>(new Response("Successfully deleted Card", HttpStatus.OK.value()), HttpStatus.OK);
    }

    public ResponseEntity<Response> create(CardCreateDto cardCreateDto) {
        Card card = mapper.fromCreateDto(cardCreateDto);
        card.setUserId(authUserService.getById(cardCreateDto.getUserId()));
        repository.save(card);
        return new ResponseEntity<>(new Response("Successfully created Card", HttpStatus.OK.value()), HttpStatus.OK);
    }

    public ResponseEntity<Response> update(CardUpdateDto cardUpdateDto) {
        Optional<Card> byId = repository.findById(cardUpdateDto.getId());
        Card card = byId.get();
        card.setPan(cardUpdateDto.getPan());
        card.setCard_type(cardUpdateDto.getCard_type());
        card.setHolder_name(cardUpdateDto.getHolder_name());
        card.setUpdatedAt(LocalDateTime.now());
        repository.save(card);
        return new ResponseEntity<>(new Response("Successfully updated Card", HttpStatus.OK.value()), HttpStatus.OK);
    }

}
