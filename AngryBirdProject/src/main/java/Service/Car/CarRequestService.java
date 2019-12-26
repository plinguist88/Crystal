package Service.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.CarRequestCommand;
import Repository.Car.CarRepository;

@Service
public class CarRequestService {
	
	@Autowired
	CarRepository carRepository;
	
	public void cars(Model model) {
		carRepository.cars();
	}
	
	public void join(CarRequestCommand carRequestCommand) {
		
	}
}
