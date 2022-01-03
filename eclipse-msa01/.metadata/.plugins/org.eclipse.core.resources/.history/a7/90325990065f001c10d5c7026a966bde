package Pack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
// app/1000
@RestController
@RequestMapping("/cpp")
// 8085의 요청 준비 끝 
public class CppController {
	@GetMapping("/{cppNum}") // app뒤에 있는 1000을 받을 변수명을 적어주면 된다. 
	public String f1(@PathVariable String cppNum) {
		
		RestTemplate restTemplate = new  RestTemplate();
		Person person = restTemplate.getForObject(
				"http://localhost:8086/dpp/3000", // 
				Person.class); // 특정 사이트에서 데이터 얻어옴
		
		// 객체를 리턴 받는다 .
		return "AppController : " + cppNum + 
				"<br/>" + 
		person.getName() + "" + person.getAge();
	}

}