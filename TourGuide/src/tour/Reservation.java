/***********************************************************************
 * Module:  Reservation.java
 * Author:  PC
 * Purpose: Defines the Class Reservation
 ***********************************************************************/
package tour;
import java.util.*;

/** @pdOid a5e4ef09-351b-470c-a218-4f5c41160612 */
public class Reservation {
   /** @pdOid d3b7b2ee-eb68-4f96-a127-228fd5dc1830 */
   private java.util.Date time;
   
   /** @pdOid 6ca505b5-f7af-4ce5-a531-44be667fd513 */
   public java.util.Date getTime() {
      return time;
   }
   
   /** @param newTime
    * @pdOid 4108ee51-7135-408f-8b94-7b28cd86a368 */
   public void setTime(java.util.Date newTime) {
      time = newTime;
   }

}