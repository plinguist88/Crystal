package Repository.Candidates;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.CandidateDTO;

public class CandidateRepository {
	@Autowired
	SqlSession sqlSession;
	private final String namespace= "CandidateMapper";

	//candidate register
	public Integer regCandidate(CandidateDTO cdto) {
		
		int result = 0;
		String statement = namespace + ".registerCandidate";
		result = sqlSession.insert(statement, cdto);
		
		return result;
	}

	//candidate selectAll per audition
	public List<CandidateDTO> selectAllperAud(Integer auditionSeq) {
		// TODO Auto-generated method stub
		
		String statement = namespace + ".candidateList";
		List<CandidateDTO> candidates = sqlSession.selectList(statement, auditionSeq);
		return candidates;
	}

}
