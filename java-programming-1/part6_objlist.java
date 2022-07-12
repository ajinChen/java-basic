import java.util.ArrayList;

public class part6_objlist {

    /* Create a list as instance variable inside object */
    private String name;
    private int visitors;
    // 1. list as instance variable
    private ArrayList<Person> riding;

    public part6_objlist(String name, int visitors) {
        this.name = name;
        this.visitors = visitors;
        // 2. create instance for list
        this.riding = new ArrayList<>();
    }

    

}
