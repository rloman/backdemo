package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Model.Gebruiker;
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

	@GetMapping("/alleGebruikers")
	public Iterable<Gebruiker> alleGebruikers() {
		return gs.alleGebruikers();
	}
	
	@DeleteMapping("/remove/{naam}/{wachtwoord}")
	public void deleteGebruiker(@PathVariable String naam, @PathVariable String wachtwoord) {
		gs.deleteGebruiker(naam, wachtwoord);
	}
	
	@PutMapping("updateDisplay/{naam}/{wachtwoord}/{display}")
	public void updateDisplayNaam(@PathVariable String naam, @PathVariable String wachtwoord
								, @PathVariable String display) {
		gs.updateDisplay(naam, wachtwoord, display);
	}
	
	@PutMapping("updateDescription/{naam}/{wachtwoord}/{display}")
	public void updateDescription(@PathVariable String naam, @PathVariable String wachtwoord
								, @PathVariable String desc) {
		gs.updateDesc(naam, wachtwoord, desc);
	}
}
