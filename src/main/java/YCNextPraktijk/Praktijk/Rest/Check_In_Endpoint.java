package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Model.Check_In;
import YCNextPraktijk.Praktijk.Persistence.Check_In_Service;


@RestController
public class Check_In_Endpoint {
	@Autowired
	private Check_In_Service cis;
	
	
	@GetMapping("/zoekcheckin/{query}")
	public Iterable <Check_In> eenCheckin(@RequestParam String bordspel){
		System.out.println("specific checkin");
		return cis.zoekCheckin(bordspel);
	}
	
	@GetMapping("/allecheckins")
	public Iterable<Check_In> alleCheckins() {
		System.out.println("alle checkins");
		return cis.geefCheckinsTerug();
	}
	
	@GetMapping("/aantalcheckins")
	public void aantalCheckins() {
		System.out.println("aantal checkins");
		cis.allesTellen();
	}
	
	@GetMapping("/checkin/{spel}/{locatie}/{rating}/{review}/{win}")
	public void slaNieuweCheck_InOp(@PathVariable String spel, @PathVariable String locatie, @PathVariable float rating,
			@PathVariable String review, @PathVariable boolean win) {
		System.out.println("test: " + spel);
		Check_In ci = new Check_In();
		ci.setBordspel(spel); ci.setLocatie(locatie); 
		ci.setRating(rating); ci.setReview(review); 
		ci.setWin(win);
		cis.slaDezeCheck_InOp(ci);
	}
	@PostMapping("/test2")
	public void testPostMethode(@RequestBody Check_In checkin) {
		System.out.println(checkin.getReview());
		cis.slaDezeCheck_InOp(checkin);
		// Hier moet je in Postman in de body van de request de variabelen zetten
	}
}
