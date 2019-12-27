package Service.Car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Command.CarRequestCommand;
import Model.DTO.CarRequestDTO;
import Model.DTO.CarsDTO;
import Repository.Car.CarRepository;

@Service
public class CarRequestService {
	
	@Autowired
	CarRepository carRepository;
	
	public void cars(Model model) {
		
		
		List<CarsDTO> dto = carRepository.cars();
		
		if(dto != null) {
			model.addAttribute("cars", dto);
		}
		
	}
	
	public void join(CarRequestCommand carRequestCommand) {
		
		//CarRequestDTO dto = new CarRequestDTO();
		//dto.setEmployeeNum(carRequestCommand.getEmployeeNum());
	}
}
