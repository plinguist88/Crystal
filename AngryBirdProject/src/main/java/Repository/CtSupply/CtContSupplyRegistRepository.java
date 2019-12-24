package Repository.CtSupply;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CtContSupplyDTO;

@Repository
public class CtContSupplyRegistRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ctSupplyMapper";
	
	public Integer getCtContSupplyRegist(CtContSupplyDTO ctContSupplyDTO) {
		
		String statement = namespace + ".ctContSupplyRegist";
		
		return sqlSession.insert(statement, ctContSupplyDTO);
		
	}
}
