package in.ambali.webservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ambali.webservice.bo.Address;
import in.ambali.webservice.bo.Identity;
import in.ambali.webservice.bo.User;

/**
 * Created by Laxminarsimha on 3/7/2016.
 */


@RestController
@RequestMapping(value="/user")
public class InputController {
	
    @RequestMapping(value = "/register", method = RequestMethod.POST,headers="Accept=application/json")
    public String registerUser( @RequestBody User user) {
    	System.out.println("User: "+user.getFirstName());
        
		return new String("Successfully Registered "+user.getFirstName()+" user, id= "+User.incrNextId());
    }
    
    @RequestMapping("/{uid}")
    public User getUser(@PathVariable String uid) {
    	System.out.println("URI  --> /"+uid);
    	User user = new User();
    		user.setFirstName("FName");
    		user.setLastName("LName");
    	user.setUserId(uid);
    	user.setEmail("abc@xyz.com");
    	user.setDob("22Jan88");
    	user.setMobile("3423423");
    	user.setPhone("03434343");
    	user.setUserTypeId("R");
    	user.setGender("M");
    	Address addr = new Address();
    	addr.setAddId(Address.incrNextId());
    	addr.setCity("hyd");
    	addr.setAddProofType("pp");
    	addr.setCountry("india");
    	addr.setHouseNo("312");
    	addr.setLandmark("near aaa");
    	addr.setPincode("4561233");
    	addr.setState("TL");
    	addr.setStreet1("Strt1");
    	addr.setStreet2("sgtr2");
    	user.setAddress(addr);
    	user.setIdentity(new Identity(Identity.incrNextId(),"PP","4451256"));
    	return user;
    }
    
//    http://localhost:8080/getUser?fname=aaa&lname=bbb
    /*public static String uri1 = "/uuu";
//    @RequestMapping(uri1)
    public String  getUri() {
		return null;
    	
    } 
    */
    
    
}
