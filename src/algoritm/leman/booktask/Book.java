package algoritm.leman.booktask;

class Book {
    private String name;
    private int pageCount;

    public Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }
}