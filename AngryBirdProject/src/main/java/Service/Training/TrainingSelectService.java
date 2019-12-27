package Service.Training;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.TrainingDTO;
import Repository.Training.TrainingRepository;

@Service
public class TrainingSelectService {
	@Autowired
	TrainingRepository trainingRepository;

	//트레이닝 리스트
	public void selectTrainings(Model model) {
		// TODO Auto-generated method stub
		
		List<TrainingDTO> tDTOs = trainingRepository.selectAllTrainings();
		model.addAttribute("tDTOs", tDTOs);
	}

	//트레이닝 상세보기
	public void selectOneTraining(String trainingNum, Model model) {
		// TODO Auto-generated method stub
		TrainingDTO tDTO = trainingRepository.selectOneTraining(trainingNum);
		model.addAttribute("tDTO", tDTO);
	}

}
