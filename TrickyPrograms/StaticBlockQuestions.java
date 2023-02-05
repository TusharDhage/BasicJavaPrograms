package JavaTrickyProblems;

public class StaticBlockQuestions {

   /* 1. Explain static block in java?

   Static block written using static keyword.
   static block (also called static clause) that can be used for static initialization of a class.
   This code inside the static block is executed only once: the first time the class is loaded into memory.

    if multiple static blocks are there then it will execute in order they are written

   public static void main(String[] args) {
       System.out.println("main method");
   }

   static{
       System.out.println("static method");
   }
   */
//=====================================================================================================
    /*2. How can we run java program without making object?
  by creating static method and static method can be called directly by method name or by classname.method name.
public static void main(String[] args) {
        System.out.println("main method");
        test();
    }
    static {
        System.out.println("static block");
    }
    public static void test(){
        System.out.println("static test method");
    }*/
 //=====================================================================================================
     /*3. Similarity and difference between static block and static method
   Static methods belong to the class and they will be loaded into the memory along with the class,
   you can invoke them without creating an object. (using the class name as reference).
    Whereas a static block is a block of code with a static keyword.
    In general, these are used to initialize the static members.*/
    // =====================================================================================================
   /* 4. How can we create object if we make constructor private?

   by creating static method and create object of the class in static block.
   // =====================================================================================================
            5. Is it possible to compile and run java program without main() method?
            yes it is possible
   // =====================================================================================================
            6. Can we initialize member variable  within static block?
            yes,

            String name; //Declare variable name
            static int age; // For static variable we don't need to create the object
            static{
            StaticBlockQuestions sb = new StaticBlockQuestions(); // obj creation for non-static variable
            el.name = "tushar"; // initialize variable
            age = 25; // direct assign because of static variable

            System.out.println(el.name + " " + age);
            }
*/

}
