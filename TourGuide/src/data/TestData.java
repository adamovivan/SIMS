package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import role.Guide;
import role.Person;
import tour.City;
import tour.Route;
import tour.Tour;
import tour.TourType;

public class TestData {

	// dumps tours
	public void dumpData(){
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		//make live objects
		ArrayList<Tour> testTours = new ArrayList<Tour>();

		// ROUTE NOT ADDED !!!
		testTours.add(new Tour("Super tura1",5,5,3,0,new Guide("motomaniac96", "somepass", "sexy", "C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person("Nikola","Tomic","165165165","S.Konstant.",new City("Smederevo", 11300))),new Route() , new TourType("Biking")));
		testTours.add(new Tour("Super tura2",5,5,3,0,new Guide("motomaniac96", "somepass", "sexy", "C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person("Nikola","Tomic","165165165","S.Konstant.",new City("Smederevo", 11300))),new Route() , new TourType("Biking")));
		testTours.add(new Tour("Super tura3",5,5,3,0,new Guide("motomaniac96", "somepass", "sexy", "C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person("Nikola","Tomic","165165165","S.Konstant.",new City("Smederevo", 11300))),new Route() , new TourType("Biking")));

		try {
			mapper.writeValue(new File("data/tours.json"), testTours);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test Data dump done!");
	}
}
