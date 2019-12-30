package Controller.CtFood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CtFoodController {
	@RequestMapping(value="/ctFood", method=RequestMethod.GET)
	public String ctFood() {
		return "ctFood/ctFood";
	}
}
