package Service.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.Car.CarRepository;

@Service
public class CarViewListService {
	
	@Autowired
	CarRepository carRepository;
	
}
