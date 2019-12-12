package Controller.Cafeteria;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeteriaMainController {
	@RequestMapping("/cafeteriaMain")
	public String cafeteriaMain() {
		return "cafeteria/cafeteriaMain";
	}
}
