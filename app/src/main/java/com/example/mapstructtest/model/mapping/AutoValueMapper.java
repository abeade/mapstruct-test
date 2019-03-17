package com.example.mapstructtest.model.mapping;

import com.example.mapstructtest.model.AutoValueCar;
import com.example.mapstructtest.model.AutoValueCarDto;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AutoValueMapper {
	AutoValueMapper INSTANCE = Mappers.getMapper(AutoValueMapper.class);

	@Mapping(source = "numberOfSeats", target = "seatCount")
	AutoValueCarDto toDto(AutoValueCar car);
}