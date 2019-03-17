package com.example.mapstructtest.model;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueFluentCar {
    public abstract String constructor();
    public abstract int numberOfSeats();
    public abstract CarType type();

    public static Builder builder() {
        return new AutoValue_AutoValueFluentCar.Builder();
    }

    @AutoValue.Builder
    public abstract static class Builder {
        public abstract Builder setConstructor(String value);
        public abstract Builder setNumberOfSeats(int value);
        public abstract Builder setType(CarType value);
        public abstract AutoValueFluentCar build();
    }
}