package fr.ensai.library;

/**
 * Represents a Student
 */
public class Student extends Person {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Student
     * 
     * @param academicYear    anné
     * @param isClassDelegate Classe délégué ou non
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------
    @Override
    public String toString() {
        return "Student " + super.getName();
    }
}