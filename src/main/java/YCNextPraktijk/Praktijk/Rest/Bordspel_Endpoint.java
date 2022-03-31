package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Model.Bordspel;
import YCNextPraktijk.Praktijk.Persistence.Bordspel_Service;

@RestController
public class Bordspel_Endpoint {

	@Autowired
	private Bordspel_Service bs;
	
	@GetMapping("/allebordspellen")
	public Iterable<Bordspel> alleBordspellen() {
		System.out.println("alle checkins");
		return bs.geefBordspellenTerug();
	}
	
}
