package Service.Training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import Model.DTO.TrainingTakeDTO;
import Repository.Training.TrainingRepository;

@Service
public class TrainingUpdateService {
	@Autowired
	TrainingRepository trainingRepository;
	List<TrainingTakeDTO> list = new ArrayList<TrainingTakeDTO>();

	// 트레이닝 상세보기에서 수강생추가하기
	public void addContractors(String trainingNum, String chosenContractorsTxt) {
		// TODO Auto-generated method stub
		System.out.println("1: "+chosenContractorsTxt);
		String[] chosens = chosenContractorsTxt.split(",");

		for (String contractor : chosens) {
			TrainingTakeDTO tDTO = new TrainingTakeDTO();
			tDTO.setTrainingNum(trainingNum);
			tDTO.setContractorId(contractor);
			System.out.println(tDTO.getContractorId()); 
			System.out.println(tDTO.getTrainingNum());
			list.add(tDTO);
		}

		
		for(TrainingTakeDTO t : list) {
			System.out.println("t: "+t.getContractorId()+" t: "+t.getTrainingNum()); 
		}
		trainingRepository.addContractorToTraining(list);
		 
	}
	

	
	

}
