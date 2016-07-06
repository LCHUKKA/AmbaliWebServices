package in.ambali.webservice.bo;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Laxminarsimha on 3/7/2016.
 */
public class User {
	private static final String IDPREFIX = "UID";
    private static final AtomicLong counter = new AtomicLong(Calendar.getInstance().getTimeInMillis());
    public static String nextUserId = new String();
    public static String incrNextId() {
		nextUserId = new String(IDPREFIX+counter.incrementAndGet());
		return nextUserId;
	}
    
    private String userId;
    private String userTypeId;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String phone;
    private String mobile;
    private String email;
    private Address address;
    private Identity identity;
    public Identity getIdentity() {
		return identity;
	}
	public void setIdentity(Identity identity) {
		this.identity = identity;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User(){
    	
    }
    public User(String fname, String lname) {
		// TODO Auto-generated constructor stub
    	setFirstName(fname);
    	setLastName(lname);
	}

	public String getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
