package Service.Training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.TrainingCommand;
import Model.DTO.TrainingDTO;
import Repository.Training.TrainingRepository;

@Service
public class TrainingUploadService {
	@Autowired
	TrainingRepository trainingRepository;
	
	public void saveTraining(TrainingCommand trainingCommand) {
		// TODO Auto-generated method stub
		TrainingDTO tDTO = new TrainingDTO();
		tDTO.setTrainingNum("T"+trainingCommand.getTrainingStartDate()+"S"+trainingCommand.getTrainingLevel().substring(4));
		tDTO.setTrainingLevel(trainingCommand.getTrainingLevel());
		tDTO.setTrainingStartDate(trainingCommand.getTrainingStartDate());
		tDTO.setTrainingEndDate(trainingCommand.getTrainingEndDate());
		tDTO.setTrainingCurriculum(trainingCommand.getEditordata());
		
		trainingRepository.saveTraining(tDTO);
	}

}
