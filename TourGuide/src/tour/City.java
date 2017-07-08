/***********************************************************************
 * Module:  City.java
 * Author:  PC
 * Purpose: Defines the Class City
 ***********************************************************************/
package tour;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class City {

	private String name;
	private int pttNumber;

	public City() {
	}

	public City(String name, int pttNumber) {
		this.name = name;
		this.pttNumber = pttNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public int getPttNumber() {
		return pttNumber;
	}

	public void setPttNumber(int newPttNumber) {
		pttNumber = newPttNumber;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", pttNumber=" + pttNumber + "]";
	}

}