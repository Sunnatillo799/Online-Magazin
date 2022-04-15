package com.example.onlineMagazin.validator.card;

import com.example.onlineMagazin.dto.card.CardCreateDto;
import com.example.onlineMagazin.dto.card.CardUpdateDto;
import com.example.onlineMagazin.validator.AbstractValidator;
import org.springframework.stereotype.Component;

import javax.xml.bind.ValidationException;

@Component
public class CardValidator extends AbstractValidator<CardCreateDto, CardUpdateDto, Long> {
    @Override
    public void validateKey(Long id) throws ValidationException {

    }

    @Override
    public void validateOnCreate(CardCreateDto cardCreateDto) throws ValidationException {

    }

    @Override
    public void validateOnUpdate(CardUpdateDto cardUpdateDto) throws ValidationException {

    }
}
