package observerdesignpattern;

import java.util.ArrayList;

/**
 * Represents the Cartel which observes a cook
 * 
 * @author Nghia Nguyen
 *
 */
public class Cartel implements Observer {
  /**
   * The cook that the Cartel observes
   */
  private Subject cook;
  /**
   * A list of sightings that the Cartel has seen a cook
   */
  private ArrayList<Sighting> sightings;

  /**
   * Creates a cartel, registers him as an observer to a cook and initializes his list of sightings
   * 
   * @param cook - passes in the cook that the Cartel observes
   */
  public Cartel(Subject cook) {
    this.cook = cook;
    cook.registerObserver(this);
    sightings = new ArrayList<Sighting>();
  }

  /**
   * Adds a sighting of the cook's location and description to the Cartel's list of sightings
   * 
   * @param location - passes a String of the cook's location
   * @param description - passes in a String of the sighting's description
   */
  public void update(String location, String description) {
    sightings.add(new Sighting(location, description));
  }

  /**
   * @return a String with the locations of the Cartel's sighting followed by the description after
   *         each location in parentheses
   */
  public String getLog() {
    String ret = "";
    for (Sighting sighting : sightings)
      ret += sighting.getLocation() + " (" + sighting.getDetails() + ")\n";
    return ret;
  }
}
