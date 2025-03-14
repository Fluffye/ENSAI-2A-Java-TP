package fr.ensai.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Represents a ...
 */
public class Library {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private String name;
    private ArrayList<Item> items;
    private ArrayList<Loan> activeLoans;
    private ArrayList<Loan> completedLoans;

    /**
     * Constructs a new Library object
     * 
     * @param name  Nom de la library
     * @param items Liste des livres de la library
     */
    public Library(String name, ArrayList<Item> items, ArrayList<Loan> activeLoans, ArrayList<Loan> completedLoans) {
        this.name = name;
        this.items = items;
        this.activeLoans = activeLoans;
        this.completedLoans = completedLoans;
    }

    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

    /**
     * No parameter, return void
     */
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Il n'y a pas de livres dans la bibliothèque");
        } else {
            for (Item item : items) {
                System.out.println(item.toString());
            }
        }
    }

    /**
     * Ajoute un livre à items
     * A parameter, return void
     * 
     * @param item increment
     */
    public void addItem(Item item) {
        this.items.add(item);
    }

    /**
     * Loads items from a CSV file and adds them to the library.
     * 
     * @param filePath The path to the CSV file containing item data.
     * @throws IOException If there is an error reading the file, an
     *                     {@link IOException} will be thrown.
     */
    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String authorName = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(authorName);
                    if (author == null) {
                        author = new Author(authorName, 0, "Unknown");
                        authors.put(authorName, author);
                        System.out.println(author.toString());
                    }
                    Book book = new Book(isbn, title, author, year, pageCount);

                    this.addItem(book);
                }
            }
        } catch (

        IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

}