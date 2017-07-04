/***********************************************************************
 * Module:  Guide.java
 * Author:  PC
 * Purpose: Defines the Class Guide
 ***********************************************************************/
package role;
import java.util.*;

import application.Account;
import tour.Route;
import tour.Tour;

/** @pdOid d2047050-6120-4ee2-9f79-8454264fa701 */
public class Guide extends Account {
   /** @pdRoleInfo migr=no name=Route assc=association25 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Route> route;
   
   /** @param tours
    * @pdOid 414fb75d-509e-41f7-a776-6ec9dfcb4604 */
   public void makeTour(ArrayList<Tour> tours) {
      // TODO: implement
   }
   
   /** @param routes
    * @pdOid 67cbca3b-01ec-464e-acbe-99473af948dc */
   public void defineRoute(ArrayList<Route> routes) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Route> getRoute() {
      if (route == null)
         route = new java.util.HashSet<Route>();
      return route;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRoute() {
      if (route == null)
         route = new java.util.HashSet<Route>();
      return route.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRoute */
   public void setRoute(java.util.Collection<Route> newRoute) {
      removeAllRoute();
      for (java.util.Iterator iter = newRoute.iterator(); iter.hasNext();)
         addRoute((Route)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRoute */
   public void addRoute(Route newRoute) {
      if (newRoute == null)
         return;
      if (this.route == null)
         this.route = new java.util.HashSet<Route>();
      if (!this.route.contains(newRoute))
         this.route.add(newRoute);
   }
   
   /** @pdGenerated default remove
     * @param oldRoute */
   public void removeRoute(Route oldRoute) {
      if (oldRoute == null)
         return;
      if (this.route != null)
         if (this.route.contains(oldRoute))
            this.route.remove(oldRoute);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRoute() {
      if (route != null)
         route.clear();
   }

}