package fr.ensai.library;

/**
 * Represents a Item
 */
public class Item {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private String title;
    private int year;
    private int pageCount;

    /**
     * Constructs a new Item
     * 
     * @param title     Titre
     * @param year      Année de parution
     * @param pageCount Nombre de page
     */
    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

    public String getTitle() {
        return title;
    }
}