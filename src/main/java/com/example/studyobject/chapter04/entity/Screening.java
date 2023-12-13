package com.example.studyobject.chapter04.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
public class Screening {
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Money calculateFee(int audienceCount){
        switch (movie.getMovieType()) {
            case AMOUNT_DISCOUNT:
                if(movie.isDiscountable(whenScreened, sequence)){
                    return movie.calculateAmoutDiscountedFee().times(audienceCount);
                }
                break;
            case PERCENT_DISCOUNT:
                if(movie.isDiscountable(whenScreened, sequence)){
                    return movie.calculatePercentDiscountedFee().times(audienceCount);
                }
            case NONE_DISCOUNT:
                return movie.calculateNoneDiscountedFee().times(audienceCount);
        }

        return movie.calculateNoneDiscountedFee().times(audienceCount);
    }
}
