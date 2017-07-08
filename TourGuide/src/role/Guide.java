/***********************************************************************
 * Module:  Guide.java
 * Author:  PC
 * Purpose: Defines the Class Guide
 ***********************************************************************/
package role;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import application.Account;
import tour.Route;
import tour.Tour;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Guide extends Account {
	
	public Guide(){}

	public Guide(String username, String password, String description, String picture, Person person) {
		super(username, password, description, picture, person);
		// TODO Auto-generated constructor stub
	}

	public java.util.Collection<Route> route;
	
	public void makeTour(ArrayList<Tour> tours) {
		// TODO: implement
	}

	public void defineRoute(ArrayList<Route> routes) {
		// TODO: implement
	}

	public java.util.Collection<Route> getRoute() {
		if (route == null)
			route = new java.util.HashSet<Route>();
		return route;
	}

	public void setRoute(java.util.Collection<Route> newRoute) {
		removeAllRoute();
		for (java.util.Iterator iter = newRoute.iterator(); iter.hasNext();)
			addRoute((Route) iter.next());
	}

	public void addRoute(Route newRoute) {
		if (newRoute == null)
			return;
		if (this.route == null)
			this.route = new java.util.HashSet<Route>();
		if (!this.route.contains(newRoute))
			this.route.add(newRoute);
	}

	public void removeRoute(Route oldRoute) {
		if (oldRoute == null)
			return;
		if (this.route != null)
			if (this.route.contains(oldRoute))
				this.route.remove(oldRoute);
	}

	public void removeAllRoute() {
		if (route != null)
			route.clear();
	}

	@Override
	public String toString() {
		return "Guide [route=" + route + "]";
	}

	
}