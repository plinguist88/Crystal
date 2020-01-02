package Repository.Training;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.TrainingDTO;
import Model.DTO.TrainingTakeDTO;

@Repository
public class TrainingRepository {
	@Autowired
	SqlSession sqlSession;	
	private final String namespace= "TrainingMapper";

	public void saveTraining(TrainingDTO tDTO) {
		// TODO Auto-generated method stub
		String statement = namespace + ".insertTraining";
		sqlSession.insert(statement, tDTO);
	}

	public List<TrainingDTO> selectAllTrainings() {
		// TODO Auto-generated method stub
		String statement = namespace + ".selectAllTrainings";
		List<TrainingDTO> list = sqlSession.selectList(statement);
		return list;
	}

	public TrainingDTO selectOneTraining(String trainingNum) {
		// TODO Auto-generated method stub
		String statement = namespace + ".oneTraining" ;
		TrainingDTO tDTO = sqlSession.selectOne(statement, trainingNum);
		return tDTO;
	}

	public void addContractorToTraining(List<TrainingTakeDTO> list) {
		// TODO Auto-generated method stub
		String statement = namespace + ".addContractorToTraining" ;
		for(TrainingTakeDTO tDTO : list) {
			sqlSession.insert(statement, tDTO);
		}
		
	}
	
	//트레이닝에 등록된 수강생 가져오기
	public List<TrainingTakeDTO> selectContractorPerTraining(String trainingNum) {
		// TODO Auto-generated method stub
		String statement = namespace + ".selectContractorsPerTraining" ;

		List<TrainingTakeDTO> list = sqlSession.selectList(statement, trainingNum);
		return list;
	}
	
	

}
