package Repository.Training;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.TrainingDTO;

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
	

}
