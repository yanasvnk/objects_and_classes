import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author Author;
    private int publishYear;

    public Book (String bookName, Author author, int publishYear) {
        this.bookName = bookName;
        this.Author = author;
        this.publishYear = publishYear;
    }
    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return Author;
    }
    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public boolean equals (Object o) {
        if (this == 0) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(Author, book.Author);

        public int hashCode () {
            return Objects.hash(bookName, Author, publishYear);
        }
        public String toString () {
            return "Book{" +
                    "bookName='" + bookName + '\'' +
                    ",Author=" + Author +
                    ", publishYear=" + publishYear +
                    '}';
        }
    }
        }

