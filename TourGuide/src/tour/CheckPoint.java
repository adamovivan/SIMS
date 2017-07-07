/***********************************************************************
 * Module:  CheckPoint.java
 * Author:  PC
 * Purpose: Defines the Class CheckPoint
 ***********************************************************************/
package tour;

public class CheckPoint {
   private java.util.Date time;
   private String description;

   public Location location;

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