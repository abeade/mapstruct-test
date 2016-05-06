package com.example.mapstructtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.mapstructtest.model.Car;
import com.example.mapstructtest.model.CarDto;
import com.example.mapstructtest.model.CarType;
import com.example.mapstructtest.model.mapping.CarMapper;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv_text);
	}


	@Override
	protected void onResume() {
		super.onResume();

		Car car = new Car();
		car.setConstructor("Audi");
		car.setNumberOfSeats(5);
		car.setType(CarType.LUXURY);

		CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        StringBuilder strb = new StringBuilder();
        strb.append(car.toString());
        strb.append('\n');
        strb.append('\n');
        strb.append(carDto.toString());

        tv.setText(strb.toString());
	}
}
