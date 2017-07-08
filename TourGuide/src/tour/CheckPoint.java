/***********************************************************************
 * Module:  CheckPoint.java
 * Author:  PC
 * Purpose: Defines the Class CheckPoint
 ***********************************************************************/
package tour;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class CheckPoint {
	private java.util.Date time;
	private String description;

	public Location location;

	public CheckPoint() {
	}

	public CheckPoint(Date time, String description, Location location) {
		this.time = time;
		this.description = description;
		this.location = location;
	}

	public java.util.Date getTime() {
		return time;
	}

	public void setTime(java.util.Date time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}