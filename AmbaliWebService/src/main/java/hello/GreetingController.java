package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ambali.webservice.User;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    public Greeting registerUser(User user) {
    	System.out.println("User: "+user.getFirstName());
        return new Greeting(counter.incrementAndGet(),
                            "Successfully Registered "+user.getFirstName()+" user!");
    }
    
    @RequestMapping("/getUser")
    public User getUser(@RequestParam(value="fname") String f, 
    		@RequestParam(value="lname") String l) {
    	System.out.println("InputUser: "+f+" "+l);
    	User user = new User(f,l);
    	user.setEmail("abc@xyz.com");
    	user.setDob("22Jan88");
    	user.setMobile("3423423");
    	user.setPhone("03434343");
    	user.setUserTypeId("R");
    	user.setGender("M");
        return user;
    }
}