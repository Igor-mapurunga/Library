public class Book {

    private String name;
    private String author;
    private String type;
    private int yearOfPublish;
    private int id;
    private String publisher;

    public Book() {

    }
    public Book(String name, String autor, String type, int yearOfPublish, int id, String publisher) {
        this.name = name;
        this.author = autor;
        this.type = type;
        this.yearOfPublish = yearOfPublish;
        this.id = id;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", id=" + id +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
