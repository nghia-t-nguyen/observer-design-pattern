package observerdesignpattern;

/**
 * Represents a sighting that a subject is seen
 * 
 * @author Nghia Nguyen
 *
 */
public class Sighting {
  /**
   * Location where the subject is seen
   */
  private String location;
  /**
   * The details about the sighting
   */
  private String details;

  /**
   * Creates a sighting in which a subject is seen
   * 
   * @param location - the location where the subject is spotted
   * @param details - the details about that sighting
   */
  public Sighting(String location, String details) {
    this.location = location;
    this.details = details;
  }

  /**
   * @return a String with the location for a sighting
   */
  public String getLocation() {
    return location;
  }

  /**
   * @return a String with the details for a sighting
   */
  public String getDetails() {
    return details;
  }

}
