package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Model.CheckIn;
import YCNextPraktijk.Praktijk.Persistence.CheckInService;


@RestController
public class CheckInEndpoint {
	@Autowired
	private CheckInService cis;
	
	
	@GetMapping("/zoekcheckin/{query}")
	public Iterable <CheckIn> eenCheckin(@RequestParam String bordspel){
		System.out.println("specific checkin");
		return cis.zoekCheckin(bordspel);
	}
	
	@GetMapping("/allecheckins")
	public Iterable<CheckIn> alleCheckins() {
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
		CheckIn ci = new CheckIn();
		ci.setBordspel(spel); ci.setLocatie(locatie); 
		ci.setRating(rating); ci.setReview(review); 
		ci.setWin(win);
		cis.slaDezeCheck_InOp(ci);
	}
	@PostMapping("/test2")
	public void testPostMethode(@RequestBody CheckIn checkin) {
		System.out.println(checkin.getReview());
		cis.slaDezeCheck_InOp(checkin);
		// Hier moet je in Postman in de body van de request de variabelen zetten
	}
}
