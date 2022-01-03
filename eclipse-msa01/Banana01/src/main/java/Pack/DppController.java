package Pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class Person{
	String name;
	int age;
	public String getName() { return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
}
@RestController
@RequestMapping("/dpp")
public class DppController {
	
	@GetMapping("/{dppNum}")
	public Person f1(@PathVariable String dppNum) {
		System.out.println("DppController : " + dppNum);
		
		Person person = new Person();
		person.name = "호랑이";
		person.age = 100;
		
		
		return person;
				//"DppController : " + dppNum;
				
	
	}

}
