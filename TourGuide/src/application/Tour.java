/***********************************************************************
 * Module:  Tour.java
 * Author:  PC
 * Purpose: Defines the Class Tour
 ***********************************************************************/
package application;
import java.util.*;

/** @pdOid 55aae2b4-abee-427f-8523-e7adb92d03ac */
public class Tour {
   /** @pdOid 7712469b-2d78-4565-aac9-7d21a053bd2a */
   private int maxSpots;
   /** @pdOid 65c91f1a-6d7d-465b-88ef-0d50e7af8f17 */
   private int availableSpots;
   
   /** @pdRoleInfo migr=no name=Route assc=association15 mult=1..1 type=Composition */
   public Route route;
   /** @pdRoleInfo migr=no name=TourType assc=association20 mult=1..1 */
   public TourType tourType;
   
   /** @pdOid ae60d4cb-0e09-41ea-a17c-d012c93620b1 */
   public void showReservations() {
      // TODO: implement
   }
   
   /** @pdOid b8cafee4-5e3b-4cdd-be99-fe1ec434335f */
   public int getMaxSpots() {
      return maxSpots;
   }
   
   /** @param newMaxSpots
    * @pdOid 04802115-4135-422d-9acb-342bf5d8bf44 */
   public void setMaxSpots(int newMaxSpots) {
      maxSpots = newMaxSpots;
   }
   
   /** @pdOid 4422521b-8255-4acc-99b9-1d7472502260 */
   public int getAvailableSpots() {
      return availableSpots;
   }
   
   /** @param newAvailableSpots
    * @pdOid 1ac3a767-3b13-469e-9d0a-5e659a22db5e */
   public void setAvailableSpots(int newAvailableSpots) {
      availableSpots = newAvailableSpots;
   }

}