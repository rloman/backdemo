package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Persistence.Gebruiker_Service;

@RestController
public class Gebruiker_Endpoint {
	@Autowired
	private Gebruiker_Service gs;
	
	@PostMapping("/new/{naam}/{wachtwoord}/{display}/{desc}")
	public void nieuweGebruiker(@PathVariable String naam, @PathVariable String wachtwoord
								, @PathVariable String display, @PathVariable String desc) {
		gs.slaGebruikerOp(naam, wachtwoord, display, desc);	
	}

}
