package entity;

public class ZipCodesItem{
	private double distance;
	private String city;
	private String state;
	private String zipCode;

	public void setDistance(double distance){
		this.distance = distance;
	}

	public double getDistance(){
		return distance;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}

	public String getZipCode(){
		return zipCode;
	}

	@Override
 	public String toString(){
		return 
			"ZipCodesItem{" + 
			"distance = '" + distance + '\'' + 
			",city = '" + city + '\'' + 
			",state = '" + state + '\'' + 
			",zip_code = '" + zipCode + '\'' + 
			"}";
		}
}
