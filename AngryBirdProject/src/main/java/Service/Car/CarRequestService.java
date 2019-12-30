package Service.Car;

import java.text.SimpleDateFormat;
import java.util.Date;
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
		CarRequestDTO cad = new CarRequestDTO();
		
		//sysdate를 date로 변환 및 자동생성 cad.setCarRequestRentalNum(carRequestCommand.getEmployeeNum() + today);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
		String today = sdf.format(date);
		
		cad.setCarRegNum(carRequestCommand.getCarRegNum1());
		cad.setCarRequestRentalNum(carRequestCommand.getEmployeeNum() +'-'+ today);
		cad.setEmployeeNum(carRequestCommand.getEmployeeNum());
		cad.setCarType(carRequestCommand.getCarType());
		cad.setCarRequestPassengerNum(Integer.parseInt(carRequestCommand.getCarPassengerNum()));
		cad.setFrom(carRequestCommand.getFrom());
		cad.setTo(carRequestCommand.getTo());
		
		carRepository.insertCarRequest(cad);
		
	}
}
