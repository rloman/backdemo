package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
		System.out.println("Adding user " + gn);
		try {gr.save(geb);}
		catch (DataIntegrityViolationException e) {
			System.out.println(e);
		}
	}
	
	public Iterable<Gebruiker> alleGebruikers() {
		return gr.findAll();
	}
	
	public void deleteGebruiker(String gn, String ww) {
		Iterable<Gebruiker> all = gr.findAll();
		for (Gebruiker g : all) {
			if (g.getGebruikersNaam().equals(gn) && g.getWachtwoord().equals(ww)) {
				System.out.println("Deleting user "+g.getGebruikersNaam());
				gr.delete(g);
			}
		}
	}
	
	public void updateDisplay(String gn, String ww, String dn) {
		Iterable<Gebruiker> all = gr.findAll();
		for (Gebruiker g : all) {
			if (g.getGebruikersNaam().equals(gn) && g.getWachtwoord().equals(ww)) {
				System.out.println("Updating displayName for user "+g.getGebruikersNaam());
				g.setDisplayNaam(dn);
			}
		}
	}
	
	public void updateDesc(String gn, String ww, String desc) {
		Iterable<Gebruiker> all = gr.findAll();
		for (Gebruiker g : all) {
			if (g.getGebruikersNaam().equals(gn) && g.getWachtwoord().equals(ww)) {
				System.out.println("Updating description for user "+g.getGebruikersNaam());
				g.setBeschrijving(desc);
			}
		}
	}
}
