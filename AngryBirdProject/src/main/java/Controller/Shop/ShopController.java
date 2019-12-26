package Controller.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.JoinCommand;
import Command.ShopRequestCommand;
import Service.Shop.ShopRequestService;
import Validator.JoinCommandValidator;

@Controller
public class ShopController {
	
	@Autowired
	ShopRequestService shopRequestService;
	
	// SHOP 예약신청서 작성 페이지
	@RequestMapping(value = "/shopRequest", method = RequestMethod.GET)
	public String shopRequest(ShopRequestCommand shopRequestCommand, Model model) {
		return "shop/shopRequest";
	}
	
	// SHOP 숍 예약신청 확인 페이지
	
	
	
}
