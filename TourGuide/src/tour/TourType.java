/***********************************************************************
 * Module:  TourType.java
 * Author:  PC
 * Purpose: Defines the Class TourType
 ***********************************************************************/
package tour;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class TourType {
	private String type;

	public TourType(){
	}

	public TourType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String newType) {
		type = newType;
	}

	@Override
	public String toString() {
		return "TourType [type=" + type + "]";
	}

	
}