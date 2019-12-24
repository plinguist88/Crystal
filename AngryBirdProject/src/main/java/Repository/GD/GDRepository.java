package Repository.GD;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.CandidateDTO;

public class GDRepository {
	@Autowired
	SqlSession sqlSession;
	
	private final String namespace= "GDMapper";

	public void savePassedCan(List<CandidateDTO> list) {
		// TODO Auto-generated method stub
		int result = 0;
		String statement = namespace + ".updatePassedCan";
		
		//sql문을 mapper에서는 한 번에 한개 밖에 생성못해서 구문 자체를 여러개 생성하고 싶은 경우 repository에서만 조작가능
		for(CandidateDTO cdto : list) {
			result = sqlSession.update(statement, cdto);
		}
		
	}

}
