package com.example.mapstructtest.model.mapping;

import org.mapstruct.factory.Mappers;

//@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AutoValueFluentMapper {
	AutoValueFluentMapper INSTANCE = Mappers.getMapper(AutoValueFluentMapper.class);

	// does not work for fluent, error 'Unmapped target properties: "constructor, count, type" (if leaving out @Mapping), otherwise No property named "numberOfSeats"
	// Its mentioned for FreeBuilder in reference http://mapstruct.org/documentation/stable/reference/html/ for at time of mapstruct 1.3
//	@Mapping(source = "numberOfSeats", target = "seatCount")
//	AutoValueFluentCarDto toDto(AutoValueFluentCar car);
}