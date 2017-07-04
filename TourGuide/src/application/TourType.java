/***********************************************************************
 * Module:  TourType.java
 * Author:  PC
 * Purpose: Defines the Class TourType
 ***********************************************************************/
package application;
import java.util.*;

/** @pdOid cba644ed-6db1-4184-9f7c-af4ece16fc10 */
public class TourType {
   /** @pdOid 3d8b4d00-fd82-4e5b-8e91-056cc6a15fe3 */
   private String type;
   
   /** @pdOid 784cd24b-0e6e-451b-98cc-3d9af65168ce */
   public String getType() {
      return type;
   }
   
   /** @param newType
    * @pdOid 664980ec-2c6a-48da-8c04-73a1b1cbb203 */
   public void setType(String newType) {
      type = newType;
   }

}