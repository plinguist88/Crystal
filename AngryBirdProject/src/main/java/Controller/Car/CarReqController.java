package Controller.Car;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Command.CarReqCommand;
import Model.DTO.EmployeeInfo;
import Service.Car.CarReqService;

@Controller
public class CarReqController {
	@Autowired
	CarReqService carReqService; 
	
	@RequestMapping("/car/carReq")
	public String carReq(CarReqCommand carReqCommand, HttpServletRequest request) {
		return "car/car";
	}
	
	@RequestMapping("/car/carReqConfirm")
	public String carReqConfirm(CarReqCommand carReqCommand, 
			@RequestParam(value="carRequestPassengerNum") Long passenger) {
		carReqService.carReq(carReqCommand, passenger);
		
		return "car/carReqConfirm";
	}
}
