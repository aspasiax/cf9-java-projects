package gr.aueb.cf.cf9.part2oop.ch15.marker;

public class Product {
    private int id;
    private String title;

    public Product() {

    }

    public Product(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" + "id: " + id + ", title: '" + title + '\'' + '}';
    }
}
