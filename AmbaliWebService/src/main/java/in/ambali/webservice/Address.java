package in.ambali.webservice;

/**
 * Created by Laxminarsimha on 3/7/2016.
 */
public class Address {
    private String  addId;
    private String 	addProfType;
    private String 	houseNo;
    private String 	street1;
    private String 	street2;
    private String 	landmark;
    private String 	city;
    private String 	state;
    private String 	country;
    private String 	pincode;

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddProfType() {
        return addProfType;
    }

    public void setAddProfType(String addProfType) {
        this.addProfType = addProfType;
    }

    public String getAddId() {
        return addId;
    }

    public void setAddId(String addId) {
        this.addId = addId;
    }


}
