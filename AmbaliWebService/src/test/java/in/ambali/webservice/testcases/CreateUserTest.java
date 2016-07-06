package in.ambali.webservice.testcases;

import org.springframework.web.client.RestTemplate;

public class CreateUserTest {

	public static void main(String[] args) {
		createUser();
	}
	
	public static void createUser(){
	final String uri = "http://localhost:8080/user/register";
    
    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.postForEntity(uri, "{}", String.class).toString();
     
    System.out.println(result);
	}
	
}
