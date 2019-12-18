package Repository.Jumju;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.JumjuDTO;

@Repository
public class JumjuRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "Jumju.";
	
	// 점주 로그인
	public JumjuDTO jumjuLogin(JumjuDTO jumjuDTO) {
		
		String stmt = namespace + "jumjuCheck";
		jumjuDTO = sqlSession.selectOne(stmt, jumjuDTO);
		return jumjuDTO;
	}
	
	// 점주 회원 가입
	public Integer joinJumju(JumjuDTO jumjuDTO) {
		
		String stmt = namespace + "joinJumju";
		Integer result = sqlSession.insert(stmt, jumjuDTO);
		return result;
	}
}
