package YCNextPraktijk.Praktijk.docent;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IetsMetFotoFelixEndpoint {
	@Autowired
	IetsMetFotoFelixRepository imffr;
	
	@GetMapping("/testfotofelix/{imffid}")
	public IetsMetFotoFelix opvragenFoto(@PathVariable long imffid) {
		System.out.println("in de backend");
		Optional<IetsMetFotoFelix> imf = imffr.findById(imffid);
		return imf.get();
	}
	@PostMapping("/voegfototoe")
	public long voegObjectMetFotoToe(@RequestBody IetsMetFotoFelix imff) {
		System.out.println("yes binnen bij foto");
		imffr.save(imff);
		return imff.getId();
	}
	
	
}
