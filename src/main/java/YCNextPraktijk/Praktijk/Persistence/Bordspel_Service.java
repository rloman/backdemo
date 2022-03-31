package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import YCNextPraktijk.Praktijk.Model.Bordspel;

@Service
public class Bordspel_Service {

	@Autowired
	private Bordspel_Repository br;
	
	public Iterable<Bordspel> geefBordspellenTerug() {
		return br.findAll();	
	}
	
	
}
