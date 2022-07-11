// import Person;
import java.util.ArrayList;

public class part4_objInList {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John"));
        persons.add(new Person("Martin"));

        // Iterate all elems
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
