package observerdesignpattern;

/**
 * Represents a subject which is observed by Observers
 * 
 * @author Nghia Nguyen
 *
 */
public interface Subject {
  /**
   * Registers the observer that observes a subject, typically to the subject's list of observers
   * 
   * @param observer - who observes a subject
   */
  public void registerObserver(Observer observer);

  /**
   * Removes the observer from a subject's list of observers
   * 
   * @param observer - an observer to remove from the subject's list of observers
   */
  public void removeObserver(Observer observer);

  /**
   * Notifies each observer to the subject of a sighting with location and a description of that
   * sighting
   * 
   * @param location - where the subject was seen
   * @param description - a description about that sighting
   */
  public void notifyObservers(String location, String description);
}
