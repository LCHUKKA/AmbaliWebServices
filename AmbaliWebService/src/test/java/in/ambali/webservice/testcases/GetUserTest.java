package in.ambali.webservice.testcases;

import org.springframework.web.client.RestTemplate;

public class GetUserTest {

	public static void main(String[] args) {
		getUser();
	}
	
	public static void getUser(){
	final String uri = "http://localhost:8080/user/2242343/";
    
    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(uri, String.class);
     
    System.out.println(result);
	}
	
}
