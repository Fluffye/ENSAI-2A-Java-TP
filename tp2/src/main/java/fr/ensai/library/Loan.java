package fr.ensai.library;

import java.util.Date;

/**
 * Represents a Student
 */
public class Loan {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private Item item;
    private Student borrower;
    private Date startDate;
    private Date returnDate = null;

    public Loan(Item item, Student borrower, Date startDate, Date returnDate) {
        this.item = item;
        this.borrower = borrower;
        this.startDate = startDate;
        this.returnDate = returnDate;
    }

    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Item " + item + "Borrowed by " + borrower;
    }
}