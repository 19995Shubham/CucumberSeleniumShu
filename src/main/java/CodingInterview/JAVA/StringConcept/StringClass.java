package CodingInterview.JAVA.StringConcept;

public class StringClass {

    // Crating object of string by String literal

    String s = "Welcome";
    String s1 = "Welcome";

    // here first object is created for s and stored in the string constant pool area
    // Then no other object created for s1 because same instance is already present but it refer s1 refer the same instance of


    // Creating object by new keyword
    String s2 = new String("Welcome");

    //in this case s2 will create new object in non-poll area(heap memory), and literal object in constant poll area




}
