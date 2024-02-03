public class Book {
    private String title;
    private String pages;
    private String year;

    public Book(String title, String pages, String year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public String getPages() {
        return this.pages;
    }

    public String getYear() {
        return this.year;
    }

    public String printEverything() {
        return this.getTitle() + ", " + this.getPages() + " pages, " + this.getYear();
    }
}
