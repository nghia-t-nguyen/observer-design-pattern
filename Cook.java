package observerdesignpattern;

import java.util.ArrayList;

/**
 * Represents a cook that makes meth
 * 
 * @author Nghia Nguyen
 *
 */
public class Cook implements Subject {
  /**
   * A list of observers that observes a cook
   */
  private ArrayList<Observer> observers;
  /**
   * name of the cook
   */
  private String name;

  /**
   * Creates a cook with a name and initializes its list of observers
   * 
   * @param name - stores the name of the Cook
   */
  public Cook(String name) {
    this.name = name;
    observers = new ArrayList<Observer>();
  }

  /**
   * Registers the observer to the Subject's list of observers
   * 
   * @param observer - who observes a subject
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }


  /**
   * Removes the observer from a subject's list of observers
   * 
   * @param observer - an observer to remove from the subject's list of observers
   */
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  /**
   * Notifies each observer to the subject of a sighting with location and a description of that
   * sighting
   * 
   * @param location - where the subject was seen
   * @param description - a description about that sighting
   */
  public void notifyObservers(String location, String description) {
    for (Observer observer : observers)
      observer.update(location, description);
  }

  /**
   * Called when the cook is seen, location and description is passed to notify the observers
   * 
   * @param location - where the subject was seen
   * @param description - a description of that sighting
   */
  public void enterSighting(String location, String description) {
    notifyObservers(location, description);
  }

  /**
   * @return the name of the cook
   */
  public String getName() {
    return name;
  }
}
