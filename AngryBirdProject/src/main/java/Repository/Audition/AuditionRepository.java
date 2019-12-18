package Repository.Audition;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.AuditionDTO;

@Repository
public class AuditionRepository {

	@Autowired 
	private SqlSession sqlSession;	
	private final String namespace= "AuditionMapper";
	
	//audition insert
	public Integer auditionInsert(AuditionDTO auditionDTO) {
		int result = 0;
		String statement = namespace + ".insertAudition";
		result = sqlSession.insert(statement, auditionDTO);
		
		return result;
	}
	
	//audition selectAll
	public List<AuditionDTO> auditionSelectAll(){
		String statement = namespace + ".selectAuditions";
		List<AuditionDTO> auditions = sqlSession.selectList(statement);
		
		return auditions;
	}
	
	//audition selectOne
	public AuditionDTO auditionSelectOne(Integer auditionSeq){
		String statement = namespace + ".selectOneAudition";
		AuditionDTO oneAudition = sqlSession.selectOne(statement, auditionSeq);
		
		return oneAudition;
	}
	
	//audition - ongoing (진행중인 오디션만 보기)
	public List<AuditionDTO> auditionSelectForGD() {
		String statement = namespace + ".selectAuditionForGD";
		List<AuditionDTO> ongoingAuds = sqlSession.selectList(statement);
		
		return ongoingAuds;
	}
	
	//audition - finished (진행 완료 오디션만 보기)
	public List<AuditionDTO> auditionSelectFinished() {
		String statement = namespace + ".selectAuditionFinished";
		List<AuditionDTO> finishedAud = sqlSession.selectList(statement);
		
		return finishedAud;
	}
	
	
}
