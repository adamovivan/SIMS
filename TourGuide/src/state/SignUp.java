/***********************************************************************
 * Module:  SignUp.java
 * Author:  Nikola
 * Purpose: Defines the Class SignUp
 ***********************************************************************/

package state;

public class SignUp extends State {
   public int doo() {
      System.out.println("Signup do!");
      return 0;
   }

   public int entry() {
      System.out.println("Signup entry!");
      return 0;
   }

   public int exit() {
	   System.out.println("Signup exit!");
      return 0;
   }

}