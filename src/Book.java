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
        Book book = (Book) o;
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        return publishingYear == book.publishingYear
                && Objects.equals(nameBook, book.nameBook)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, publishingYear, author);
    }
}
