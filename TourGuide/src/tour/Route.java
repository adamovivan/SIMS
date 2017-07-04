/***********************************************************************
 * Module:  Route.java
 * Author:  PC
 * Purpose: Defines the Class Route
 ***********************************************************************/
package tour;

public class Route {
   public java.util.Collection<CheckPoint> checkPoint;

   public void defineSchedule() {
      // TODO: implement
   }

   public java.util.Collection<CheckPoint> getCheckPoint() {
      if (checkPoint == null)
         checkPoint = new java.util.HashSet<CheckPoint>();
      return checkPoint;
   }

   public java.util.Iterator getIteratorCheckPoint() {
      if (checkPoint == null)
         checkPoint = new java.util.HashSet<CheckPoint>();
      return checkPoint.iterator();
   }

   public void setCheckPoint(java.util.Collection<CheckPoint> newCheckPoint) {
      removeAllCheckPoint();
      for (java.util.Iterator iter = newCheckPoint.iterator(); iter.hasNext();)
         addCheckPoint((CheckPoint)iter.next());
   }

   public void addCheckPoint(CheckPoint newCheckPoint) {
      if (newCheckPoint == null)
         return;
      if (this.checkPoint == null)
         this.checkPoint = new java.util.HashSet<CheckPoint>();
      if (!this.checkPoint.contains(newCheckPoint))
         this.checkPoint.add(newCheckPoint);
   }

   public void removeCheckPoint(CheckPoint oldCheckPoint) {
      if (oldCheckPoint == null)
         return;
      if (this.checkPoint != null)
         if (this.checkPoint.contains(oldCheckPoint))
            this.checkPoint.remove(oldCheckPoint);
   }

   public void removeAllCheckPoint() {
      if (checkPoint != null)
         checkPoint.clear();
   }

}