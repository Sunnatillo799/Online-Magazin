package com.example.onlineMagazin.mappers.card;

import com.example.onlineMagazin.dto.card.CardCreateDto;
import com.example.onlineMagazin.dto.card.CardDto;
import com.example.onlineMagazin.dto.card.CardDto.CardDtoBuilder;
import com.example.onlineMagazin.dto.card.CardUpdateDto;
import com.example.onlineMagazin.entity.card.Card;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-15T14:24:00+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17 (Oracle Corporation)"
)
@Component
public class CardMapperImpl implements CardMapper {

    @Override
    public CardDto toDto(Card card) {
        if ( card == null ) {
            return null;
        }

        CardDtoBuilder cardDto = CardDto.builder();

        cardDto.pan( card.getPan() );
        cardDto.card_type( card.getCard_type() );
        cardDto.holder_name( card.getHolder_name() );

        return cardDto.build();
    }

    @Override
    public List<CardDto> toDto(List<Card> e) {
        if ( e == null ) {
            return null;
        }

        List<CardDto> list = new ArrayList<CardDto>( e.size() );
        for ( Card card : e ) {
            list.add( toDto( card ) );
        }

        return list;
    }

    @Override
    public Card fromCreateDto(CardCreateDto cardCreateDto) {
        if ( cardCreateDto == null ) {
            return null;
        }

        Card card = new Card();

        card.setPan( cardCreateDto.getPan() );
        card.setCard_type( cardCreateDto.getCard_type() );
        card.setHolder_name( cardCreateDto.getHolder_name() );

        return card;
    }

    @Override
    public Card fromUpdateDto(CardUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Card card = new Card();

        card.setId( d.getId() );
        card.setPan( d.getPan() );
        card.setCard_type( d.getCard_type() );
        card.setHolder_name( d.getHolder_name() );

        return card;
    }
}
