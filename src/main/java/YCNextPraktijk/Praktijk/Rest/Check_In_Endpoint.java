package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Model.CheckIn;
import YCNextPraktijk.Praktijk.Persistence.Check_In_Service;


@RestController
@RequestMapping("api/checkins")
public class Check_In_Endpoint {
	@Autowired
	private Check_In_Service cis;
	
	@GetMapping
	public Iterable<CheckIn> alleCheckins() {
		System.out.println("alle checkins");
		return cis.geefCheckinsTerug();
	}
	
	//later aanpassen? handig voor tonen boordspelpagina
	@GetMapping("zoekcheckin")
	public Iterable<CheckIn> zoekCheckin(@RequestParam String bordspel){
		System.out.println("specific checkin");
		return cis.zoekCheckin(bordspel);
	}
	
	//OefenFunctie - later aanpassen voor gemiddelde rating bordspel
	@GetMapping("aantalcheckins")
	public void aantalCheckins() {
		System.out.println("aantal checkins");
		cis.allesTellen();
	}
}
