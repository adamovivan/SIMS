/***********************************************************************
 * Module:  CheckPoint.java
 * Author:  PC
 * Purpose: Defines the Class CheckPoint
 ***********************************************************************/
package application;
import java.util.*;

/** @pdOid c8bc517c-efda-4ec3-854c-3a7100d5d122 */
public class CheckPoint {
   /** @pdOid 4aade022-eefb-49df-8570-77275481874c */
   private java.util.Date time;
   /** @pdOid 573f4e72-58cb-4c0c-8183-76478b55bb9a */
   private String description;
   
   /** @pdRoleInfo migr=no name=Location assc=association17 mult=1..1 type=Composition */
   public Location location;

}