package com.example.mapstructtest.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueCarDto {
    public abstract String constructor();
    public abstract int seatCount();
    public abstract CarType type();

    public static Builder builder() {
        return new AutoValue_AutoValueCarDto.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setConstructor(String value);
        public abstract Builder setSeatCount(int value);
        public abstract Builder setType(CarType value);
        public abstract AutoValueCarDto build();
    }
}