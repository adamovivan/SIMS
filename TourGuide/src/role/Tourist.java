/***********************************************************************
 * Module:  Tourist.java
 * Author:  PC
 * Purpose: Defines the Class Tourist
 ***********************************************************************/
package role;
import java.util.*;

import application.Account;
import tour.Tour;

public class Tourist extends Account {
   public java.util.Collection<Tour> tour;
   
   public void searchTour(ArrayList<Tour> tourList) {
      // TODO: implement
   }
   
   public void makeReservation() {
      // TODO: implement
   }
    
   public java.util.Collection<Tour> getTour() {
      if (tour == null)
         tour = new java.util.HashSet<Tour>();
      return tour;
   }
   
   public java.util.Iterator getIteratorTour() {
      if (tour == null)
         tour = new java.util.HashSet<Tour>();
      return tour.iterator();
   }
   
   public void setTour(java.util.Collection<Tour> newTour) {
      removeAllTour();
      for (java.util.Iterator iter = newTour.iterator(); iter.hasNext();)
         addTour((Tour)iter.next());
   }
   
   public void addTour(Tour newTour) {
      if (newTour == null)
         return;
      if (this.tour == null)
         this.tour = new java.util.HashSet<Tour>();
      if (!this.tour.contains(newTour))
         this.tour.add(newTour);
   }
   
   public void removeTour(Tour oldTour) {
      if (oldTour == null)
         return;
      if (this.tour != null)
         if (this.tour.contains(oldTour))
            this.tour.remove(oldTour);
   }
   
   public void removeAllTour() {
      if (tour != null)
         tour.clear();
   }

}