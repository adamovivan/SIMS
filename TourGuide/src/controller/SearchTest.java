package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import role.Guide;
import role.Person;
import tour.City;
import tour.Route;
import tour.Tour;
import tour.TourType;

public class SearchTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		MainController mainCtrl = MainController.getInstance();
		mainCtrl.currentlyShown.clear();
		mainCtrl.currentlyShown.add(new Tour("Super tura1",5,5,3,0,new Guide("motomaniac96", "somepass", "very handsome", "C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person("Nikola","Tomic","165165165","S.Konstant.",new City("Smederevo", 11300))),new Route() , new TourType("Biking")));
		mainCtrl.currentlyShown.add(new Tour("Super tura2",5,5,3,0,new Guide("motomaniac96", "somepass", "very handsome", "C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person("Nikola","Tomic","165165165","S.Konstant.",new City("Smederevo", 11300))),new Route() , new TourType("Biking")));
		mainCtrl.currentlyShown.add(new Tour("Super tura3",5,5,3,0,new Guide("motomaniac96", "somepass", "very handsome", "C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person("Nikola","Tomic","165165165","S.Konstant.",new City("Smederevo", 11300))),new Route() , new TourType("Biking")));

	}

	@After
	public void tearDown() throws Exception {
		MainController.getInstance().currentlyShown.clear();
	}

	@Test
	public void test() {
		MainController.getInstance().currentlyShown.toString();

		// search by tour name
		int actual1 = MainController.getInstance().search("1", "Tour", "Newest");
		Assert.assertEquals(1 , actual1);

		// search by guide username
		int actual2 = MainController.getInstance().search("moto", "Guide", "Newest");
		Assert.assertEquals(3 , actual2);

	}

}
