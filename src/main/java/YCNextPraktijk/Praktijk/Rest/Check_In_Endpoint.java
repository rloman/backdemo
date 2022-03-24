package YCNextPraktijk.Praktijk.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import YCNextPraktijk.Praktijk.Persistence.Check_In_Service;

@RestController
public class Check_In_Endpoint {
	@Autowired
	private Check_In_Service cis;
	
	@GetMapping("/test")
	public void testmethode() {
		System.out.println("test");
		cis.slaCheck_InOp();
	}
}
