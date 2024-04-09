package task1;

public class Address {
	
	private int Floornumber;
	private String Streetname;
	private String Cityname;
	private String State;
	private String country;
	
	public Address(int floornumber, String streetname, String cityname, String state, String country) {
		super();
		Floornumber = floornumber;
		Streetname = streetname;
		Cityname = cityname;
		State = state;
		this.country = country;
	}

	public int getFloornumber() {
		return Floornumber;
	}

	public void setFloornumber(int floornumber) {
		Floornumber = floornumber;
	}

	public String getStreetname() {
		return Streetname;
	}

	public void setStreetname(String streetname) {
		Streetname = streetname;
	}

	public String getCityname() {
		return Cityname;
	}

	public void setCityname(String cityname) {
		Cityname = cityname;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	


}
