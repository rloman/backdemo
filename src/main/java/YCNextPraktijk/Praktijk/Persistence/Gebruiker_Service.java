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
	
	public void deleteGebruiker(String gn, String ww) {
		Gebruiker g = gr.findByGebruikersNaamAndWachtwoord(gn, ww);
		System.out.println("Deleting user "+g.getGebruikersNaam());
		gr.delete(g);
	}
	
	public void updateDisplay(String gn, String ww, String dn) {
		Gebruiker g = gr.findByGebruikersNaamAndWachtwoord(gn, ww);
		System.out.println("Updating displayName for user "+g.getGebruikersNaam());
		g.setDisplayNaam(dn);
	}
	
	public void updateDesc(String gn, String ww, String desc) {
		Gebruiker g = gr.findByGebruikersNaamAndWachtwoord(gn, ww);
		System.out.println("Updating description for user "+g.getGebruikersNaam());
		g.setbeschrijving(desc);
	}
}
