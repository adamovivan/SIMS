/***********************************************************************
 * Module:  Application.java
 * Author:  PC
 * Purpose: Defines the Class Application
 ***********************************************************************/
package application;
import java.util.*;

/** @pdOid 65c5fcd7-61d9-4aeb-96a5-5fe0cbb396af */
public class Application {
   /** @pdRoleInfo migr=no name=Account assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Account> account;
   /** @pdRoleInfo migr=no name=City assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<City> city;
   /** @pdRoleInfo migr=no name=Reservation assc=association12 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Reservation> reservation;
   /** @pdRoleInfo migr=no name=Guide assc=association23 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Guide> guide;
   /** @pdRoleInfo migr=no name=Tourist assc=association24 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<Tourist> tourist;
   
   /** @pdOid fbb4483d-f1f2-4b70-9d87-7ce73870a4b9 */
   public void showCities() {
      // TODO: implement
   }
   
   /** @pdOid 2ed77821-3172-41b0-91be-aa07045f5316 */
   public void showTours() {
      // TODO: implement
   }
   
   /** @pdOid 96d8ce40-4429-4baa-980e-121207188cd1 */
   public void showRoutes() {
      // TODO: implement
   }
   
   /** @pdOid 2b30bc8c-eb95-4be4-92f0-40ce9111c045 */
   public void showAccounts() {
      // TODO: implement
   }
   
   /** @pdOid f0c5f58c-2cea-49c9-bfa4-e41e99780b0a */
   public void addRoute() {
      // TODO: implement
   }
   
   /** @pdOid f8fd764e-5648-40d2-a97a-41d9af18338d */
   public void removeRoute() {
      // TODO: implement
   }
   
   /** @pdOid 966fb880-9ce5-4f71-99cf-e9dcdd685e98 */
   public void addTour() {
      // TODO: implement
   }
   
   /** @pdOid b2dc3dfb-fa54-4a43-8087-e09d197cb576 */
   public void removeTour() {
      // TODO: implement
   }
   
   /** @pdOid 52afe070-fe6a-41c8-bc4c-8c533e6f1371 */
   public void addAccount() {
      // TODO: implement
   }
   
   /** @pdOid 62780bbf-7470-44bd-8142-180059ce8b82 */
   public void removeAccount() {
      // TODO: implement
   }
   
   /** @pdOid 9341dc2e-87a7-4ca5-8d5c-cf0b7f8386e0 */
   public void addReservation() {
      // TODO: implement
   }
   
   /** @pdOid 76a076ba-bbb5-49e4-aa8a-bdff1ad8a5e8 */
   public void removeReservation() {
      // TODO: implement
   }
   
   /** @pdOid 19a54734-92e8-4e3e-8e36-e0502bba3df8 */
   public void addCity() {
      // TODO: implement
   }
   
   /** @pdOid deabdba1-3dcb-4464-8736-62d9f3a09e61 */
   public void removeCity() {
      // TODO: implement
   }
   
   /** @pdOid 2fc1b3a6-84fd-48bd-a128-4f4623fe9b04 */
   public void addLocation() {
      // TODO: implement
   }
   
   /** @pdOid 93071b5c-5662-4bf8-871f-95a744ac8fc2 */
   public void removeLocation() {
      // TODO: implement
   }
   
   /** @param newState
    * @pdOid cda89649-9245-4957-a557-577b2a17b678 */
   public void changeState(State newState) {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Account> getAccount() {
      if (account == null)
         account = new java.util.HashSet<Account>();
      return account;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorAccount() {
      if (account == null)
         account = new java.util.HashSet<Account>();
      return account.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newAccount */
   public void setAccount(java.util.Collection<Account> newAccount) {
      removeAllAccount();
      for (java.util.Iterator iter = newAccount.iterator(); iter.hasNext();)
         addAccount((Account)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newAccount */
   public void addAccount(Account newAccount) {
      if (newAccount == null)
         return;
      if (this.account == null)
         this.account = new java.util.HashSet<Account>();
      if (!this.account.contains(newAccount))
         this.account.add(newAccount);
   }
   
   /** @pdGenerated default remove
     * @param oldAccount */
   public void removeAccount(Account oldAccount) {
      if (oldAccount == null)
         return;
      if (this.account != null)
         if (this.account.contains(oldAccount))
            this.account.remove(oldAccount);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllAccount() {
      if (account != null)
         account.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<City> getCity() {
      if (city == null)
         city = new java.util.HashSet<City>();
      return city;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCity() {
      if (city == null)
         city = new java.util.HashSet<City>();
      return city.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCity */
   public void setCity(java.util.Collection<City> newCity) {
      removeAllCity();
      for (java.util.Iterator iter = newCity.iterator(); iter.hasNext();)
         addCity((City)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCity */
   public void addCity(City newCity) {
      if (newCity == null)
         return;
      if (this.city == null)
         this.city = new java.util.HashSet<City>();
      if (!this.city.contains(newCity))
         this.city.add(newCity);
   }
   
   /** @pdGenerated default remove
     * @param oldCity */
   public void removeCity(City oldCity) {
      if (oldCity == null)
         return;
      if (this.city != null)
         if (this.city.contains(oldCity))
            this.city.remove(oldCity);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCity() {
      if (city != null)
         city.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Reservation> getReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newReservation */
   public void setReservation(java.util.Collection<Reservation> newReservation) {
      removeAllReservation();
      for (java.util.Iterator iter = newReservation.iterator(); iter.hasNext();)
         addReservation((Reservation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newReservation */
   public void addReservation(Reservation newReservation) {
      if (newReservation == null)
         return;
      if (this.reservation == null)
         this.reservation = new java.util.HashSet<Reservation>();
      if (!this.reservation.contains(newReservation))
         this.reservation.add(newReservation);
   }
   
   /** @pdGenerated default remove
     * @param oldReservation */
   public void removeReservation(Reservation oldReservation) {
      if (oldReservation == null)
         return;
      if (this.reservation != null)
         if (this.reservation.contains(oldReservation))
            this.reservation.remove(oldReservation);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllReservation() {
      if (reservation != null)
         reservation.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Guide> getGuide() {
      if (guide == null)
         guide = new java.util.HashSet<Guide>();
      return guide;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorGuide() {
      if (guide == null)
         guide = new java.util.HashSet<Guide>();
      return guide.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newGuide */
   public void setGuide(java.util.Collection<Guide> newGuide) {
      removeAllGuide();
      for (java.util.Iterator iter = newGuide.iterator(); iter.hasNext();)
         addGuide((Guide)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newGuide */
   public void addGuide(Guide newGuide) {
      if (newGuide == null)
         return;
      if (this.guide == null)
         this.guide = new java.util.HashSet<Guide>();
      if (!this.guide.contains(newGuide))
         this.guide.add(newGuide);
   }
   
   /** @pdGenerated default remove
     * @param oldGuide */
   public void removeGuide(Guide oldGuide) {
      if (oldGuide == null)
         return;
      if (this.guide != null)
         if (this.guide.contains(oldGuide))
            this.guide.remove(oldGuide);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllGuide() {
      if (guide != null)
         guide.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Tourist> getTourist() {
      if (tourist == null)
         tourist = new java.util.HashSet<Tourist>();
      return tourist;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorTourist() {
      if (tourist == null)
         tourist = new java.util.HashSet<Tourist>();
      return tourist.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newTourist */
   public void setTourist(java.util.Collection<Tourist> newTourist) {
      removeAllTourist();
      for (java.util.Iterator iter = newTourist.iterator(); iter.hasNext();)
         addTourist((Tourist)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newTourist */
   public void addTourist(Tourist newTourist) {
      if (newTourist == null)
         return;
      if (this.tourist == null)
         this.tourist = new java.util.HashSet<Tourist>();
      if (!this.tourist.contains(newTourist))
         this.tourist.add(newTourist);
   }
   
   /** @pdGenerated default remove
     * @param oldTourist */
   public void removeTourist(Tourist oldTourist) {
      if (oldTourist == null)
         return;
      if (this.tourist != null)
         if (this.tourist.contains(oldTourist))
            this.tourist.remove(oldTourist);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllTourist() {
      if (tourist != null)
         tourist.clear();
   }

}