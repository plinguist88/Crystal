package Repository.CtSupply;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.CtSupplyDTO;

@Repository
public class CtSupplyRegistRepository {
	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "ctSupplyMapper";

	public Integer setCtSupplyRegist(CtSupplyDTO ctSupplyDTO) {

		String statement = namespace + ".ctSupplyRegist";
		
		return sqlSession.insert(statement, ctSupplyDTO);
	}

}
