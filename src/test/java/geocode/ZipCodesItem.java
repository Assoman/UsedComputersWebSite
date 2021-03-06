package geocode;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ZipCodesItem{

	@JsonProperty("distance")
	private double distance;

	@JsonProperty("city")
	private String city;

	@JsonProperty("state")
	private String state;

	@JsonProperty("zip_code")
	private int zipCode;

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

	public void setZipCode(int zipCode){
		this.zipCode = zipCode;
	}

	public int getZipCode(){
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
