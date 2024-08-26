public class Book {

    private String name;
    private String author;
    private String type;
    private int yearOfPublish;
    private int id;

    public Book() {

    }
    public Book(String name, String autor, String type, int yearOfPublish, int id) {
        this.name = name;
        this.author = autor;
        this.type = type;
        this.yearOfPublish = yearOfPublish;
        this.id = id;
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
}
