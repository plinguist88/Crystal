package Repository.Contractor;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ContractorDTO;

public class ContractorRepository {
	@Autowired
	SqlSession sqlSession;
	private final String namespace= "ContractorMapper";

	public ContractorDTO saveContractor(ContractorDTO conDTO) {
		// TODO Auto-generated method stub
		
		String statement = namespace + ".insertContractor";
		
		//계약자 ID 저장
		sqlSession.insert(statement, conDTO);
		
		//저장한 ID정보를 가져오기
		statement = namespace + ".selectOneContractor";
		String contractorId = conDTO.getContractorId();
		ContractorDTO cdtoForDetail = sqlSession.selectOne(statement, contractorId);
		
		return cdtoForDetail;
	}

}
