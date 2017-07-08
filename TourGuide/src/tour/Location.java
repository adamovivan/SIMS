/***********************************************************************
 * Module:  Location.java
 * Author:  PC
 * Purpose: Defines the Class Location
 ***********************************************************************/
package tour;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Location {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String newName) {
      name = newName;
   }

}