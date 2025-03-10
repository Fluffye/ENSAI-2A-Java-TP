package fr.ensai.library;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Magazine playboy = new Magazine("issn", "issuenumber", "Playboy", 2021, 53);
        Magazine Epsilon = new Magazine("issn2", "issuenumber2", "Epsilon", 2023, 84);

        ArrayList<Item> items = new ArrayList<>();
        Library bibliotheque = new Library("Bibliothèque", items);
        bibliotheque.loadBooksFromCSV("books.csv");
        bibliotheque.addItem(Epsilon);
        bibliotheque.addItem(playboy);
        bibliotheque.displayItems();
    }
}