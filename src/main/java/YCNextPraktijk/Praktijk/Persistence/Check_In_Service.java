package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import YCNextPraktijk.Praktijk.Model.CheckIn;

@Service
public class Check_In_Service {
	
	@Autowired
	private Check_In_Repository cir;
	
	public Iterable<CheckIn> zoekCheckin(String s){
		return cir.findCheck_InsByBordspel(s);
	}
	
	public Iterable<CheckIn> geefCheckinsTerug() {
		return cir.findAll();	
	}
	
	public void allesTellen() {
		long aantal = cir.count();
		System.out.println(aantal);
	}
	
	public void slaCheck_InOp() {
		cir.save(new CheckIn());
	}

	public void slaDezeCheck_InOp(CheckIn ci) {
		cir.save(ci);
	}
	
	public void deleteCheck_In(long id) {
		cir.deleteById(id);
	}
	
	public void updateCheck_In() {
		
	}
	
}
