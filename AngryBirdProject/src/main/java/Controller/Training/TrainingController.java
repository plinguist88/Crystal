package Controller.Training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Command.TrainingCommand;
import Service.Training.TrainingSelectService;
import Service.Training.TrainingUploadService;

@Controller
public class TrainingController {
	@Autowired
	TrainingUploadService trainingUploadService;
	@Autowired
	TrainingSelectService trainingSelectService;

	//트레이닝 업로드 페이지로 가기
	@RequestMapping(value="/goTrainingUpload", method = RequestMethod.GET)
	public String goTrainingUpload(TrainingCommand trainingCommand) {
		
		return "trainings/training_register";
	}
	
	//트레이닝 내용 DB에 저장
	@RequestMapping(value="/trainingUpload", method = RequestMethod.POST)
	public String trainingRegister(TrainingCommand trainingCommand) {
		
		trainingUploadService.saveTraining(trainingCommand);
		
		return "trainings/training_list";
	}
	
	//트레이닝 리스트
	@RequestMapping(value="/trainings", method = RequestMethod.GET)
	public String trainingList(Model model) {
		
		trainingSelectService.selectTrainings(model);		
		return "trainings/training_list";
	}
	
	//트레이닝 상세보기
	@RequestMapping(value="/trainingDetail/{id}", method = RequestMethod.GET)
	public String trainingDetail(@PathVariable("id") String trainingNum, Model model) {
		
		trainingSelectService.selectOneTraining(trainingNum, model);		
		return "trainings/training_detail";
	}	
	
	
	
}
