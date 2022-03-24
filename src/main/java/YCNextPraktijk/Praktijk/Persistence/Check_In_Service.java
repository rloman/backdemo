package YCNextPraktijk.Praktijk.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import YCNextPraktijk.Praktijk.Model.Check_In;

@Service
public class Check_In_Service {
	
	@Autowired
	private Check_In_Repository cir;
	
	public void slaCheck_InOp() {
		cir.save(new Check_In());
	}

}
