/***********************************************************************
 * Module:  Route.java
 * Author:  PC
 * Purpose: Defines the Class Route
 ***********************************************************************/
package application;
import java.util.*;

/** @pdOid b4b2631b-3452-485d-9540-c3326ef02465 */
public class Route {
   /** @pdRoleInfo migr=no name=CheckPoint assc=association19 coll=java.util.Collection impl=java.util.HashSet mult=1..* type=Composition */
   public java.util.Collection<CheckPoint> checkPoint;
   
   /** @pdOid e4794a87-dba3-410c-9287-89aa64384336 */
   public void defineSchedule() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<CheckPoint> getCheckPoint() {
      if (checkPoint == null)
         checkPoint = new java.util.HashSet<CheckPoint>();
      return checkPoint;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCheckPoint() {
      if (checkPoint == null)
         checkPoint = new java.util.HashSet<CheckPoint>();
      return checkPoint.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCheckPoint */
   public void setCheckPoint(java.util.Collection<CheckPoint> newCheckPoint) {
      removeAllCheckPoint();
      for (java.util.Iterator iter = newCheckPoint.iterator(); iter.hasNext();)
         addCheckPoint((CheckPoint)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCheckPoint */
   public void addCheckPoint(CheckPoint newCheckPoint) {
      if (newCheckPoint == null)
         return;
      if (this.checkPoint == null)
         this.checkPoint = new java.util.HashSet<CheckPoint>();
      if (!this.checkPoint.contains(newCheckPoint))
         this.checkPoint.add(newCheckPoint);
   }
   
   /** @pdGenerated default remove
     * @param oldCheckPoint */
   public void removeCheckPoint(CheckPoint oldCheckPoint) {
      if (oldCheckPoint == null)
         return;
      if (this.checkPoint != null)
         if (this.checkPoint.contains(oldCheckPoint))
            this.checkPoint.remove(oldCheckPoint);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCheckPoint() {
      if (checkPoint != null)
         checkPoint.clear();
   }

}