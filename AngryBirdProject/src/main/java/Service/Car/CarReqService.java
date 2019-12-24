package Service.Car;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.CarReqCommand;
import Model.DTO.CarRequestDTO;
import Repository.Car.CarReqRepository;

@Service
public class CarReqService {
	@Autowired
	CarReqRepository carReqRepository;
	
	public void carReq(CarReqCommand carReqCommand,  Long passenger) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		String num = sdf.format(date);
		CarRequestDTO dto = new CarRequestDTO(num+carReqCommand.getEmployeeNum(),
				carReqCommand.getCarRequestRentalDate(), 
				carReqCommand.getCarRequestReturnDate(), 
				carReqCommand.getCarRequestType(), 
				passenger, 
				"NOT", 
				carReqCommand.getEmployeeNum());
		Integer result = carReqRepository.insertCarReq(dto);
		if(result >0) {
			System.out.println("신청 성공");
		}else {
			System.out.println("신청 실패");
		}
		
	}
	
}
