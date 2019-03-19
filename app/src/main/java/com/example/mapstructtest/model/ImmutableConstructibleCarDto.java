package com.example.mapstructtest.model;

public class ImmutableConstructibleCarDto {
	private final String constructor;
	private final int seatCount;
	private final String type;

	public ImmutableConstructibleCarDto() {
		this(null, 0, null);
	}

	public ImmutableConstructibleCarDto(String constructor, int seatCount, String type) {
		this.constructor = constructor;
		this.seatCount = seatCount;
		this.type = type;
	}

	public String getConstructor() {
		return constructor;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "CarDto{" +
				"constructor='" + constructor + '\'' +
				", seatCount=" + seatCount +
				", type='" + type + '\'' +
				'}';
	}
}
