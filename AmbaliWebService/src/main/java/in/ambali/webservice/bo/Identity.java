package in.ambali.webservice.bo;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Laxminarsimha on 3/7/2016.
 */
public class Identity {
	
	private static final String IDPREFIX = "IID";
    private static final AtomicLong counter = new AtomicLong(Calendar.getInstance().getTimeInMillis());
    public static String nextIdId = new String();
    public static String incrNextId() {
		nextIdId = new String(IDPREFIX+counter.incrementAndGet());
		return nextIdId;
	}
	private String idId;
	private String idProofType;
    private String idNumber;
    
    public Identity() {
		super();
	}

	public Identity(String nextId, String proofType, String number) {
    		this.idId=nextId;
    		this.idProofType=proofType;
    		this.idNumber=number;
	}

    public String getIdProofType() {
        return idProofType;
    }

    public void setIdProofType(String iDProofType) {
        this.idProofType = iDProofType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String iDNumber) {
        this.idNumber = iDNumber;
    }

    public String getIdId() {
		return idId;
	}
	public void setIdId(String idId) {
		this.idId = idId;
	}
	


}
