public class part5_overload {
    private String name;
    private int age;

    /* Constructor Overload
    * 1. Overload: same method name but have different type and/or different number params
    * 2. Can call the original constructor as pattern
    */
    public part5_overload(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overload with call
    public part5_overload(String name) {
        this(name, 0);
    }

    public part5_overload(int age) {
        this("Bella", age);
    }

    /* Method Overload */
    public void growOlder() {
        this.age += 1;
    }

    public void growOlder(int years) {
        this.age += years;
    }

    /* Method Override
     * Override: replace the original method
     */
    @Override
    public String toString() {
        return name + " (" + age + "years)";
    }
}
