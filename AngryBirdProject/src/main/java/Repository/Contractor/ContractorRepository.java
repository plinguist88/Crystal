package Repository.Contractor;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ContractorDTO;

public class ContractorRepository {
	@Autowired
	SqlSession sqlSession;
	private final String namespace= "ContractorMapper";

	public void saveContractor(ContractorDTO conDTO) {
		// TODO Auto-generated method stub
		
		String statement = namespace + ".insertContractor";
		
		//계약자 ID 저장
		sqlSession.insert(statement, conDTO);
	}

	//계약자 리스트
	public List<ContractorDTO> selectContractors() {
		// TODO Auto-generated method stub
		String statement = namespace + ".selectAllContractors";
		List<ContractorDTO> list = sqlSession.selectList(statement);
		
		return list;
	}
	
	//계약자 상세보기
	public ContractorDTO selectOneContractor(String contractorId) {
		//저장한 ID정보를 가져오기
		String statement = namespace + ".selectOneContractor";
		ContractorDTO cdtoForDetail = sqlSession.selectOne(statement, contractorId);
		
		return cdtoForDetail;
	}

}
