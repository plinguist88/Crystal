package Repository.Employee;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.DTO.EmployeeDTO;

@Repository
public class EmployeeRepository {

	@Autowired
	private SqlSession sqlSession;
	
	private final String namespace = "Employee.";	// 직원 DAO
	
	// 직원 가입 시 직종선택 select
	public List<EmployeeDTO> selectJopt() {
		
		String stmt = namespace + "employeeJopt";
		return sqlSession.selectList(stmt);
	}
	
	// 직원 가입 시 부서선택 select
	public List<EmployeeDTO> selectDept() {
		
		String stmt = namespace + "employeeDept";
		return sqlSession.selectList(stmt);
		
	}
	
	// 직원 로그인
	public EmployeeDTO employeeLogin(EmployeeDTO employeeDTO) {
		
		String stmt = namespace + "employeeCheck";
		employeeDTO = sqlSession.selectOne(stmt, employeeDTO);
		return employeeDTO;
	}
	
	// 직원 가입
	public Integer joinEmployee(EmployeeDTO employeeDTO) {
		
		String stmt = namespace + "joinEmployee";
		Integer result = sqlSession.insert(stmt, employeeDTO);
		
		return result;
	}
}
