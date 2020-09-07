package observerdesignpattern;

import java.util.ArrayList;

/**
 * Represents the DEA who watches the cooks
 * 
 * @author Nghia Nguyen
 *
 */
public class DEA implements Observer {
  /**
   * The cook that the DEA observes
   */
  private Subject cook;
  /**
   * A list of locations that the DEA has seen a cook
   */
  private ArrayList<String> locations;
  /**
   * A continuous string of notes with descriptions on the sightings of the cooks
   */
  private String notes = "";

  /**
   * Creates a DEA which observes a cook, registers the DEA to the list of the cook's observers, and
   * creates a list of locations the cook was spotted
   * 
   * @param cook - the cook that the DEA observes
   */
  public DEA(Subject cook) {
    this.cook = cook;
    cook.registerObserver(this);
    locations = new ArrayList<String>();
  }

  /**
   * Updates the observer of the subject's location to the DEA's list of locations and adds the
   * description to the String of notes
   * 
   * @param location - where the subject was seen
   * @param description - description of that sighting
   */
  public void update(String location, String description) {
    locations.add(location);
    notes += description + "\n";
  }

  /**
   * @return a String with the DEA's log of all the sighting's location and the notes with all the
   *         descriptions of the where the cook was spotted
   */
  public String getLog() {
    String ret = "Locations:\n";
    for (String location : locations)
      ret += location + "\n";
    ret += "\n";
    ret += "Notes:\n" + notes;
    return ret;
  }
}
