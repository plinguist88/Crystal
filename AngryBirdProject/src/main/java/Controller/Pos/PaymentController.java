package Controller.Pos;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import Model.DTO.SalesDTO;

import Service.Goods.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	@ResponseBody
	public String payment (SalesDTO salesDTO, HttpSession session, HttpServletRequest request) {//@RequestBody Map<String, Object> map, 
		System.out.println(salesDTO.getItemsNo());
		System.out.println(salesDTO.getItemsName());
		System.out.println(salesDTO.getItemsCount());
		System.out.println(salesDTO.getItemsPrice());
		
		paymentService.payment(salesDTO, session, request);
		session.invalidate();
		return "store/pos1";
	}
}
