package Service.JumjuJoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Command.JumjuJoinCommand;
import Encrypt.Encrypt;
import Model.DTO.JumjuDTO;
import Repository.Jumju.JumjuRepository;

@Service
public class JumjuJoinService {

	@Autowired
	private JumjuRepository jumjuRepository;
	
	public Integer jumjuJoinAction (JumjuJoinCommand jumjuJoinCommand) {
		
		Integer result = null;
		JumjuDTO jumjuDTO = new JumjuDTO();
		try {
			jumjuDTO.setStoreOwnerId("J" + jumjuJoinCommand.getStoreContractDay() + jumjuJoinCommand.getStoreCodeNum() );
			jumjuDTO.setStoreOwnerPw(Encrypt.getEncryption(jumjuJoinCommand.getStoreOwnerPw() ) );
			jumjuDTO.setStoreOwnerName(jumjuJoinCommand.getStoreOwnerName() );
			jumjuDTO.setStoreNo(jumjuJoinCommand.getStoreNo() );
			jumjuDTO.setStoreOwnerBank(jumjuJoinCommand.getStoreOwnerBank() );
			jumjuDTO.setStoreOwnerAccount(jumjuJoinCommand.getStoreOwnerAccount() );
			jumjuDTO.setStoreOwnerPhone(jumjuJoinCommand.getStoreOwnerPhone() );
			jumjuDTO.setStoreOwnerAddr(jumjuJoinCommand.getStoreOwnerAddr() );
			jumjuDTO.setStoreOwnerCalculMoney(0);/* jumjuJoinCommand.getStoreOwnerCalculMoney() */ 
			jumjuDTO.setStoreCodeNum(jumjuJoinCommand.getStoreCodeNum() );
			jumjuDTO.setStoreContractDay(jumjuJoinCommand.getStoreContractDay() );
			
			result = jumjuRepository.joinJumju(jumjuDTO);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		return result;
	}
}
