package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Model.CheckIn;
import YCNextPraktijk.Praktijk.Model.Gebruiker;
import YCNextPraktijk.Praktijk.Persistence.Gebruiker_Service;
import YCNextPraktijk.Praktijk.dto.CheckinDTO;

@RestController
@RequestMapping("api/gebruikers")
public class Gebruiker_Endpoint {
	@Autowired
	private Gebruiker_Service gs;
	
	@GetMapping
	public Iterable<Gebruiker> alleGebruikers() {
		return gs.alleGebruikers();
	}
	
	@PostMapping
	public void nieuweGebruiker(@RequestBody Gebruiker geb) {
		gs.slaGebruikerOp(geb);	
	}

	@PutMapping("{id}")
	public void updateDisplayNaam(@RequestBody Gebruiker geb, @PathVariable long id) {
		gs.update(geb, id);
	}
	
	@DeleteMapping("{id}")
	public void deleteGebruiker(@PathVariable long id) {
		gs.deleteGebruiker(id);
	}
	
	@GetMapping("login/{naam}")
	public long login(@PathVariable String naam) {
		return gs.findGebruikerID(naam);
	}
	
	@GetMapping("allecheckins/{id}")
	public Iterable<CheckinDTO> alleCheckins(@PathVariable long id) {
		return gs.alleCheckins(id);	
	}
	
	@PostMapping("newcheckin/{id}")
	public void nieuweCheckin(@RequestBody CheckIn c, @PathVariable long id) {
		gs.newCheckIn(id, c);
	}
}
