package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.ImmutableConstructableCar;
import com.example.mapstructtest.model.ImmutableConstructibleCarDto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

//@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR)
@Mapper
public interface ImmutableConstructableCarMapper {
	ImmutableConstructableCarMapper INSTANCE = Mappers.getMapper(ImmutableConstructableCarMapper.class);

	// Does not work, no mapping code is generated, and it fails if @Mapping annotation is included
//	@Mapping(source = "numberOfSeats", target = "seatCount")
	ImmutableConstructibleCarDto carToCarDto(ImmutableConstructableCar car);
}