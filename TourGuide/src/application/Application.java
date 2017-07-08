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
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import controller.SignUpController;
import role.Guide;
import role.Tourist;
import state.State;
import tour.City;
import tour.Reservation;
import tour.Tour;

public class Application {

	public static Application instance = null;

	public Collection<Account> accounts;
	public Collection<Tour> tours;
	public Collection<City> cities;
	public Collection<Reservation> reservations;
	public Collection<Guide> guides;
	public Collection<Tourist> tourists;
	public State state = null;

	public static Application getInstance(){
		if(instance == null)
			instance = new Application();
		return instance;
	}

	Application(){
		accounts = new ArrayList<Account>();
		tours = new ArrayList<Tour>();
		cities = new ArrayList<City>();
		reservations = new ArrayList<Reservation>();
		guides = new ArrayList<Guide>();
		tourists = new ArrayList<Tourist>();

		init();
	}

	// TODO add method to class diagram
	private void init(){
		ObjectMapper accountMapper = new ObjectMapper();

			try {
				accounts = accountMapper.readValue(new File("data/accounts.json"),  new TypeReference<List<Account>>(){});

			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				
				// if file is empty
				//e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		//readTours();

	}

	private void readTours() {
		ObjectMapper toursMapper = new ObjectMapper();
		ArrayList<Tour> temp = null;
		try {
			temp = (ArrayList<Tour>) toursMapper.readValue(new File("data/tours.json"), temp.getClass());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Object o : temp){
			Tour t = new Tour();
			t = toursMapper.convertValue(o, Tour.class);
			tours.add(t);
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
		if (cities == null)
			cities = new java.util.HashSet<City>();
		return cities;
	}

	public java.util.Iterator getIteratorCity() {
		if (cities == null)
			cities = new java.util.HashSet<City>();
		return cities.iterator();
	}

	public void setCity(java.util.Collection<City> newCity) {
		removeAllCity();
		for (Iterator<City> iter = newCity.iterator(); iter.hasNext();)
			addCity((City) iter.next());
	}

	public void addCity(City newCity) {
		if (newCity == null)
			return;
		if (this.cities == null)
			this.cities = new java.util.HashSet<City>();
		if (!this.cities.contains(newCity))
			this.cities.add(newCity);
	}

	public void removeCity(City oldCity) {
		if (oldCity == null)
			return;
		if (this.cities != null)
			if (this.cities.contains(oldCity))
				this.cities.remove(oldCity);
	}

	public void removeAllCity() {
		if (cities != null)
			cities.clear();
	}

	public java.util.Collection<Reservation> getReservation() {
		if (reservations == null)
			reservations = new java.util.HashSet<Reservation>();
		return reservations;
	}

	public java.util.Iterator getIteratorReservation() {
		if (reservations == null)
			reservations = new java.util.HashSet<Reservation>();
		return reservations.iterator();
	}

	public void setReservation(java.util.Collection<Reservation> newReservation) {
		removeAllReservation();
		for (Iterator<Reservation> iter = newReservation.iterator(); iter.hasNext();)
			addReservation((Reservation) iter.next());
	}

	public void addReservation(Reservation newReservation) {
		if (newReservation == null)
			return;
		if (this.reservations == null)
			this.reservations = new java.util.HashSet<Reservation>();
		if (!this.reservations.contains(newReservation))
			this.reservations.add(newReservation);
	}

	public void removeReservation(Reservation oldReservation) {
		if (oldReservation == null)
			return;
		if (this.reservations != null)
			if (this.reservations.contains(oldReservation))
				this.reservations.remove(oldReservation);
	}

	public void removeAllReservation() {
		if (reservations != null)
			reservations.clear();
	}

	public java.util.Collection<Guide> getGuide() {
		if (guides == null)
			guides = new java.util.HashSet<Guide>();
		return guides;
	}

	public java.util.Iterator getIteratorGuide() {
		if (guides == null)
			guides = new java.util.HashSet<Guide>();
		return guides.iterator();
	}

	public void setGuide(java.util.Collection<Guide> newGuide) {
		removeAllGuide();
		for (Iterator<Guide> iter = newGuide.iterator(); iter.hasNext();)
			addGuide((Guide) iter.next());
	}

	public void addGuide(Guide newGuide) {
		if (newGuide == null)
			return;
		if (this.guides == null)
			this.guides = new java.util.HashSet<Guide>();
		if (!this.guides.contains(newGuide))
			this.guides.add(newGuide);
	}

	public void removeGuide(Guide oldGuide) {
		if (oldGuide == null)
			return;
		if (this.guides != null)
			if (this.guides.contains(oldGuide))
				this.guides.remove(oldGuide);
	}

	public void removeAllGuide() {
		if (guides != null)
			guides.clear();
	}

	public java.util.Collection<Tourist> getTourist() {
		if (tourists == null)
			tourists = new java.util.HashSet<Tourist>();
		return tourists;
	}

	public java.util.Iterator getIteratorTourist() {
		if (tourists == null)
			tourists = new java.util.HashSet<Tourist>();
		return tourists.iterator();
	}

	public void setTourist(java.util.Collection<Tourist> newTourist) {
		removeAllTourist();
		for (Iterator<Tourist> iter = newTourist.iterator(); iter.hasNext();)
			addTourist((Tourist) iter.next());
	}

	public void addTourist(Tourist newTourist) {
		if (newTourist == null)
			return;
		if (this.tourists == null)
			this.tourists = new java.util.HashSet<Tourist>();
		if (!this.tourists.contains(newTourist))
			this.tourists.add(newTourist);
	}

	public void removeTourist(Tourist oldTourist) {
		if (oldTourist == null)
			return;
		if (this.tourists != null)
			if (this.tourists.contains(oldTourist))
				this.tourists.remove(oldTourist);
	}

	public void removeAllTourist() {
		if (tourists != null)
			tourists.clear();
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