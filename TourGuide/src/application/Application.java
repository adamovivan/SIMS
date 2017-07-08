/***********************************************************************
 * Module:  Application.java
 * Author:  PC
 * Purpose: Defines the Class Application
 ***********************************************************************/
package application;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import controller.SignUpController;
import role.Guide;
import role.Tourist;
import state.State;
import tour.City;
import tour.Reservation;

public class Application {

	public static Application instance = null;

	public Collection<Account> accounts;
	public Collection<City> city;
	public Collection<Reservation> reservation;
	public Collection<Guide> guide;
	public Collection<Tourist> tourist;
	public State state = null;

	public static Application getInstance(){
		if(instance == null)
			instance = new Application();
		return instance;
	}

	Application(){
		accounts = new ArrayList<Account>();

		init();
	}

	// TODO add method to class diagram
	private void init(){
		ObjectMapper accountMapper = new ObjectMapper();

		try {
			accounts = accountMapper.readValue(new File("data/accounts.json"), Collection.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// if file is empty
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Account getAccountByUsername(String userName){
		for (Account a : accounts) {
			if(a.getUsername().equals(userName))
				return a;
	    }
		return null;
	}

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
		SignUpController.getInstance().clearUserPass();
	}

	public boolean checkLogin(String username, String password) {
		if(username.equals("") && password.equals(""))
			return true;
		return false;
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
		this.state.exit();
		this.state = newState;
		this.state.entry();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		this.state.entry();					// since it is initial state
	}

	public java.util.Collection<Account> getAccount() {
		if (accounts == null)
			accounts = new java.util.HashSet<Account>();
		return accounts;
	}

	public java.util.Iterator getIteratorAccount() {
		if (accounts == null)
			accounts = new java.util.HashSet<Account>();
		return accounts.iterator();
	}

	public void setAccount(java.util.Collection<Account> newAccount) {
		removeAllAccount();
		for (Iterator<Account> iter = newAccount.iterator(); iter.hasNext();)
			addAccount((Account) iter.next());
	}

	public void addAccount(Account newAccount) {
		if (newAccount == null)
			return;
		if (this.accounts == null)
			this.accounts = new java.util.HashSet<Account>();
		if (!this.accounts.contains(newAccount))
			this.accounts.add(newAccount);
	}

	public void removeAccount(Account oldAccount) {
		if (oldAccount == null)
			return;
		if (this.accounts != null)
			if (this.accounts.contains(oldAccount))
				this.accounts.remove(oldAccount);
	}

	public void removeAllAccount() {
		if (accounts != null)
			accounts.clear();
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
			addCity((City) iter.next());
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
			addReservation((Reservation) iter.next());
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
			addGuide((Guide) iter.next());
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
			addTourist((Tourist) iter.next());
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

	// TODO add method to class diagram
	public void dumpAccounts(){
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		try {

			mapper.writeValue(new File("data/accounts.json"), accounts);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}