
public class outlet {
	private int OutletID;
	private String name;
	private String location;
	private int NoOfStaff;
	
	public outlet(int OutletID , String name , String location, int NoOfStaff) {
		this.OutletID = OutletID;
		this.name = name;
		this.location= location;
		this.NoOfStaff = NoOfStaff;
		}

	public int getOutletID() {
		return OutletID;
	}

	public void setOutletID(int outletID) {
		OutletID = outletID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfStaff() {
		return NoOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		NoOfStaff = noOfStaff;
	}
	
}

