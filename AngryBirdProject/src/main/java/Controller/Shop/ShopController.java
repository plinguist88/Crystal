package Controller.Shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import Command.ShopCommand;

@Controller
public class ShopController {

	@RequestMapping(value = "/shopMain")
	public String shopMain(ShopCommand shopCommand) {
		return "shop/shopRequest";
		
	}
	
}
