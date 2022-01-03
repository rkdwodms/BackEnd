package Pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bpp")
public class BppController {
	
	@GetMapping("/{bppNum}")
	public String f1(@PathVariable String bppNum) {
		
		
		
		return "BppController : " + bppNum;
				
	
	}

}
