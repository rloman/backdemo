package YCNextPraktijk.Praktijk.assembler;

import org.springframework.stereotype.Component;

import YCNextPraktijk.Praktijk.Model.Gebruiker;
import YCNextPraktijk.Praktijk.dto.GebruikerDTO;

@Component
public class GebruikerAssembler {
	
	public GebruikerDTO assemble (Gebruiker gebruiker) {
		
		GebruikerDTO dto = new GebruikerDTO();
		dto.setBeschrijving(gebruiker.getbeschrijving());
		dto.setDisplayNaam(gebruiker.getDisplayNaam());
		dto.setProfilePicture(gebruiker.getProfilePicture());
		
		return dto;
	}	
}
