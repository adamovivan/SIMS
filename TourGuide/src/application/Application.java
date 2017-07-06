/***********************************************************************
 * Module:  Application.java
 * Author:  PC
 * Purpose: Defines the Class Application
 ***********************************************************************/
package application;
import java.util.Iterator;

import role.Guide;
import role.Tourist;
import state.State;
import tour.City;
import tour.Reservation;

public class Application {
   public java.util.Collection<Account> account;
   public java.util.Collection<City> city;
   public java.util.Collection<Reservation> reservation;
   public java.util.Collection<Guide> guide;
   public java.util.Collection<Tourist> tourist;

   public int updateMainView() {
      // TODO: implement
      return 0;
   }

   public void cehckCommentRequests() {
      // TODO: implement
   }

   public int saveTourInfo() {
      // TODO: implement
      return 0;
   }

   public int sendCommentRequest() {
      // TODO: implement
      return 0;
   }

   public int endTour() {
      // TODO: implement
      return 0;
   }

   public int touristDeclined() {
      // TODO: implement
      return 0;
   }

   public int touristChecked() {
      // TODO: implement
      return 0;
   }

   public int loadTourInfo() {
      // TODO: implement
      return 0;
   }

   public int loadGuideTours() {
      // TODO: implement
      return 0;
   }

   public int loadUserInfo() {
      // TODO: implement
      return 0;
   }

   public int search() {
      // TODO: implement
      return 0;
   }

   public void clearUsernamePass() {
      // TODO: implement
   }

   public Boolean checkLogin() {
      // TODO: implement
      return null;
   }

   public Boolean checkSignUp() {
      // TODO: implement
      return null;
   }

   public void showCities() {
      // TODO: implement
   }

   public void showTours() {
      // TODO: implement
   }

   public void showRoutes() {
      // TODO: implement
   }

   public void showAccounts() {
      // TODO: implement
   }

   public void addRoute() {
      // TODO: implement
   }

   public void removeRoute() {
      // TODO: implement
   }

   public void addTour() {
      // TODO: implement
   }

   public void removeTour() {
      // TODO: implement
   }

   public void addAccount() {
      // TODO: implement
   }

   public void removeAccount() {
      // TODO: implement
   }

   public void addReservation() {
      // TODO: implement
   }

   public void removeReservation() {
      // TODO: implement
   }

   public void addCity() {
      // TODO: implement
   }

   public void removeCity() {
      // TODO: implement
   }

   public void addLocation() {
      // TODO: implement
   }

   public void removeLocation() {
      // TODO: implement
   }

   public void changeState(State newState) {
      // TODO: implement
   }


   public java.util.Collection<Account> getAccount() {
      if (account == null)
         account = new java.util.HashSet<Account>();
      return account;
   }

   public java.util.Iterator getIteratorAccount() {
      if (account == null)
         account = new java.util.HashSet<Account>();
      return account.iterator();
   }

   public void setAccount(java.util.Collection<Account> newAccount) {
      removeAllAccount();
      for (Iterator<Account> iter = newAccount.iterator(); iter.hasNext();)
         addAccount((Account)iter.next());
   }

   public void addAccount(Account newAccount) {
      if (newAccount == null)
         return;
      if (this.account == null)
         this.account = new java.util.HashSet<Account>();
      if (!this.account.contains(newAccount))
         this.account.add(newAccount);
   }

   public void removeAccount(Account oldAccount) {
      if (oldAccount == null)
         return;
      if (this.account != null)
         if (this.account.contains(oldAccount))
            this.account.remove(oldAccount);
   }

   public void removeAllAccount() {
      if (account != null)
         account.clear();
   }

   public java.util.Collection<City> getCity() {
      if (city == null)
         city = new java.util.HashSet<City>();
      return city;
   }

   public java.util.Iterator getIteratorCity() {
      if (city == null)
         city = new java.util.HashSet<City>();
      return city.iterator();
   }

   public void setCity(java.util.Collection<City> newCity) {
      removeAllCity();
      for (Iterator<City> iter = newCity.iterator(); iter.hasNext();)
         addCity((City)iter.next());
   }

   public void addCity(City newCity) {
      if (newCity == null)
         return;
      if (this.city == null)
         this.city = new java.util.HashSet<City>();
      if (!this.city.contains(newCity))
         this.city.add(newCity);
   }

   public void removeCity(City oldCity) {
      if (oldCity == null)
         return;
      if (this.city != null)
         if (this.city.contains(oldCity))
            this.city.remove(oldCity);
   }

   public void removeAllCity() {
      if (city != null)
         city.clear();
   }

   public java.util.Collection<Reservation> getReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation;
   }

   public java.util.Iterator getIteratorReservation() {
      if (reservation == null)
         reservation = new java.util.HashSet<Reservation>();
      return reservation.iterator();
   }

   public void setReservation(java.util.Collection<Reservation> newReservation) {
      removeAllReservation();
      for (Iterator<Reservation> iter = newReservation.iterator(); iter.hasNext();)
         addReservation((Reservation)iter.next());
   }

   public void addReservation(Reservation newReservation) {
      if (newReservation == null)
         return;
      if (this.reservation == null)
         this.reservation = new java.util.HashSet<Reservation>();
      if (!this.reservation.contains(newReservation))
         this.reservation.add(newReservation);
   }

   public void removeReservation(Reservation oldReservation) {
      if (oldReservation == null)
         return;
      if (this.reservation != null)
         if (this.reservation.contains(oldReservation))
            this.reservation.remove(oldReservation);
   }

   public void removeAllReservation() {
      if (reservation != null)
         reservation.clear();
   }

   public java.util.Collection<Guide> getGuide() {
      if (guide == null)
         guide = new java.util.HashSet<Guide>();
      return guide;
   }

   public java.util.Iterator getIteratorGuide() {
      if (guide == null)
         guide = new java.util.HashSet<Guide>();
      return guide.iterator();
   }

   public void setGuide(java.util.Collection<Guide> newGuide) {
      removeAllGuide();
      for (Iterator<Guide> iter = newGuide.iterator(); iter.hasNext();)
         addGuide((Guide)iter.next());
   }

   public void addGuide(Guide newGuide) {
      if (newGuide == null)
         return;
      if (this.guide == null)
         this.guide = new java.util.HashSet<Guide>();
      if (!this.guide.contains(newGuide))
         this.guide.add(newGuide);
   }

   public void removeGuide(Guide oldGuide) {
      if (oldGuide == null)
         return;
      if (this.guide != null)
         if (this.guide.contains(oldGuide))
            this.guide.remove(oldGuide);
   }

   public void removeAllGuide() {
      if (guide != null)
         guide.clear();
   }

   public java.util.Collection<Tourist> getTourist() {
      if (tourist == null)
         tourist = new java.util.HashSet<Tourist>();
      return tourist;
   }

   public java.util.Iterator getIteratorTourist() {
      if (tourist == null)
         tourist = new java.util.HashSet<Tourist>();
      return tourist.iterator();
   }

   public void setTourist(java.util.Collection<Tourist> newTourist) {
      removeAllTourist();
      for (Iterator<Tourist> iter = newTourist.iterator(); iter.hasNext();)
         addTourist((Tourist)iter.next());
   }

   public void addTourist(Tourist newTourist) {
      if (newTourist == null)
         return;
      if (this.tourist == null)
         this.tourist = new java.util.HashSet<Tourist>();
      if (!this.tourist.contains(newTourist))
         this.tourist.add(newTourist);
   }

   public void removeTourist(Tourist oldTourist) {
      if (oldTourist == null)
         return;
      if (this.tourist != null)
         if (this.tourist.contains(oldTourist))
            this.tourist.remove(oldTourist);
   }

   public void removeAllTourist() {
      if (tourist != null)
         tourist.clear();
   }

}