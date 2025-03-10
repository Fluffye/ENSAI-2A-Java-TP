package fr.ensai.library;

/**
 * Represents a Person
 */
public class Person {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private String name;
    private int age;

    /**
     * Constructs a new Person
     * 
     * @param name Nom
     * @param age  Âge
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

    public String getName() {
        return this.name;
    }

}