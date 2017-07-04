/***********************************************************************
 * Module:  Account.java
 * Author:  PC
 * Purpose: Defines the Class Account
 ***********************************************************************/
package application;
import role.Person;


public class Account {

   private String username;
   private String password;
   private String description;
   private String picture;

   public Person person;


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