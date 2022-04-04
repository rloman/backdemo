package YCNextPraktijk.Praktijk.assembler;

import java.util.ArrayList;
import java.util.List;

import YCNextPraktijk.Praktijk.Model.CheckIn;
import YCNextPraktijk.Praktijk.dto.CheckinDTO;

public class CheckinAssembler {

	public CheckinDTO assemble (CheckIn checkin) {
		
		CheckinDTO dto = new CheckinDTO();
		dto.setBordspel(checkin.getBordspel());
		dto.setLocatie(checkin.getLocatie());
		dto.setRating(checkin.getRating());
		dto.setReview(checkin.getReview());
		dto.setWin(checkin.getWin());
		
		return dto;
	}

	public Iterable<CheckinDTO> alleCheckinDTOs(Iterable<CheckIn> it){
		List<CheckinDTO> DTOList = new ArrayList<>();
		
		for(CheckIn c: it) {
			CheckinDTO dto = assemble(c);
			DTOList.add(dto);
		}
	
		return DTOList;		
	}
	
}
