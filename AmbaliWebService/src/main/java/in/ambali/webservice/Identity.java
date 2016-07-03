package in.ambali.webservice;

/**
 * Created by Laxminarsimha on 3/7/2016.
 */
public class Identity {
    private String iDId;
    private String iDProofType;
    private String iDNumber;

    public String getiDId() {
        return iDId;
    }

    public void setiDId(String iDId) {
        this.iDId = iDId;
    }

    public String getiDProofType() {
        return iDProofType;
    }

    public void setiDProofType(String iDProofType) {
        this.iDProofType = iDProofType;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }


}
