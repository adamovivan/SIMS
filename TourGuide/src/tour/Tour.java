/***********************************************************************
 * Module:  Tour.java
 * Author:  PC
 * Purpose: Defines the Class Tour
 ***********************************************************************/
package tour;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import role.Guide;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Tour {
	private int maxSpots;
	private int availableSpots;

	// TODO Add to class diagram
	private int upVotes;
	private int downVotes;
	public Guide guide;
	public String tourName;

	public Route route;
	public TourType tourType;

	public Tour() {
	}

	public Tour(String tourName, int maxSpots, int availableSpots, int upVotes, int downVotes, Guide guide, Route route,
			TourType tourType) {
		this.maxSpots = maxSpots;
		this.availableSpots = availableSpots;
		this.upVotes = upVotes;
		this.downVotes = downVotes;
		this.guide = guide;
		this.route = route;
		this.tourType = tourType;
		this.tourName = tourName;
	}


	public String getTourName() {
		return tourName;
	}

	public void setTourName(String tourName) {
		this.tourName = tourName;
	}

	public int getUpVotes() {
		return upVotes;
	}

	public void setUpVotes(int upVotes) {
		this.upVotes = upVotes;
	}

	public int getDownVotes() {
		return downVotes;
	}

	public void setDownVotes(int downVotes) {
		this.downVotes = downVotes;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public TourType getTourType() {
		return tourType;
	}

	public void setTourType(TourType tourType) {
		this.tourType = tourType;
	}

	public Guide getGuide() {
		return guide;
	}

	public void setGuide(Guide guide) {
		this.guide = guide;
	}

	public void showReservations() {
		// TODO: implement
	}

	public int getMaxSpots() {
		return maxSpots;
	}

	public void setMaxSpots(int newMaxSpots) {
		maxSpots = newMaxSpots;
	}

	public int getAvailableSpots() {
		return availableSpots;
	}

	public void setAvailableSpots(int newAvailableSpots) {
		availableSpots = newAvailableSpots;
	}

	@Override
	public String toString() {
		return "Tour [maxSpots=" + maxSpots + ", availableSpots=" + availableSpots + ", upVotes=" + upVotes
				+ ", downVotes=" + downVotes + ", guide=" + guide + ", tourName=" + tourName + ", route=" + route
				+ ", tourType=" + tourType + "]";
	}

	
}