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

public class SortByTest {

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
		mainCtrl.currentlyShown
				.add(new Tour("Super tura 1", 5, 5, 6, 0,
						new Guide("motomaniac96", "somepass", "very handsome",
								"C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person(
										"Nikola", "Tomic", "165165165", "S.Konstant.", new City("Smederevo", 11300))),
						new Route(), new TourType("Biking")));
		mainCtrl.currentlyShown
				.add(new Tour("Super tura 2", 5, 5, 5, 0,
						new Guide("motomaniac96", "somepass", "very handsome",
								"C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person(
										"Nikola", "Tomic", "165165165", "S.Konstant.", new City("Smederevo", 11300))),
						new Route(), new TourType("Biking")));
		mainCtrl.currentlyShown
				.add(new Tour("Super tura 3", 5, 5, 2, 0,
						new Guide("motomaniac96", "somepass", "very handsome",
								"C://Users//Nikola//Desktop//SIMS//TourGuide//src//icons//user.jpg", new Person(
										"Nikola", "Tomic", "165165165", "S.Konstant.", new City("Smederevo", 11300))),
						new Route(), new TourType("Biking")));
	}

	@After
	public void tearDown() throws Exception {
		MainController.getInstance().currentlyShown.clear();
	}

	@Test
	public void test() {
		boolean sortNewestResult = true;
		boolean sortOldestResult = true;
		boolean sortMostPopularResult = true;

		// Sort by newest test
		MainController.getInstance().sortBy("Newest");
		if (MainController.getInstance().currentlyShown.get(0).getTourName().equals("Super tura 1")
				&& MainController.getInstance().currentlyShown.get(1).getTourName().equals("Super tura 2")
				&& MainController.getInstance().currentlyShown.get(2).getTourName().equals("Super tura 3")) {
			sortNewestResult = true;
		} else {
			sortNewestResult = false;
		}

		// Sort by oldest test
		MainController.getInstance().sortBy("Oldest");
		if (MainController.getInstance().currentlyShown.get(0).getTourName().equals("Super tura 3")
				&& MainController.getInstance().currentlyShown.get(1).getTourName().equals("Super tura 2")
				&& MainController.getInstance().currentlyShown.get(2).getTourName().equals("Super tura 1")) {
			sortOldestResult = true;
		} else {
			sortOldestResult = false;
		}

		// Sort by oldest test
		MainController.getInstance().sortBy("Most Popular");
		if (MainController.getInstance().currentlyShown.get(0).getTourName().equals("Super tura 1")
				&& MainController.getInstance().currentlyShown.get(1).getTourName().equals("Super tura 2")
				&& MainController.getInstance().currentlyShown.get(2).getTourName().equals("Super tura 3")) {
			sortMostPopularResult = true;
		} else {
			sortMostPopularResult = false;
		}

		Assert.assertEquals(true, sortNewestResult);
		Assert.assertEquals(true, sortOldestResult);
		Assert.assertEquals(true, sortMostPopularResult);

	}

}
