/**
 * Example class for Diagrams
 *
 * Pilot for a spaceship
 *
 * @author T.J.
 */
public class Pilot {
  private String name;
  private boolean usesTheForce;

  public Pilot(String name, boolean usesTheForce) {
    this.name = name;
    this.usesTheForce = usesTheForce;
  }

  public String getName() {
    return name;
  }

  public boolean isHero() {
    return usesTheForce;
  }

  public String toString() {
    return name + (usesTheForce ? " (who can use the force)" : "");
  }
}

