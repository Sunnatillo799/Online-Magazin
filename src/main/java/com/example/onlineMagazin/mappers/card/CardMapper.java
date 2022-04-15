package com.example.onlineMagazin.mappers.card;

import com.example.onlineMagazin.dto.card.CardCreateDto;
import com.example.onlineMagazin.dto.card.CardDto;
import com.example.onlineMagazin.dto.card.CardUpdateDto;
import com.example.onlineMagazin.entity.card.Card;
import com.example.onlineMagazin.mappers.BaseMapper;
import org.hibernate.annotations.Target;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface CardMapper extends BaseMapper<Card, CardDto, CardCreateDto, CardUpdateDto> {
    @Override
    @Mapping(target = "userId", ignore = true)
    CardDto toDto(Card card);

    @Override
    List<CardDto> toDto(List<Card> e);

    @Override
    @Mapping(target = "userId", ignore = true)
    Card fromCreateDto(CardCreateDto cardCreateDto);

    @Override
    @Mapping(target = "userId", ignore = true)
    Card fromUpdateDto(CardUpdateDto d);
}
