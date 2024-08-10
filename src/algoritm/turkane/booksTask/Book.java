package algoritm.turkane.booksTask;

import java.util.StringJoiner;

public class Book {
    private String name;
    private int pageCount;

    public Book(String name, int pageCount) {
        this.name = name;
        this.pageCount = pageCount;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPage(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("page=" + pageCount)
                .toString();
    }
}
