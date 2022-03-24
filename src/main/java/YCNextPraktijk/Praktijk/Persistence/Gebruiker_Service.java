package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import YCNextPraktijk.Praktijk.Model.Gebruiker;

@Service
public class Gebruiker_Service {
	@Autowired
	private Gebruiker_Repository gr;
	
	public void slaGebruikerOp(String gn, String ww, String dn, String desc) {
		Gebruiker geb = new Gebruiker();
		geb.setGebruikersNaam(gn);
		geb.setWachtwoord(ww);
		geb.setDisplayNaam(dn);
		geb.setBeschrijving(desc);
		gr.save(geb);
	}
	
	public Iterable<Gebruiker> alleGebruikers() {
		return gr.findAll();
	}
}
