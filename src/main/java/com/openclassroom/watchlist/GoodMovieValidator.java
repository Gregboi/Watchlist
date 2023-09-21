package com.openclassroom.watchlist;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GoodMovieValidator implements ConstraintValidator<GoodMovie, WatchlistItem> {

    @Override
    public boolean isValid(WatchlistItem value, ConstraintValidatorContext constraintValidatorContext) {

        return !(Double.valueOf(value.getRating()) >= 8
                && "L".equals(value.getPriority().trim().toUpperCase()));
    }
}
