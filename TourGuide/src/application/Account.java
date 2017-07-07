/***********************************************************************
 * Module:  Account.java
 * Author:  PC
 * Purpose: Defines the Class Account
 ***********************************************************************/
package application;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import role.Person;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Account {

   private String username;
   private String password;
   private String description;
   private String picture;

   public Person person;

   public Account(String username, String password, String description, String picture, Person person) {
	super();
	this.username = username;
	this.password = password;
	this.description = description;
	this.picture = picture;
	this.person = person;
}

public String getUsername() {
      return username;
   }

   public void setUsername(String newUsername) {
      username = newUsername;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String newPassword) {
      password = newPassword;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String newDescription) {
      description = newDescription;
   }

   public String getPicture() {
      return picture;
   }

   public void setPicture(String newPicture) {
      picture = newPicture;
   }

   public void settings() {
      // TODO: implement
   }

}