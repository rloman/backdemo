package YCNextPraktijk.Praktijk.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bordspel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	private String naam;
	private float gemiddeld;
	private int totaal;
	private String uitgever;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public float getGemiddeld() {
		return gemiddeld;
	}
	public void setGemiddeld(float gemiddeld) {
		this.gemiddeld = gemiddeld;
	}
	public int getTotaal() {
		return totaal;
	}
	public void setTotaal(int totaal) {
		this.totaal = totaal;
	}
	public String getUitgever() {
		return uitgever;
	}
	public void setUitgever(String uitgever) {
		this.uitgever = uitgever;
	}
	
	

}
