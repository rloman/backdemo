package YCNextPraktijk.Praktijk.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gebruiker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	@Column(unique=true)
	private String gebruikersNaam;
	private String wachtwoord; // TODO: Use security tools
	private String displayNaam;
	private String Beschrijving;
	//private String socialMedia;
	//private String profilePicture;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGebruikersNaam() {
		return gebruikersNaam;
	}
	public void setGebruikersNaam(String gebruikersNaam) {
		this.gebruikersNaam = gebruikersNaam;
	}
	public String getWachtwoord() {
		return wachtwoord;
	}
	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}
	public String getDisplayNaam() {
		return displayNaam;
	}
	public void setDisplayNaam(String displayNaam) {
		this.displayNaam = displayNaam;
	}
	public String getBeschrijving() {
		return Beschrijving;
	}
	public void setBeschrijving(String beschrijving) {
		Beschrijving = beschrijving;
	}

}
