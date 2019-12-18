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
	//candidate 상세보기
	public CandidateDTO oneCandidate(String candidateNum) {
		// TODO Auto-generated method stub
		
		String statement = namespace + ".oneCandidate";
		CandidateDTO cdto = sqlSession.selectOne(statement, candidateNum);

		return cdto;
	}

	//평가 점수 등록하기 - DB에는 업데이트임!
	public void InsertEvaluation(CandidateDTO cdto) {
		// TODO Auto-generated method stub
		
		String statement = namespace + ".candidateForEval";
		sqlSession.update(statement, cdto);
	}

}
