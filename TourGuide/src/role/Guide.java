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


public class Guide extends Account {
   public java.util.Collection<Route> route;

   public void makeTour(ArrayList<Tour> tours) {
      // TODO: implement
   }
 
   public void defineRoute(ArrayList<Route> routes) {
      // TODO: implement
   }
   
   public java.util.Collection<Route> getRoute() {
      if (route == null)
         route = new java.util.HashSet<Route>();
      return route;
   }
   
   public java.util.Iterator getIteratorRoute() {
      if (route == null)
         route = new java.util.HashSet<Route>();
      return route.iterator();
   }
   
   public void setRoute(java.util.Collection<Route> newRoute) {
      removeAllRoute();
      for (java.util.Iterator iter = newRoute.iterator(); iter.hasNext();)
         addRoute((Route)iter.next());
   }
   
   public void addRoute(Route newRoute) {
      if (newRoute == null)
         return;
      if (this.route == null)
         this.route = new java.util.HashSet<Route>();
      if (!this.route.contains(newRoute))
         this.route.add(newRoute);
   }
   
   public void removeRoute(Route oldRoute) {
      if (oldRoute == null)
         return;
      if (this.route != null)
         if (this.route.contains(oldRoute))
            this.route.remove(oldRoute);
   }
   
   public void removeAllRoute() {
      if (route != null)
         route.clear();
   }

}