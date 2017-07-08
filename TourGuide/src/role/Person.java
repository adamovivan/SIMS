/***********************************************************************
 * Module:  Person.java
 * Author:  PC
 * Purpose: Defines the Class Person
 ***********************************************************************/
package role;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import tour.City;


@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Person {
   private String firstName;
   private String lastName;
   private String umcn;
   private String address;

   public City city;

   public Person(){
   }

   public Person(String firstName, String lastName, String umcn, String address, City city) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.umcn = umcn;
	this.address = address;
	this.city = city;
}

public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String newFirstName) {
      firstName = newFirstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String newLastName) {
      lastName = newLastName;
   }

   public String getUmcn() {
      return umcn;
   }

   public void setUmcn(String newUmcn) {
	   umcn = newUmcn;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String newAddress) {
      address = newAddress;
   }

}