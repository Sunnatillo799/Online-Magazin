package com.example.onlineMagazin.mappers.feedback;

import com.example.onlineMagazin.dto.feedback.FeedbackCreateDto;
import com.example.onlineMagazin.dto.feedback.FeedbackDto;
import com.example.onlineMagazin.dto.feedback.FeedbackUpdateDto;
import com.example.onlineMagazin.entity.feedback.Feedback;
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
public class FeedbackMapperImpl implements FeedbackMapper {

    @Override
    public FeedbackDto toDto(Feedback feedback) {
        if ( feedback == null ) {
            return null;
        }

        FeedbackDto feedbackDto = new FeedbackDto();

        feedbackDto.setMessage( feedback.getMessage() );

        return feedbackDto;
    }

    @Override
    public List<FeedbackDto> toDto(List<Feedback> e) {
        if ( e == null ) {
            return null;
        }

        List<FeedbackDto> list = new ArrayList<FeedbackDto>( e.size() );
        for ( Feedback feedback : e ) {
            list.add( toDto( feedback ) );
        }

        return list;
    }

    @Override
    public Feedback fromCreateDto(FeedbackCreateDto feedbackCreateDto) {
        if ( feedbackCreateDto == null ) {
            return null;
        }

        Feedback feedback = new Feedback();

        feedback.setMessage( feedbackCreateDto.getMessage() );

        return feedback;
    }

    @Override
    public Feedback fromUpdateDto(FeedbackUpdateDto d) {
        if ( d == null ) {
            return null;
        }

        Feedback feedback = new Feedback();

        feedback.setId( d.getId() );
        feedback.setMessage( d.getMessage() );

        return feedback;
    }
}
