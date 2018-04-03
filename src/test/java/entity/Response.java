package entity;

import java.util.List;

public class Response{
	private List<ZipCodesItem> zipCodes;

	public void setZipCodes(List<ZipCodesItem> zipCodes){
		this.zipCodes = zipCodes;
	}

	public List<ZipCodesItem> getZipCodes(){
		return zipCodes;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"zip_codes = '" + zipCodes + '\'' + 
			"}";
		}
}