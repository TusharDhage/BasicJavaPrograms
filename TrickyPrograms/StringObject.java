package JavaTrickyProblems;

//How many objects will be created? String object and string constant poll
public class StringObject {
    public static void main(String[] args) {
        String n1 = new String("Hello World"); //It will create two objects,
        // 1 in String Constant Pool and 1 in Heap so total is 2 object

        String s1 = "Hello World"; // it will create 1 obj only in SCP

        //let's take example

        String s2 = "Hello World";
        String s3 = "Hello World";
        String s4 = s2;
        // This will create only 1 object in string constant pool
        System.out.println(s2 == s3); //true
        System.out.println(s3 == s4); //true
        System.out.println(s4 == s2); //true
        //==================================================================

        String n2 = new String("Hello World");//It will create two objects,
        // 1 in String Constant Pool and 1 in Heap so total is 2 object
        String n3 = new String("Hello World");//It will create 1 objects in Heap memory.
        // In SCP Hello World is already present to it point to that n2
        System.out.println(n2==n3); //false  Because checking reference both are pointing to diff heap memory
        //it will do comparison basis of object reference not on basis of value

        System.out.println(n2 == s2); //false because n2 object present in heap memory and s2 in SCP,
        // it wll compare references only

        //Total 3 objects create because first string literal create hello world object in SCP
        // and then s2 with new keyword create object but hello world is already present in SCP
        // So it will create in heap so both n2 and n3 create obj in heap memory

    }
}
