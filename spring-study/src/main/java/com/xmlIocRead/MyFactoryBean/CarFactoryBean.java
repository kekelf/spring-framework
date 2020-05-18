package com.xmlIocRead.MyFactoryBean;

import org.springframework.beans.factory.FactoryBean;

import com.entity.Car;

public class CarFactoryBean implements FactoryBean<Car>{
	public String carInfo;
	
	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		String[] infos = carInfo.split(",");
		car.setBrand(infos[0]);
		car.setMaxSpeed(Integer.valueOf(infos[1]));
		car.setPrice(Double.valueOf(infos[2]));
		
		return car;
	}
	
	/**
	 * 直接在这里设置单例
	 */
	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}

	@Override
	public Class<Car> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
