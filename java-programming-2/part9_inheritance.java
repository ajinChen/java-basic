import selfimpclass.Counter;
import selfimpclass.SuperCounter;

public class part9_inheritance {
    public static void main(String[] args) {
        
        /* Access Modifiers 
         * 1. private: it is visible only to the internal methods of this class and Subclasses will not see it
         * 2. public: it is visible to everyone
         * 3. protected: it is visible to Subclasses only and invisible to everything else
        */

        /* this & super
         * 1. this: this call can access any variable and method in this call
         * this() is calling constructor of this class
         * this.Method()
         * this.var
         * 2. super: super call can access variable and method setting in protected and public in subclasses
         * super() is calling constructor of superclass
         * super.Method()
         * super.var
         */

         /* Polymorphism 
          * Regardless of the type of the variable, the method that is executed is always chosen 
          * based on the actual type of the object. Objects are polymorphic, which means that they 
          * can be used via many different variable types. The executed method always relates to the 
          * actual type of the object. This phenomenon is called polymorphism.
          * (if you exec the this command in the superclass method, this is the actual current object)
          * student type can also be a Person / Object Type
          */
        // different types but has same behavior depend on the current instance
        SuperCounter superCounter = new SuperCounter();
        Counter counter = superCounter;
        Object object = superCounter;


          /* The Order of the Exec 
           * Find definition of call in current class, if not
           * Find definition of call in superclasses
           * Exec the superclass method, if there have other method
           * Find definition of method back to current class, if not
           * Find definition of method upper to superclasses
           * Loop for this process (always back to actually object)
          */

          /* Inheritance 
           * In Java, each class can inherit one class at most
           * SubClass should be a special case of the SuperClass, Like Animial -> Dog
           * SubClasses can get all method and variable of SuperClass
          */

          /* Abstract classes (Concept of variable and method definition)
           * An abstract class combines interfaces and inheritance. 
           * You cannot create instances of them — you can only create instances of subclasses of an 
           * abstract class.
           */



    }
}
