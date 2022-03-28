package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import YCNextPraktijk.Praktijk.Model.Gebruiker;

@Service
public class Gebruiker_Service {
	@Autowired
	private Gebruiker_Repository gr;
	
	public void slaGebruikerOp(Gebruiker geb) {
		System.out.println("Adding user " + geb.getGebruikersNaam());
		try {gr.save(geb);}
		catch (DataIntegrityViolationException e) {
			System.out.println(e);
		}
	}
	
	public Iterable<Gebruiker> alleGebruikers() {
		return gr.findAll();
	}
	
	public void deleteGebruiker(long id) {
		System.out.println("Deleting user "+gr.findById(id).get().getGebruikersNaam());
		gr.deleteById(id);
	}
	
	public void update(Gebruiker geb, long id) {
		Gebruiker geb2 = gr.findById(id).get();
		System.out.println("Updating user "+geb2.getGebruikersNaam());
		geb2.setGebruikersNaam(geb.getGebruikersNaam());
		geb2.setWachtwoord(geb.getWachtwoord());
		geb2.setDisplayNaam(geb.getDisplayNaam());
		geb2.setbeschrijving(geb.getbeschrijving());
		gr.save(geb2);
	}

}
