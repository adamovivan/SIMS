/***********************************************************************
 * Module:  City.java
 * Author:  PC
 * Purpose: Defines the Class City
 ***********************************************************************/
package tour;
import java.util.*;

/** @pdOid 9c032dc0-d75c-471f-b0dc-6843a4f6bac4 */
public class City {
   /** @pdOid afcc0fd2-8d36-40ce-b0e8-0a971ecb798d */
   private String name;
   /** @pdOid 51896a0d-fe17-4d58-8878-95f62509ae5b */
   private int pttNumber;
   
   /** @pdOid d3c38282-d7e3-49a4-8427-8369f98b86d2 */
   public String getName() {
      return name;
   }
   
   /** @param newName
    * @pdOid 2ba83f7e-05a3-4d1a-8572-d37f18ab44a2 */
   public void setName(String newName) {
      name = newName;
   }
   
   /** @pdOid 61218bf8-db6d-4da6-bd8e-9ee573bed80f */
   public int getPttNumber() {
      return pttNumber;
   }
   
   /** @param newPttNumber
    * @pdOid 2df14816-98ec-4a0a-a1ee-1095ab0a9b78 */
   public void setPttNumber(int newPttNumber) {
      pttNumber = newPttNumber;
   }

}