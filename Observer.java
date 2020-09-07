package observerdesignpattern;

/**
 * Represents an Observer who observes a subject
 * 
 * @author Nghia Nguyen
 *
 */
public interface Observer {
  /**
   * Updates the observer of the subject's location and description and adds it to their log
   * 
   * @param location - where the subject was seen
   * @param description - description of that sighting
   */
  public void update(String location, String description);

  /**
   * @return a String with the Observer's log of all the sighting's location and description of a
   *         subject
   */
  public String getLog();
}
