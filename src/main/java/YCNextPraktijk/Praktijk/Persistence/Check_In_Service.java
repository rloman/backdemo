package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import YCNextPraktijk.Praktijk.Model.Check_In;

@Service
public class Check_In_Service {
	
	@Autowired
	private Check_In_Repository cir;
	
	public Iterable<Check_In> zoekCheckin(String s){
		return cir.findCheck_InsByBordspel(s);
	}
	
	public Iterable<Check_In> geefCheckinsTerug() {
		return cir.findAll();	
	}
	
	public void allesTellen() {
		long aantal = cir.count();
		System.out.println(aantal);
	}
	
	public void slaCheck_InOp() {
		cir.save(new Check_In());
	}

	public void slaDezeCheck_InOp(Check_In ci) {
		cir.save(ci);
	}
	
	public void deleteCheck_In(String bordspel) {
		for (Check_In c : cir.iterator()) {
			if (c.bordspel == bordspel) {
				cir.remove(c);
				return;
			}
		}
	}
	
	public void updateCheck_In() {
		
	}
	
}
