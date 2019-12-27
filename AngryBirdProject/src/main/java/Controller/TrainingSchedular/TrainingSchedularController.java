package Controller.TrainingSchedular;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TrainingSchedularController {
	@RequestMapping("/goTrainingSchedular")
	public String goTrainingSchedular() {
		
		return "trainings/training_schedular";
	}
}
