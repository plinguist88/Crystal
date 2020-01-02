package Controller.Training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Command.TrainingCommand;
import Service.Contractor.ContractorUponLevelService;
import Service.Contractor.SelectContractorService;
import Service.Training.TrainingSelectService;
import Service.Training.TrainingUpdateService;
import Service.Training.TrainingUploadService;

@Controller
public class TrainingController {
	@Autowired
	TrainingUploadService trainingUploadService;
	@Autowired
	TrainingSelectService trainingSelectService;
	@Autowired
	SelectContractorService selectContractorService;
	@Autowired
	ContractorUponLevelService contractorUponLevelService;
	@Autowired
	TrainingUpdateService trainingUpdateService;

	//트레이닝 업로드 페이지로 가기
	@RequestMapping(value="/goTrainingUpload", method = RequestMethod.GET)
	public String goTrainingUpload(TrainingCommand trainingCommand, Model model) {
		
		return "trainings/training_register";
	}
	
	//트레이닝 내용 DB에 저장
	@RequestMapping(value="/trainingUpload", method = RequestMethod.POST)
	public String trainingRegister(TrainingCommand trainingCommand) {
		
		trainingUploadService.saveTraining(trainingCommand);
		
		return "redirect:trainings";
	}
	
	//트레이닝 리스트
	@RequestMapping(value="/trainings", method = RequestMethod.GET)
	public String trainingList(Model model) {
		
		trainingSelectService.selectTrainings(model);	
		return "trainings/training_list";
	}
	
	//트레이닝 상세보기
	@RequestMapping(value="/trainingDetail/{id}/{id2}", method = RequestMethod.GET)
	public String trainingDetail(@PathVariable("id") String trainingNum, @PathVariable("id2") String trainingLevel , Model model) {
		
		trainingSelectService.selectOneTraining(trainingNum, model);
		contractorUponLevelService.selectContractsUponLevel(trainingLevel, model);
		trainingUpdateService.selectContractors(trainingNum, model); //출력될 섹션 jsp페이지에 만들기
		return "trainings/training_detail";
	}	
	
	//트레이닝 상세보기 페이지에서 수강생 등록
	@RequestMapping(value="/updateTraining", method = RequestMethod.POST)
	public String updateTraining(@RequestParam("trainingNum") String trainingNum, @RequestParam("chosenContractors") String[] chosenContractors) {
		
		trainingUpdateService.addContractors(trainingNum, chosenContractors);
		return "redirect:trainingDetail/" + trainingNum;
	}	

	
}
