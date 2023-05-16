import java.util.Objects;

public class Author {
    private final String authorName;

    public Author(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public String toString() {
        return "Имя автора = '" + authorName + '\'';
    }

    @Override
    public boolean equals(Object j) {
        Author author = (Author) j;
        if (this == j) {
            return true;
        }
        if (j == null || j.getClass() != getClass()) {
            return false;
        }
        return Objects.equals(getAuthorName(), author.getAuthorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName);
    }
}
