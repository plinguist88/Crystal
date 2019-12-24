package Repository.Contractor;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ContractorDTO;

public class ContractorRepository {
	@Autowired
	SqlSession sqlSession;
	private final String namespace= "ContractorMapper";

	public Integer saveContractor(ContractorDTO conDTO) {
		// TODO Auto-generated method stub
		int result = 0;
		
		String statement = namespace + ".insertContractor";
		sqlSession.insert(statement, conDTO);
		
		return result;
	}

}
