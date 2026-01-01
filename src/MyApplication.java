import models.*;

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Employee("Nako", "Kinayatov", "Manager", 27000));
        people.add(new Employee("Adil", "Magzumov", "Engineer", 50000.00));

        people.add(new Student("Mine", "craft", 2.1));
        people.add(new Student("John", "Smith", 3.50));

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(p.toString() + " earns " + (p.getPayAmount()) + " tenge");
        }
    }

}