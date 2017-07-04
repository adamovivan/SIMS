/***********************************************************************
 * Module:  Tour.java
 * Author:  PC
 * Purpose: Defines the Class Tour
 ***********************************************************************/
package tour;

public class Tour {
   private int maxSpots;
   private int availableSpots;

   public Route route;
   public TourType tourType;

   public void showReservations() {
      // TODO: implement
   }

   public int getMaxSpots() {
      return maxSpots;
   }

   public void setMaxSpots(int newMaxSpots) {
      maxSpots = newMaxSpots;
   }

   public int getAvailableSpots() {
      return availableSpots;
   }

   public void setAvailableSpots(int newAvailableSpots) {
      availableSpots = newAvailableSpots;
   }

}