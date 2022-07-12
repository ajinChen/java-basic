public class part5_obj {
    
    /* Object can be seem as */

    // 1. variable
    private Person Ajin;

    // 2. parameter for method in different obj
    public boolean allowedToRide(Person person) {
        if (person.getAge() < 10) {
            return false;
        } else {
            return true;
        }
    }

    // 3. parameter for method in same obj
    public boolean comparePerson(part5_obj person) {
        return true;
    }

    // 4. comparing the equality of objects (contains also work)
    Person ajin = new Person("Ajin");
    Person Danyang = new Person("DanYang");
    boolean isSame = ajin.equals(Danyang);

    // 5. object as a return value
    public Person returnPerson() {
        return new Person("Ajin");
    }


}
