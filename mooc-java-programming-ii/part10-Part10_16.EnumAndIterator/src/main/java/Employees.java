import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
        .forEach(person -> this.employees.add(person));
    }

    public void print() {
        Iterator<Person> employees = this.employees.iterator();
        employees.forEachRemaining(employee -> System.out.println(employee));
    }

    public void print(Education education) {
        Iterator<Person> employees = this.employees.iterator();
        while(employees.hasNext()) {
            Person person = employees.next();
            if(person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> employees = this.employees.iterator();
        while(employees.hasNext()) {
            if(employees.next().getEducation() == education) {
                employees.remove();
            }
        }
    }
    
}
