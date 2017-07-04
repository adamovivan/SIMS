/***********************************************************************
 * Module:  Account.java
 * Author:  PC
 * Purpose: Defines the Class Account
 ***********************************************************************/
package application;
import java.util.*;

/** @pdOid 9a3aaa7e-45c3-4536-9def-49fd6f9b57ca */
public class Account {
   /** @pdOid 4adc86d0-839f-4d0a-8349-5b45890cf5c0 */
   private String username;
   /** @pdOid 1734adab-009e-4d77-a1bd-c40b9edeedc5 */
   private String password;
   /** @pdOid 345a7e60-db0f-4a47-ab30-17c4653cadcb */
   private String description;
   /** @pdOid eac94742-08ec-4864-a452-420b39a0e5b5 */
   private String picture;
   
   /** @pdRoleInfo migr=no name=Person assc=association3 mult=0..1 */
   public Person person;
   
   /** @pdOid bb3fcb5f-c1bd-4e8d-9a4e-22e6a1094259 */
   public String getUsername() {
      return username;
   }
   
   /** @param newUsername
    * @pdOid c0323a58-b240-41a2-a4fb-f4408691c574 */
   public void setUsername(String newUsername) {
      username = newUsername;
   }
   
   /** @pdOid c2766492-8ea0-4649-97c3-75a47149e0ae */
   public String getPassword() {
      return password;
   }
   
   /** @param newPassword
    * @pdOid 9afe24b9-02ac-4a3a-a715-b9353a57b0d2 */
   public void setPassword(String newPassword) {
      password = newPassword;
   }
   
   /** @pdOid e732736c-6058-4b44-89ca-066d493c7cca */
   public String getDescription() {
      return description;
   }
   
   /** @param newDescription
    * @pdOid f6e09f5c-dc47-43e7-9cd8-c59faf229142 */
   public void setDescription(String newDescription) {
      description = newDescription;
   }
   
   /** @pdOid 875a811f-25dd-4724-927b-291341e6fbdf */
   public String getPicture() {
      return picture;
   }
   
   /** @param newPicture
    * @pdOid ecb84e82-105e-4115-9548-a4741e9c447a */
   public void setPicture(String newPicture) {
      picture = newPicture;
   }
   
   /** @pdOid d831df4b-d3d8-40e2-b7b5-209d0e326255 */
   public void settings() {
      // TODO: implement
   }

}