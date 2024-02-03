import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if(this.isEmpty()) {
            return null;
        }
        int shortestCurrent = this.getPersons().get(0).getHeight();
        Person shortestPerson = this.getPersons().get(0);
        for(Person person: this.getPersons()) {
            if(person.getHeight() < shortestCurrent) {
                shortestCurrent = person.getHeight();
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if(this.isEmpty()) {
            return null;
        }
        return this.getPersons().remove(this.getPersons().indexOf(this.shortest()));
    }
    
}
