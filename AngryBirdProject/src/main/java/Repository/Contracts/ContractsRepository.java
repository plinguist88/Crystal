package Repository.Contracts;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import Model.DTO.ContractsDTO;

public class ContractsRepository {
	@Autowired
	SqlSession sqlSession;
	static final String namespace= "SignatureMapper";
	
	public void saveContracts(ContractsDTO ctDTO) {
		// TODO Auto-generated method stub
		String statement = namespace + ".insertSignature";
		sqlSession.insert(statement, ctDTO);
	}

	//모든 계약서 리스트 불러오기
	public List<ContractsDTO> selectAllContracts() {
		// TODO Auto-generated method stub
		String statement = namespace + ".selectAllContracts";
		List<ContractsDTO> list = sqlSession.selectList(statement);
		
		return list;
	}

	//계약서 상세보기
	public ContractsDTO selectOneContract(String contractNum) {
		// TODO Auto-generated method stub
		String statement = namespace + ".selectOneContract" ;
		ContractsDTO ctDTO = sqlSession.selectOne(statement, contractNum);
		
		return ctDTO;
	}
	
	

}
