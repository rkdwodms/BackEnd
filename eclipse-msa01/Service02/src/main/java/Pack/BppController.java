package Pack;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bpp")
public class BppController {
	
	@GetMapping("/{bppNum}")
	public String f1(@PathVariable String bppNum) {
		Random rn = new Random();
		
		System.out.println("난 서비스 2"+rn.nextInt(100));
		
//		throw new RuntimeException("익셉션");
		 return "BppController : " + bppNum;
				
	
	}

}
