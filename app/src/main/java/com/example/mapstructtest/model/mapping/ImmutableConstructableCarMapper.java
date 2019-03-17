package com.example.mapstructtest.model.mapping;

import org.mapstruct.factory.Mappers;

//@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ImmutableConstructableCarMapper {
	ImmutableConstructableCarMapper INSTANCE = Mappers.getMapper(ImmutableConstructableCarMapper.class);

	// Does not work
//	@Mapping(source = "numberOfSeats", target = "seatCount")
//	ImmutableConstructibleCarDto carToCarDto(ImmutableConstructableCar car);
}