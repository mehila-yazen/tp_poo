import java.util.TreeSet;

public class Animal {
    public String species;
    public int age;
    public int weight;
    public Health health;
    public TreeSet<Event> events;

    public Animal(String species, int age, int weight, Health health) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.health = health;
        this.events = new TreeSet<>();
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }
}
