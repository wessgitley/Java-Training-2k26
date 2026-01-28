package Abstraction;

public class Warrior extends GameCharacter {
  private int strength;

  public Warrior(String name, int level, int health, int strength) {
    super(name, level, health);
    this.strength = strength;
  }

  @Override
  public void attack() {
    System.out.println(name + "swings sword for " + strength + "damage!");
  }

  @Override
  public void useSpecialAbility() {
    System.out.println(name + "uses fire strike!");
  }

}
