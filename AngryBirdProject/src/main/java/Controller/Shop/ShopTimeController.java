package Controller.Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.ShopCommand;
import Service.Shop.ShopService;

@Controller
public class ShopTimeController {
	
	@Autowired	//service 쓸 때 사용, xml에 있는 id와 이 페이지의 변수명이 동일해야 됨ㄴ
	ShopService shopService;
	
	@RequestMapping(value = "/shopAction", method = RequestMethod.POST)
	public String shopAction(ShopCommand shopCommand) {
		
		shopService.shopAction();
		
		return null;
	}
}
