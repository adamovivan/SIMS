/***********************************************************************
 * Module:  Reservation.java
 * Author:  PC
 * Purpose: Defines the Class Reservation
 ***********************************************************************/
package tour;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Reservation {
   private java.util.Date time;

   public java.util.Date getTime() {
      return time;
   }

   public void setTime(java.util.Date newTime) {
      time = newTime;
   }

}