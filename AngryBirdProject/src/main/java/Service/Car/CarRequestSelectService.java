package Service.Car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.CarRequestDTO;
import Repository.Car.CarRepository;

@Service
public class CarRequestSelectService {
	@Autowired
	CarRepository carRepository;
	
	// 차량 예약 목록 보기
	public void selectCarRequestListAll(Model model) {
		List<CarRequestDTO> carRequestList = carRepository.carRequestListSelectAll();
		model.addAttribute("carRequestList", carRequestList);
	}
}