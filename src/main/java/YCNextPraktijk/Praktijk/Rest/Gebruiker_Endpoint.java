package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Model.CheckIn;
import YCNextPraktijk.Praktijk.Model.Gebruiker;
import YCNextPraktijk.Praktijk.Persistence.Gebruiker_Service;

@RestController
public class Gebruiker_Endpoint {
	@Autowired
	private Gebruiker_Service gs;
	
	@PostMapping("/new")
	public void nieuweGebruiker(@RequestBody Gebruiker geb) {
		gs.slaGebruikerOp(geb);	
	}

	@PostMapping("/newCheckIn/{id}")
	public void nieuweCheckin(@RequestBody CheckIn c, @PathVariable long id) {
		gs.newCheckIn(id, c);
	}
	
	@GetMapping("/alleGebruikers")
	public Iterable<Gebruiker> alleGebruikers() {
		return gs.alleGebruikers();
	}
	
	@GetMapping("/login/{naam}")//geen wachtwoord voor nu
	public long login(@PathVariable String naam) {
		return gs.findGebruikerID(naam);
	}
	
	@GetMapping("alleCheckins/{id}")
	public Iterable<CheckIn> alleCheckins(@PathVariable long id) {
		return gs.alleCheckins(id)
;	}
	
	@DeleteMapping("/remove/{id}")
	public void deleteGebruiker(@PathVariable long id) {
		gs.deleteGebruiker(id);
	}
	
	@PutMapping("update/{id}")
	public void updateDisplayNaam(@RequestBody Gebruiker geb, @PathVariable long id) {
		gs.update(geb, id);
	}
}
