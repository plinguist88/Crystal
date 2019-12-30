package Controller.Car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.CarRequestCommand;
import Service.Car.CarRequestSelectService;
import Service.Car.CarRequestService;

@Controller
public class CarController {
	@Autowired
	CarRequestService carRequestService; 
	@Autowired
	CarRequestSelectService carRequestSelectService;
	
	//carRequestList 페이지에서 버튼을 눌러서 차량 예약신청서 작성 페이지로 이동
	@RequestMapping(value = "/carRequest", method = RequestMethod.GET)
	public String carRequest(CarRequestCommand carRequestCommand, Model model) {
		
		carRequestService.cars(model);
		return "car/carRequest";
	}
	
	//header에서 carRequestList 페이지로 가기. 일반 버튼 눌러서 이동하는 건 GET
	//command는 입력하는 페이지로 이동할 때, 또는 회원가입창 같은 곳에서 DB로 넘겨줄 때 사용
	// model 역할 - select 할 때 사용. DB에서 받아올 때. view로 전달하는 역할, view에서 model에 담은 데이터를 활용하려면 ${ }(expression language)를 써야한다.
	@RequestMapping(value = "/carRequestList", method = RequestMethod.GET)
	public String carRequestList (Model model) {
		
		carRequestSelectService.selectCarRequestListAll(model);
		return "car/carRequestList";
	}
	
	// 차량 예약신청 완료 후 다음에 나오는  페이지
	@RequestMapping(value = "/carRequestPro", method = RequestMethod.POST)
	public String joinAction (CarRequestCommand carRequestCommand, Model model) {
		
		carRequestService.cars(model);
		carRequestService.join(carRequestCommand);
		
		return "car/carRequestPro";
	}
}
