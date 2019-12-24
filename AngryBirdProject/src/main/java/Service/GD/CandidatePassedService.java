package Service.GD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.DTO.CandidateDTO;
import Repository.GD.GDRepository;


@Service
public class CandidatePassedService {
	@Autowired
	GDRepository gdRepository;

	public void savePassed(String[] passedCan) {
		//cdto들을 넣을 리스트 생성
		
		for(int i=0; i<passedCan.length;i++) {
			System.out.println("id: "+passedCan[i]);
		}

		//배열로 받아온 값들을 List로 저장하기 위해 LIST객체 생성
		List<CandidateDTO> list = new ArrayList<CandidateDTO>();
		
		//합격자의 passed 컬럼에 1 입력		
		for(String p : passedCan) {
			CandidateDTO cdto = new CandidateDTO();
			cdto.setCandidateNum(p);
			cdto.setPassed(1);
			System.out.println("지원자번호: "+ cdto.getCandidateNum());
			System.out.println("합격여부: "+ cdto.getPassed());
			list.add(cdto);
		}
		
		//리스트에 잘 담겼나 확인해보기
		for(CandidateDTO cdto : list) {
			System.out.println("cdto: "+cdto.getCandidateNum());
			System.out.println("cdto: "+cdto.getPassed());
		}
		
		//LIST객체를 Map에 담기    ==> 실패. 이유: mybatis mapper에서는 sql구문을 여러개를 생성하는 것이 안됨. 반복문을 돌리는것도 한 sql문 내에서 인자값들을 여러개 나열하는 것은 가능하나, sql문 자체를 여러개를 생성하는 것은 불가능
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("cdtos",list);
		
		gdRepository.savePassedCan(list);
	}

}
