package project;

class Book {
    private String title;
    private String author;
    private int numberOfPages;


    /**
     * The method for setting the book title
     * - Length needs to be longer than 2
     * @param theTitle Title of the book
     */
    public void setTitle(final String theTitle) {
        this.title = theTitle;
    }

    public String getTitle() {
        return this.title;
    }


    public void setAuthor(final String theAuthor) {
        this.author = theAuthor;
    }

    public String getAuthor() {
        return this.author;
    }


    public void setPages(final int pageCount) {
        this.numberOfPages = pageCount;
    }

    public int getPages() {
        return this.numberOfPages;
    }

    public double calculateReadingTime() {
        final int avgWordsPerPage = 250;
        final double avgReadingSpeed = 200;
        System.out.println((numberOfPages*avgWordsPerPage)/avgReadingSpeed);
        return (numberOfPages*avgWordsPerPage)/avgReadingSpeed;
    }
}
