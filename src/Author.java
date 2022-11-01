import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String surname() {
        return surname;
    }

    public boolean equals(Object o) {
        if (this == 0) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname=" + surname + '\'' +
                '}';
    }
}

