/***********************************************************************
 * Module:  Person.java
 * Author:  PC
 * Purpose: Defines the Class Person
 ***********************************************************************/
package role;
import java.util.*;

import tour.City;

/** @pdOid 07aa52c8-fe19-414f-a814-7c4f2a7425ad */
public class Person {
   /** @pdOid 387bf10d-78f1-4c16-a1df-a3d7a29da2f9 */
   private String firstName;
   /** @pdOid 931065af-18b3-4021-a5e2-0e73113ca98a */
   private String lastName;
   /** @pdOid a98ba866-329a-4ef8-b64f-848e14229754 */
   private String jmbg;
   /** @pdOid a81a00bf-1670-483d-abc1-8d2a9934fbfe */
   private int address;
   
   /** @pdRoleInfo migr=no name=City assc=association4 mult=1..1 */
   public City city;
   
   /** @pdOid 030e03f0-6d7b-4672-af07-d10b616495ed */
   public String getFirstName() {
      return firstName;
   }
   
   /** @param newFirstName
    * @pdOid 06be9671-714a-426c-bd8d-e30ca8112767 */
   public void setFirstName(String newFirstName) {
      firstName = newFirstName;
   }
   
   /** @pdOid 9a2c961b-3824-4ebc-9ccd-867878933c21 */
   public String getLastName() {
      return lastName;
   }
   
   /** @param newLastName
    * @pdOid cd9f17df-fb18-4c7b-a0a2-e25d2c8c9b83 */
   public void setLastName(String newLastName) {
      lastName = newLastName;
   }
   
   /** @pdOid 789a8673-6461-4c89-ac5f-af725aa2af0f */
   public String getJmbg() {
      return jmbg;
   }
   
   /** @param newJmbg
    * @pdOid 8593aab2-1aa6-4da1-a637-fe6e6d0683ee */
   public void setJmbg(String newJmbg) {
      jmbg = newJmbg;
   }
   
   /** @pdOid 7d22b9f0-fd0d-4f21-8875-ae2dfad6b0ad */
   public int getAddress() {
      return address;
   }
   
   /** @param newAddress
    * @pdOid 3ed334da-2875-4000-b79f-044ab5216a82 */
   public void setAddress(int newAddress) {
      address = newAddress;
   }

}