package Service.Candidates;

import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import Command.CandidatesCommand;
import Model.DTO.CandidateDTO;
import Repository.Candidates.CandidateRepository;

@Service
public class CandidateRegisterService {
	@Autowired
	CandidateRepository candidateRepository;

	public Integer register(CandidatesCommand candidatesCommand, HttpServletRequest request, Model model) {
		int result = 0;

		CandidateDTO cdto = new CandidateDTO();
		//지원자 정보 저장 (지원자 번호는 - CD + 성별 + 지원자생년월일)
		cdto.setCandidateName(candidatesCommand.getCandidateName());
		cdto.setCandidateGender(candidatesCommand.getCandidateGender());
		cdto.setCandidateBirth(candidatesCommand.getCandidateBirth());
		cdto.setCandidatePh(candidatesCommand.getCandidatePh());
		cdto.setCandidateAddr(candidatesCommand.getCandidateAddr());
		cdto.setAuditionSeq(candidatesCommand.getAuditionSeq());
		cdto.setCandidateNum("CD"+cdto.getCandidateBirth()+"_"+cdto.getAuditionSeq());
		
		//서버에 파일 저장하기
		MultipartFile mf = candidatesCommand.getCandidateVideo();
		//파일의 원래이름 가져오기
		String original= mf.getOriginalFilename();
		//확장자 가지고오기. 마지막에 있는 '.'으로부터의 문자열을 가져오는 형태
		String originalFileExtension = original.substring(original.lastIndexOf("."));
		//랜덤으로 부여해준 파일명과 확장자 합치기
		String store= UUID.randomUUID().toString().replaceAll("-", "") //toString() = 숫자를 문자열로 바꿈
				+ originalFileExtension; 
		//Spring은 defaultRenamePolicy가 없어서 파일이름이 중복일 때 1, 2, 3, 등을 붙여서 저장되는 이름 다르게 하기 위해 UUID클래스를 사용. 랜덤으로 붙여줌
		//파일 사이즈 구하기
		Long fileSize = mf.getSize();		
		
		//저장할 경로
		String path = request.getRealPath("/"); //C:\Programming\JAVA\Maven_workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\AngryBirdProject
		path += "\\WEB-INF\\view\\candidates\\upload\\"; // 또는 '/'
		File file = new File(path+store);

		//실제 저장경로 보기
		System.out.println("실제저장경로: "+file);
		
		try {
			mf.transferTo(file); //실제로 서버에 업로드 하는 메소드 
			
			System.out.println("글쓰기 완료: ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		cdto.setOriginalFilename(original);
		cdto.setStoreFilename(store);
		cdto.setFileSize(fileSize);
		
		//지원자 총점은 null인경우 화면에서 출력될 때 상위에 위치하므로, 값을 0점으로 먼저 주기.
		cdto.setTotalScore(0);
		
		System.out.println("Name: "+cdto.getCandidateName());
		System.out.println("Gender: "+cdto.getCandidateGender());
		System.out.println("Birth: "+cdto.getCandidateBirth());
		System.out.println("Ph: "+cdto.getCandidatePh());
		System.out.println("Addr: "+cdto.getCandidateAddr());
		System.out.println("Num: "+cdto.getCandidateNum());
		System.out.println("Seq: "+cdto.getAuditionSeq());
		System.out.println("Filename: "+cdto.getOriginalFilename());
		System.out.println("StoreFilename: "+cdto.getStoreFilename());
		System.out.println("FileSize: "+cdto.getFileSize());
		

		result = candidateRepository.regCandidate(cdto);
		
		model.addAttribute("cdto", cdto);

		return result;
	}

}
