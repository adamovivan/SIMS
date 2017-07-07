/***********************************************************************
 * Module:  LogIn.java
 * Author:  Nikola
 * Purpose: Defines the Class LogIn
 ***********************************************************************/

package state;

public class LogIn extends State {
   public int doo() {
      System.out.println("Login do!");
      return 0;
   }

   public int entry() {
      System.out.println("Login entry!");
      return 0;
   }

   public int exit() {
	   System.out.println("Login exit!");
      return 0;
   }
}