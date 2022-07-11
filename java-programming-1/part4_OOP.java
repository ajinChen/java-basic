/* Encapsulation Type
* 1. public, can be called and seem
* 2. private, can't be called and hidden
*/

/* Static Modifier (Global)
 * 1. static modifier can be used in method, function, variable
 * 2. once it creates, it will be assigned a storage and will not renew.
 * The static modifier indicates that the method in question does not belong to an object 
 * and thus cannot be used to access any variables that belong to objects.
 */

 /* Diff between int and Integer
  * 1. Integer / Double / Boolean / String are wrapping class 
  * 2. int / boolean / double are data type
  * 3. class is more powerful, which can call method: Integer.ofValue()
  */


public class part4_OOP {
    /* Instance Variables (Object Attributes) */
    private String name;
    private int age;

    /* Define a Constructor for Object (same as class name)*/
    public part4_OOP(String initialName, int initialAge) {
        this.age = initialAge;
        this.name = initialName;
    }

    /* Methods for Object (can call instance variable directly) */
    public void printPerson() {
        System.out.println(this.name + this.age);
    }

    public int returnAge() {
        return this.age;
    }

    /* Common Method in Object
     * 1. toString() can be called by sout on instance
     */
    public String toString() {
        return this.name + ", age " + this.age + " years";
    }

    /* Call Internal Method */
    public String printAgain() {
        return this.toString();
    }




    public static void main(String[] args) {
        
    }
}
