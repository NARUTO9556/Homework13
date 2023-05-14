import java.util.Objects;

public class Book {
    private final String nameBook;
    private int publishingYear;
    private final Author author;

    public Book(String nameBook, int publishingYear, Author author) {
        this.nameBook = nameBook;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Название книги = '" + nameBook + '\'' + ", Год публикации = " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        if (getPublishingYear() != book.getPublishingYear()) {
            return false;
        }
        if (!getNameBook().equals(book.getNameBook())) {
            return false;
        }
        return getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        int result = getNameBook().hashCode();
        result = 31 * result + getPublishingYear();
        result = 31 * result + getAuthor().hashCode();
        return result;
    }
}
