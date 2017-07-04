/***********************************************************************
 * Module:  Tourist.java
 * Author:  PC
 * Purpose: Defines the Class Tourist
 ***********************************************************************/
package role;
import java.util.*;

import application.Account;
import tour.Tour;

/** @pdOid 42bcbc67-59a8-4182-9b98-3ae53748404e */
public class Tourist extends Account {
   /** @pdRoleInfo migr=no name=Tour assc=association16 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Tour> tour;
   
   /** @param tourList
    * @pdOid 8317a9ba-dc63-4159-9af6-9ab8f720885a */
   public void searchTour(ArrayList<Tour> tourList) {
      // TODO: implement
   }
   
   /** @pdOid 032cba5b-7eea-45c5-937f-c52eeec64c9e */
   public void makeReservation() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Tour> getTour() {
      if (tour == null)
         tour = new java.util.HashSet<Tour>();
      return tour;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTour() {
      if (tour == null)
         tour = new java.util.HashSet<Tour>();
      return tour.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTour */
   public void setTour(java.util.Collection<Tour> newTour) {
      removeAllTour();
      for (java.util.Iterator iter = newTour.iterator(); iter.hasNext();)
         addTour((Tour)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTour */
   public void addTour(Tour newTour) {
      if (newTour == null)
         return;
      if (this.tour == null)
         this.tour = new java.util.HashSet<Tour>();
      if (!this.tour.contains(newTour))
         this.tour.add(newTour);
   }
   
   /** @pdGenerated default remove
     * @param oldTour */
   public void removeTour(Tour oldTour) {
      if (oldTour == null)
         return;
      if (this.tour != null)
         if (this.tour.contains(oldTour))
            this.tour.remove(oldTour);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTour() {
      if (tour != null)
         tour.clear();
   }

}