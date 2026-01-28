package Abstraction;

public abstract class GameCharacter {
  protected String name;
  protected int level;
  protected int health;

  public GameCharacter(String name, int level, int health) {
    this.name = name;
    this.level = level;
    this.health = health;
  }

  // common functionality
  public void takeDamage(int damage) {
    health -= damage;
    System.out.println(name + " takes " + damage + " damage.");
  }

  public boolean isAlive() {
    return health > 0;
  }

  // abstract methods for specific actions
  public abstract void attack();

  public abstract void useSpecialAbility();

  // concrete method
  public void displayStatus() {
    System.out.println(name + "Health: " + health + "Level: " + level);
  }
}
