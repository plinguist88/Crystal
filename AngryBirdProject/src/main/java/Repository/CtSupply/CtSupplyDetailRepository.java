package Repository.CtSupply;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CtSupplyDTO;

@Repository
public class CtSupplyDetailRepository {

	@Autowired
	SqlSession sqlSession;
	
	private final String namespace = "ctSupplyMapper";
	
	public CtSupplyDTO getCtSupplyDetail(String scNo) {

		System.out.println("ctSupplyDetailRepository...");
		
		String statement = namespace + ".ctSupplyDetail";
		
		CtSupplyDTO ctSupplyDTO = sqlSession.selectOne(statement, scNo);
		
		return ctSupplyDTO;
	}
}
