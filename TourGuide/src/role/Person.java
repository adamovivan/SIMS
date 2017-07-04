/***********************************************************************
 * Module:  Person.java
 * Author:  PC
 * Purpose: Defines the Class Person
 ***********************************************************************/
package role;
import tour.City;

public class Person {
   private String firstName;
   private String lastName;
   private String jmbg;
   private int address;

   public City city;

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

   public String getJmbg() {
      return jmbg;
   }

   public void setJmbg(String newJmbg) {
      jmbg = newJmbg;
   }

   public int getAddress() {
      return address;
   }

   public void setAddress(int newAddress) {
      address = newAddress;
   }

}