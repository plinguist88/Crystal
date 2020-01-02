package Controller.Shop;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.ShopRequestCommand;
import Command.ShopRequestProCommand;
import Service.Shop.ShopRequestManagerService;
import Service.Shop.ShopRequestService;

@Controller
public class ShopController {
	@Autowired
	ShopRequestService shopRequestService;
	
	@Autowired
	ShopRequestManagerService shopRequestManagerService;
	
	//숍 예약신청서 작성 페이지
	@RequestMapping(value = "/shopRequest", method = RequestMethod.GET)
	public String shopRequest(ShopRequestCommand shopRequestCommand, Model model, HttpSession httpSession) {
		shopRequestManagerService.findManager(httpSession, model);
		return "shop/shopRequest";
	}
	
	//숍 예약신청 확인 페이지
	@RequestMapping(value = "/shopRequestPro", method = RequestMethod.POST)
	public String shopRequestPro(ShopRequestProCommand shopRequestProCommand, Model model) {
		return "shop/shopRequestPro";
	}
}
